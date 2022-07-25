package patterns.creational.prototype.examples.second;

// EXEMPLO COM DEEP COPY

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
          Veja que mesmo eu trocando o endereço do produto 1 o produto 2 que é uma cópia desse protótipo
          não teve também seu endereço trocado para o nome "Rua trocada". Se você averiguar o copy agora do
          Product verá que eu também uso o copy do Address para criar uma nova cópia de um endereço qualquer
          na HEAP e fazer o Product copiado apontar somente para ela. Se deve porque o Address agora também tem
          o seu método clone.
          Isso é chamado de Deep Copy.
         */
        product1.getAddress().setName("Rua trocada");

        System.out.println(product1);
        System.out.println(product2);
        // FALSE! Os produtos NÃO apontam para as mesmas instâncias de address na heap!
        System.out.println(product1.getAddress() == product2.getAddress());

    }
}