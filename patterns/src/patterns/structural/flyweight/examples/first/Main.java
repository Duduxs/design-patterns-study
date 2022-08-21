package patterns.structural.flyweight.examples.first;

public class Main {

    public static void main(String[] args) {

        var context = new DeliveryContext();

        System.out.println("====================Deliveries====================");
        context.delivery("Rua Governador", "Olinda", "Eduardo", 404);
        context.delivery("Rua Governador", "Olinda", "João", 901);
        context.delivery("Rua Governador", "Olinda", "Maria", 404);
        context.delivery("Rua maravilha", "Recife", "Rafa", 930);
        context.delivery("Rua Manual Bandeira", "Aguazinha", "Fafá", 122);
        context.delivery("Rua Governador", "Olinda", "João", 901);
        context.delivery("Rua maravilha", "Recife", "Mathias", 2021);
        context.delivery("Rua maravilha", "Recife", "Paulo", 101);        
        context.delivery("Rua Manual Bandeira", "Aguazinha", "Matheus", 1023);
        context.delivery("Rua Governador", "Olinda", "Nycolas", 9090);
        System.out.println("====================Deliveries====================");

        System.out.println("Total of streets and city created in memory: " + DeliveryFactory.cache.size());
        System.out.println();
        System.out.println("Above is the total of cities and street values that were created\n");

        DeliveryFactory.cache.values().forEach(System.out::println);

    }
}
