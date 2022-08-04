package patterns.structural.composite.examples.second.leafs;

import patterns.structural.composite.examples.second.StringValidatorComponent;

public record StringHasSpecialCharactersLeaf(
        String value,
        String errorMessage
) implements StringValidatorComponent {

    public StringHasSpecialCharactersLeaf(String value) {
        this(value, "String can't have special characters");
    }

    @Override
    public String getErrorMessage() {
        return errorMessage;
    }

    @Override
    public boolean isValid() {
        return !value.contains("@") || !value.contains("!") || !value.contains("?");
    }

}
