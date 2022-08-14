package patterns.structural.façade.examples.first;

public class Main {

    /**
     * In this example the facade simplifies the communication between
     * the video converter complex structure and the client code.
     * My facade created here offer a unique class with only a method that
     * handles all the complexity of setting up the correct classes in the framework and
     * retrieving the result in a correct format.
     */
    public static void main(String[] args) throws InterruptedException {

        var facade = new VideoConversionFacade();

        facade.convertVideo("eduardo.mp4", "ogg");

    }

}
