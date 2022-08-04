package patterns.structural.composite.examples.second;

public interface StringValidatorComponent {

    boolean isValid();

    String getErrorMessage();

    default void throwIfInvalid() {
        if (!isValid()) throw new NotValidException(getErrorMessage());
    }

}
