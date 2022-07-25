package patterns.creational.prototype.examples.first;

// EXEMPLO COM SHALLOW COPY

/**
 * DEEP VS SHALLOW COPY
 * Deep: Guarda o valor do objeto copiado e uma vez copiado não muda, pois ele copia e cria um novo na heap sem apontar.
 * Shallow: Reflete as mudanças do novo objeto copiado no objeto original, pois ele copia e aponta na heap.
 */
public class Main {

    public static void main(String[] args) {

        var product1 = new Product("1", 2.0, new Address("Rua 1", 1));
        var product2 = product1.clone();

        product2.setId("2");
        product2.setPrice(5.0);

        /*
         * Troquei o endereço somente do product1, entretanto como não foi criado um novo address
         * no método clone() do Product, ou seja, as duas novas instâncias na heap de Product
         * Apontam pra mesma instância de address na memória, então, se eu trocar o endereço de
         * product1 o product2 também terá esse mesmo endereço, e o inverso também será verdade.
         * Isso é chamado de Shallow Copy.
         */
        product1.getAddress().setName("Rua trocada");

        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product1 == product2);

    }
}