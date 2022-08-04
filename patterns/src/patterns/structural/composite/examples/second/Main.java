package patterns.structural.composite.examples.second;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

class NotValidException extends RuntimeException {
    NotValidException(String message) {
        super(message);
    }
}

interface StringValidatorComponent {

    boolean isValid();

    String getErrorMessage();

    default void throwIfInvalid() {
        if (!isValid()) throw new NotValidException(getErrorMessage());
    }

}

record StringMaxLengthLeaf(
        String value,
        String errorMessage
) implements StringValidatorComponent {

    public StringMaxLengthLeaf(String value) {
        this(value, "String can't have more than fifteen characters");
    }

    @Override
    public String getErrorMessage() {
        return errorMessage;
    }

    @Override
    public boolean isValid() {
        return value.length() <= 15;
    }

}

record StringMinLengthLeaf(
        String value,
        String errorMessage
) implements StringValidatorComponent {

    public StringMinLengthLeaf(String value) {
        this(value, "String can't have less than one character");
    }

    @Override
    public String getErrorMessage() {
        return errorMessage;
    }

    @Override
    public boolean isValid() {
        return value.length() >= 1;
    }

}

class StringComposite implements StringValidatorComponent {

    private final Collection<StringValidatorComponent> validators = new ArrayList<>();

    public StringComposite(StringValidatorComponent... validators) {
        this.validators.addAll(List.of(validators));
    }

    @Override
    public boolean isValid() {
        for (var validator : validators) {
            if (!validator.isValid()) {
                return false;
            }
        }

        return true;

    }

    @Override
    public String getErrorMessage() {
        return validators.stream()
                .map(StringValidatorComponent::getErrorMessage)
                .collect(Collectors.joining(", "));
    }

    @Override
    public void throwIfInvalid() {
        for (var validator : validators) {
            if (!validator.isValid()) {
                validator.throwIfInvalid();
            }
        }
    }
}


public class Main {

    public static void main(String[] args) {

        var input = "My input";

        var maxLengthValidator = new StringMaxLengthLeaf(input);
        var minLengthValidator = new StringMinLengthLeaf(input);

        System.out.println("\nCalling individually");
        System.out.println(maxLengthValidator.isValid());
        System.out.println("Default message: " + maxLengthValidator.errorMessage());
        System.out.println(minLengthValidator.isValid());
        System.out.println("Default message: " + minLengthValidator.errorMessage());

        var lengthCompositeValidator = new StringComposite(minLengthValidator, maxLengthValidator);

        System.out.println("\nCalling them with composite");
        System.out.println(lengthCompositeValidator.isValid());
        System.out.println("Default messages: " + lengthCompositeValidator.getErrorMessage());

        var anotherInput = "";

        maxLengthValidator = new StringMaxLengthLeaf(anotherInput);
        minLengthValidator = new StringMinLengthLeaf(anotherInput);

        lengthCompositeValidator = new StringComposite(minLengthValidator, maxLengthValidator);

        System.out.println("\nNow, isn't valid the input!");
        System.out.println(lengthCompositeValidator.isValid());
        lengthCompositeValidator.throwIfInvalid();
    }
}
