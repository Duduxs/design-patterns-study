package patterns.structural.composite.examples.second.leafs;

import patterns.structural.composite.examples.second.StringValidatorComponent;

public record StringInLowercaseLeaf(
        String value,
        String errorMessage
) implements StringValidatorComponent {

    public StringInLowercaseLeaf(String value) {
        this(value, "String must be in lowercase");
    }

    @Override
    public String getErrorMessage() {
        return errorMessage;
    }

    @Override
    public boolean isValid() {
        return value.toLowerCase().equals(value);
    }

}
