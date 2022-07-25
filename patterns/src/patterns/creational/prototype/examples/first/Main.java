package patterns.creational.prototype.examples.first;

// EXEMPLO COM SHALLOW COPY

/**
 * DEEP VS SHALLOW COPY
 *
 * Deep: Não reflete as mudanças de valores nas dependências do objeto copiado no objeto original, pois ele copia também
 * as dependências do objeto original, sempre criando novos na heap e fazendo as cópias apontarem para eles.
 * É uma cópia mais pesada, porém mais eficaz.
 *
 * Shallow: Reflete as mudanças de valores nas dependências do objeto copiado no objeto original, pois ele copia e
 * aponta as dependências do objeto copiado para as mesmas instâncias das dependências do objeto original na heap.
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
        // TRUE! Os produtos apontam para as mesmas instâncias de address na heap!
        System.out.println(product1.getAddress() == product2.getAddress());

    }
}