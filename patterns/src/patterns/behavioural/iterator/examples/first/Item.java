package patterns.behavioural.iterator.examples.first;

public class Item {

    private ItemType type;
    private final String name;

    public Item(ItemType type, String name) {
        this.type = type;
        this.name = name;
    }

    public ItemType getType() {
        return type;
    }

    public void setType(ItemType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Item{");
        sb.append("name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
