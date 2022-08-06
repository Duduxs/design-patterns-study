package patterns.structural.adapter.examples.first;

/**
 * Simple class that comes when you install 4 example some third party jar.
 * Well, this class do some email validations
 */
public class SomeExternalDependencyForEmailValidator {

    boolean isValid(String email) {
        return email.contains("@");
    }
}
