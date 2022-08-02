package patterns.creational.abstractFactory.examples.second;

/**
 * Aqui podemos ver uma família de produtos relacionados com várias variantes.
 * Essas mesmas variantes precisam estar separadas dentro do CF.
 * Ou seja, precisamos usar o abstract factory para criar objetos de mobília indívidulas para
 * que eles combinem com outros objetos da MESMA família. Além disso, você quer mudar o código existente
 * quando precisar adicionar uma nova variante de uma forma fácil e escalável.
 */

public interface Couch { void sit(); }

class ArtCouch implements Couch { @Override public void sit() { System.out.println("You're sitting on art couch!");}}
class VictorianCouch implements Couch { @Override public void sit() { System.out.println("You're sitting on victorian couch!");}}
class ModernCouch implements Couch { @Override public void sit() { System.out.println("You're sitting on modern couch!");}}

interface Chair { boolean hasLegs(); }

class ArtChair implements Chair { @Override public boolean hasLegs() { return false; } }
class VictorianChair implements Chair { @Override public boolean hasLegs() { return true; } }
class ModernChair implements Chair { @Override public boolean hasLegs() { return false; } }

interface Table { }

class ArtTable implements Table {}
class VictorianTable implements Table {}
class ModernTable implements Table {}
