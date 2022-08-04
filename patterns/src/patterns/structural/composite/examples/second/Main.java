package patterns.structural.composite.examples.second;

import patterns.structural.composite.examples.second.composites.StringComposite;
import patterns.structural.composite.examples.second.leafs.StringHasSpecialCharactersLeaf;
import patterns.structural.composite.examples.second.leafs.StringInLowercaseLeaf;
import patterns.structural.composite.examples.second.leafs.StringMaxLengthLeaf;
import patterns.structural.composite.examples.second.leafs.StringMinLengthLeaf;




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

        input = "";

        maxLengthValidator = new StringMaxLengthLeaf(input);
        minLengthValidator = new StringMinLengthLeaf(input);

        lengthCompositeValidator = new StringComposite(minLengthValidator, maxLengthValidator);

        System.out.println("\nNow, isn't valid the input!");
        System.out.println(lengthCompositeValidator.isValid());

        try{
            lengthCompositeValidator.throwIfInvalid();
        } catch(RuntimeException ex) {
            System.out.println("\nThrowed an exception: " + ex.getLocalizedMessage());
        }

        System.out.println();
        System.out.println("--------------------");

        input = "other value";

        var lowerCaseValidator = new StringInLowercaseLeaf(input);
        var specialCharactersValidator = new StringHasSpecialCharactersLeaf(input);

        maxLengthValidator = new StringMaxLengthLeaf(input);
        minLengthValidator = new StringMinLengthLeaf(input);

        lengthCompositeValidator = new StringComposite(minLengthValidator, maxLengthValidator);

        var contentCompositeValidator = new StringComposite(lowerCaseValidator, specialCharactersValidator);

        var completeCompositeValidator = new StringComposite(contentCompositeValidator, lengthCompositeValidator);

        /**
         * It's valid!
         */
        System.out.println("Your string is valid? [" + completeCompositeValidator.isValid() + "]");
        completeCompositeValidator.throwIfInvalid();

    }
}
