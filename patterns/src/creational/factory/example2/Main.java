package creational.factory.example2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        List<Vehicle> vehicles = new ArrayList<>();
        //Caso eu mude o nome da classe Car eu teria que trocar aqui e em todos os pontos que usasse o 'new'.
        Car car1 = new Car("Toyota");
        Car car2 = new Car("Honda");
        Car car3 = new Car("Classic");

        var carFactory = new CarFactoryImpl();
        var bikeFactory = new BikeFactoryImpl();

        //Agora com o querido var + a factory, trocou o nome não precisa trocar em nenhum ponto a não ser na factory.
        //Isso ajuda centralizando o ponto de criação com possíveis lógicas de negócio dentro e somente dentro da factory.
        var car4 = carFactory.createVehicle("Novo carrão");
        var bike1 = bikeFactory.createVehicle();

        Stream.of(car1, car2, car3, car4, bike1).peek(vehicles::add).forEach(System.out::println);

        System.out.println();
        carFactory.pickup("Moto dahora", "Eduardo");
    }

}
