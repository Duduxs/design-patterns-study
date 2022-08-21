package patterns.structural.flyweight.examples.first;

public class DeliveryContext {

    public void delivery(
            String intrinsicsStreet,
            String intrinsicsCity,
            String clientName,
            Integer houseNumber
    ) {

        var flyweight = DeliveryFactory.createLocation(intrinsicsStreet, intrinsicsCity);

        flyweight.delivery(clientName, houseNumber);

    }

}
