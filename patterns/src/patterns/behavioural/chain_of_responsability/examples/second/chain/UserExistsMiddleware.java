package patterns.behavioural.chain_of_responsability.examples.second.chain;


import patterns.behavioural.chain_of_responsability.examples.second.Server;

public class UserExistsMiddleware extends Middleware {

    private Server server;

    public UserExistsMiddleware(Server server) {
        this.server = server;
    }

    @Override
    public boolean check(String email, String password) {

        if(!server.hasEmail(email)) {
            System.out.println("The email is not registered!");
            return false;
        }

        if(!server.isValidPassword(email, password)) {
            System.out.println("Wrong password!");
            return false;
        }


        return checkNext(email, password);

    }
}
