package patterns.behavioural.template_method.examples.first;

public class Main {

    public static void main(String[] args) {

        var methodOne = new SubtleMethod();

        var thief = new Thief(methodOne);

        thief.steal();

        System.out.println();

        thief.changeMethodInRuntime(new HitAndRunMethod());

        thief.steal();


    }

}
