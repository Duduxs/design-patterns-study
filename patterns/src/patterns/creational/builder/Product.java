package patterns.creational.builder;

// Isso aqui não é uma classe complexa, criei o Builder dessa forma para facilitar a compreensão do padrão
public class Product {

    private String id;
    private Double price;

    public Product(final String id, final Double price) {
        this.id = id;
        this.price = price;
    }

    public static class Builder {
        private String id;
        private Double price;

        public Builder withId(final String id) {
            this.id = id;
            return this;
        }

        public Builder withPrice(final Double price) {
            this.price = price;
            return this;
        }

        public Product build(){ return new Product(this.id, this.price); }
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", price=" + price +
                '}';
    }
}
