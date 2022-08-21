package patterns.structural.flyweight.examples.first;

public class DeliveryLocation implements DeliveryFlyweight {

    private final String intrinsicsStreet;

    private final String intrinsicsCity;

    public DeliveryLocation(){
        this.intrinsicsStreet = null;
        this.intrinsicsCity = null;
    }

    public DeliveryLocation(String intrinsicsStreet, String intrinsicsCity) {
        this.intrinsicsStreet = intrinsicsStreet;
        this.intrinsicsCity = intrinsicsCity;
    }

    /**
     * Extrinsic state (clientName and houseNumber) they'll always change
     *
     */
    @Override
    public void delivery(String clientName, Integer houseNumber) {
        System.out.printf("Delivering to %s in houseNumber %d", clientName, houseNumber);
        System.out.println(" Street: " + intrinsicsStreet + " City: " + intrinsicsCity);
        System.out.println();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("DeliveryLocation{");
        sb.append("intrinsicsStreet='").append(intrinsicsStreet).append('\'');
        sb.append(", intrinsicsCity='").append(intrinsicsCity).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
