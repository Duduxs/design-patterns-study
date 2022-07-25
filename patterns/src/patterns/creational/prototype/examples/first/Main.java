package patterns.creational.prototype.examples.first;

public class Main {
    /**
     * DEEP VS SHALLOW CLONE
     * Deep: Guarda o valor do objeto copiado e uma vez copiado não muda, pois ele copia e cria um novo na heap sem apontar.
     * Shallow: Reflete as mudanças do novo objeto copiado no objeto original, pois ele copia e aponta na heap.
     */
    public static void main(String[] args) {
        var product1 = new Product("1", 2.0, new Address("Rua 1", 1));
        var product2 = product1.clone();

        product2.setId("2");
        product2.setPrice(5.0);

        /*
         * Veja que mesmo eu trocando o endereço, após já ter passado a copia de todo o product1 para o product2,
         * não irá fazer com que o product2 tenha o novo endereço abaixo, pois foi uma DEEP COPY.
         */
        product1.setAddress(new Address("Rua 34", 2));

        System.out.println(product1);
        System.out.println(product2);

        System.out.println(product1 == product2);

    }
}