package patterns.creational.abstractFactory.examples.second;

/**
 * Agora digamos que o cliente quer que produza uma cadeira. O mesmo não precisa estar ciente
 * da classe fábrica, e também nem se importa que tipo de cadeira ele receberá. Seja ela moderna,
 * victoriana ou artística. Ele tratará todas as cadeiras de uma mesma maneira através de uma interface
 * em comum, no nosso caso a interface Chair. E também, seja qual for a variante de cadeira retornada
 * ela sempre irá combinar com o tipo de sofá ou mesa de centro produzido pelo mesmo objeto fábrica.
 */
public class Main {

    public static void main(String[] args) {
        /**
         * O cliente configurou a aplicação e optou por receber mobílias do tipo artistíca.
         * Então, vamos devolver para ele um conjunto completo artístico?
         */

        //Elementos abstratos
        var factory = new ArtFurnitureFactory();

        var chair = factory.createChair();
        var table = factory.createTable();
        var couch = factory.createCouch();

        //Execução de alguma lógica de negócio com retornos específicos aqui.
        System.out.println(chair.hasLegs());
        couch.sit();
    }
}
