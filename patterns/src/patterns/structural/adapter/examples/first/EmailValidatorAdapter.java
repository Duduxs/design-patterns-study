package patterns.structural.adapter.examples.first;

/**
 * Only this class depends on external library.
 */
public class EmailValidatorAdapter implements EmailValidatorProtocol {

    private final SomeExternalDependencyForEmailValidator emailValidator;

    public EmailValidatorAdapter(SomeExternalDependencyForEmailValidator emailValidator) {
        this.emailValidator = emailValidator;
    }

    @Override
    public boolean isValid(String email) {
        return emailValidator.isValid(email);
    }
}
