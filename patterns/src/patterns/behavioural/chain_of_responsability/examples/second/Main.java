package patterns.behavioural.chain_of_responsability.examples.second;

import patterns.behavioural.chain_of_responsability.examples.second.chain.Middleware;
import patterns.behavioural.chain_of_responsability.examples.second.chain.RoleCheckMiddleware;
import patterns.behavioural.chain_of_responsability.examples.second.chain.ThrottlingMiddleware;
import patterns.behavioural.chain_of_responsability.examples.second.chain.UserExistsMiddleware;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Server server;

    private static void init() {

        server = new Server();

        server.register("admin@example.com", "admin_pass");
        server.register("user@example.com", "user_pass");

        Middleware middleware = Middleware.link(
                new ThrottlingMiddleware(2),
                new UserExistsMiddleware(server),
                new RoleCheckMiddleware()
        );

        server.setMiddleware(middleware);

    }


    public static void main(String[] args) throws IOException {

        init();

        boolean success;

        do {

            System.out.println("Enter email:  ");
            String email = reader.readLine();

            System.out.println("Enter password: ");
            String password = reader.readLine();

            success = server.login(email, password);

        } while(!success);

    }

}
