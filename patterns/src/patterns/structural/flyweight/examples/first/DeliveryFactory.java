package patterns.structural.flyweight.examples.first;

import java.util.HashMap;
import java.util.Map;

/**
 * Created to generate instances of flyweights (Intrinsics states)
 */
public class DeliveryFactory {

    static Map<String, DeliveryFlyweight> cache = new HashMap<>();

    static DeliveryFlyweight createLocation(
            String intrinsicsStreet,
            String intrinsicsCity
    ) {

        var flyweight = cache.get(intrinsicsStreet);

        if(flyweight != null) return flyweight;

        flyweight = new DeliveryLocation(intrinsicsStreet, intrinsicsCity);
        cache.put(intrinsicsStreet, flyweight);

        return flyweight;

    }

}
