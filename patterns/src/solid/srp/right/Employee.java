package solid.srp.right;

/** Agora, ao invés de termos essa classe tendo vários métodos
 * Podemos deixá-la abstrata, implementando sua própria responsabilidade. **/
public abstract class Employee {

    protected String name;
}

class Driver extends Employee {
   public void drive() {
        System.out.println(super.name + " is driving");
    }
}

class Cook extends Employee {
    public void cook() { System.out.println(super.name+ " is cooking!"); }
}

class Gardner extends Employee {
    public void prune() { System.out.println(super.name + " is pruning"); }
}

class Paintor extends Employee {
    public void paint() {
        System.out.println(super.name + " is painting too!");
    }
}
