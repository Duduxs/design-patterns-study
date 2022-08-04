package patterns.structural.composite.examples.second.leafs;

import patterns.structural.composite.examples.second.StringValidatorComponent;

public record StringMinLengthLeaf(
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
