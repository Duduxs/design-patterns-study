package patterns.behavioural.template_method.examples.second;

import java.util.Arrays;
import java.util.function.Supplier;

public enum NetworkEnum {

    FACEBOOK(Facebook::new, 1),
    TWITTER(Twitter::new, 2);


    private Supplier<Network> constructor;
    private Integer value;

    NetworkEnum(Supplier<Network> constructor, Integer value) {
        this.constructor = constructor;
        this.value = value;
    }

    public Supplier<Network> getConstructor() {
        return constructor;
    }

    public static NetworkEnum getByValue(Integer value) {
        return Arrays.stream(NetworkEnum.values())
                .filter(v -> v.value.equals(value))
                .findFirst()
                .orElseThrow(IllegalAccessError::new);
    }

}
