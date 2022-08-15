package patterns.structural.proxy.examples.first;

/**
 * Proxy (virtual) example.
 *
 */
public class Main {

    public static void main(String[] args) {

        var user = new AdminUser("Eduardo", "edudev");

        /**
         * Without proxy this code reaches in 12 seconds of duration.
         */
        user.getAddresses().forEach(System.out::println);
        user.getAddresses().forEach(System.out::println);


        var proxyUser = new SystemUserProxy("Eduardo", "edudev");


        System.out.println();
        System.out.println("Now with proxy");
        System.out.println();

        /**
         * With proxy only takes six seconds.
         */
        proxyUser.getAddresses().forEach(System.out::println);
        proxyUser.getAddresses().forEach(System.out::println);
        proxyUser.getAddresses().forEach(System.out::println);


    }

}
