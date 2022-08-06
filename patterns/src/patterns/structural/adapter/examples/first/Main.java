package patterns.structural.adapter.examples.first;

/**
 * Client code
 */
public class Main {

    public static void main(String[] args) {

        /*

        var emailValidator = new SomeExternalDependencyForEmailValidator();

        var email = "eduarddoj1@gmail.com";

        if(emailValidator.isValid(email)) {
            System.out.println("Email é válido!");
        } else {
            System.out.println("Email é inválido!");
        }

        The third library worked? Yes! But if you some day needs to change this library 4 another?
        Imagine that the library that you used before, now won't get any new update.
        Or you just found any that is much simpler and much faster and much better.

        Well, the answer is quite simple... You'll need to change in every local of your app
        that uses the old email validator library.

        In personal projects this is bullshit, becazz you only need to change the points.
        But in serious projects with a lot of code and a lot of external dependencies through the code
        (Like empresarial project ;p) You'll get some headache by changing all the points and making sure
        that you do not break anything else.

        Pattern adapter comes to change this problem (and many others... see my google docs for more details)

        */

        // Make this dependency injection more readable and better using a DI container.
        EmailValidatorProtocol emailValidator = new EmailValidatorAdapter(new SomeExternalDependencyForEmailValidator());

        System.out.println(emailValidator.isValid("eduardo@hotmail.com"));
        System.out.println(emailValidator.isValid("eduardohotmail.com"));

    }
}
