package patterns.structural.composite.examples.first;

class ProductLeaf extends ProductComponent {

    public String name;
    public Float price;

    public ProductLeaf() { super(); }

    public ProductLeaf(String name, Float price) {
        this.name = name;
        this.price = price;
    }

    @Override
    Float getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ProductLeaf{");
        sb.append("name='").append(name).append('\'');
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }
}
