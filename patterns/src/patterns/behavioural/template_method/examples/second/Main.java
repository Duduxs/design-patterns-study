package patterns.behavioural.template_method.examples.second;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Network network;

        System.out.print("Input user name: ");
        String username = reader.readLine();
        System.out.print("Input password: ");
        String password = reader.readLine();

        System.out.println("Input message: ");
        String message = reader.readLine();

        var sb = new StringBuilder();

        sb.append("\nChoose social network for posting message.\n");
        sb.append("1 - Facebook\n");
        sb.append("2 - Twitter");

        System.out.println(sb);
        int choice = Integer.parseInt(reader.readLine());

        network = NetworkEnum.getByValue(choice).getConstructor().get();

        network.setUsername(username);
        network.setPassword(password);

        network.post(message);

    }

}
