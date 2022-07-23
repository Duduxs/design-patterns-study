package patterns.creational.builder.examples.first;

/**
 * Note que temos uma estrutura simples por questões didáticas.
 */
class Person {
    String name;
    Integer age;

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class PersonBuilder {

    private Person person = new Person();

    public void newPerson() {
        this.person = new Person();
    }

    public PersonBuilder setName(String name) {
        this.person.name = name;
        return this;
    }

    public PersonBuilder setAge(Integer age) {
        this.person.age = age;
        return this;
    }

    public Person getResult() {
        return this.person;
    }
}

public class Main {

    public static void main(String[] args) {

        var builder = new PersonBuilder();

        var person = builder.setName("Eduardo J")
                .setAge(21)
                .getResult();

        System.out.println(person);

    }
}
