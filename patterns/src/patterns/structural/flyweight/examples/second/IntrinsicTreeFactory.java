package patterns.structural.flyweight.examples.second;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

/**
 * It encapsulates the complexity of create the flyweight and also cache flyweights already created in RAM.
 *
 */
public class IntrinsicTreeFactory {

    static Map<String, IntrinsicTreeType> cache = new HashMap<>();

    public static IntrinsicTreeType getTreeType(String name, Color color, String otherTreeData) {
        IntrinsicTreeType result = cache.get(name);

        if(result == null) {
            result = new IntrinsicTreeType(name, color, otherTreeData);
            cache.put(name, result);
        }

        return result;

    }

}
