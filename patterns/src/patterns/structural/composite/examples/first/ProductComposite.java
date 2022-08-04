package patterns.structural.composite.examples.first;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ProductComposite extends ProductComponent {

    public Collection<ProductComponent> children = new ArrayList<>();

    @Override
    void add(ProductComponent ...productComponent) {
        this.children.addAll(List.of(productComponent));
    }

    @Override
    void remove(ProductComponent productComponent) {
        this.children.remove(productComponent);
    }

    @Override
    Float getPrice() {
        return children.stream()
                .map(ProductComponent::getPrice)
                .reduce(0F, Float::sum);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ProductComposite{");
        sb.append("children=").append(children);
        sb.append('}');
        return sb.toString();
    }
}
