package solid.lsp.exampleTwo.wrong;

/**
 * Esse principio diz uma classe base deve poder ser substituída pela suas classes derivadas.
 * Ou seja, ferimos esse princípio quando implementamos uma abstração de forma errada, nem tudo da para se abstrair!
 * Funções que utilizam de classes base devem conseguir utilizar objetos das classes filhas sem precisar conhecer-las.
 * A chave para entender esse princípio é pensar mais nos processos que usam as subclasses do que as próprias subclasses.
 */
abstract class Apartment {
    int squareFootage;
    int numberOfBedrooms;

    abstract void setSquareFootage(int squareFootage);
}

class PenthouseSuite extends Apartment {
    public PenthouseSuite() { numberOfBedrooms = 4; }
    public void setSquareFootage(int squareFootage) { this.squareFootage = squareFootage; }
}

//Estúdio por definição NUNCA poderá ter um quarto.
class Studio extends Apartment {
    public Studio() { numberOfBedrooms = 0; }
    public void setSquareFootage(int squareFootage) { this.squareFootage = squareFootage; }
}

/**
 * Estou precisando colocar um IF para não adicionar sem querer um quarto a um Studio.
 * Aqui tbm tenho violação do OSP... Quer dizer que surgiu outra subfilha de Apartment que a squareFootage sempre terá que
 * ser 0, então eu precisaria adicionar outro if pra não aumentar a metragem quadrada dessa nova subfilha sem querer.
 * E com isso a ApartmentUpgrader sempre estaria sendo modificada, pois temos um sério problema de abstração.
*/
class ApartmentUpgrader {
    public void upgrade(Apartment apartment) {
        apartment.squareFootage += 40;

        if (apartment.getClass() != Studio.class)
            apartment.numberOfBedrooms += 1;
    }
}