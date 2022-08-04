package patterns.structural.composite.examples.second.leafs;

import patterns.structural.composite.examples.second.StringValidatorComponent;

public record StringMaxLengthLeaf(
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
