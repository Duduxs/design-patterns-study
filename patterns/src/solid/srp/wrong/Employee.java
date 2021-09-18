package solid.srp.wrong;

/** Essa classe faz muita coisa, ferindo o principio da responsabilidade única. **/
public class Employee {

    private String name;

    public void cook() {
        System.out.println(this.name + " is cooking!");
    }

    public void prune() { System.out.println(this.name + " is pruning"); }

    public void paint() {
        System.out.println(this.name + " is painting too!");
    }

    public void drive() {
        System.out.println(this.name + " is driving");
    }
}
