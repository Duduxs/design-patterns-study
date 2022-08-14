package patterns.structural.composite.examples.second.composites;

import patterns.structural.composite.examples.second.StringValidatorComponent;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class StringComposite implements StringValidatorComponent {
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

