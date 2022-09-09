package patterns.behavioural.iterator.examples.first;

import java.util.ArrayList;
import java.util.List;

public class TreasureChest {

    private final List<Item> items;

    public TreasureChest() {
        this.items = List.of(
                new Item(ItemType.POTION, "Potion of courage"),
                new Item(ItemType.RING, "Ring of shadows"),
                new Item(ItemType.POTION, "Potion of wisdom"),
                new Item(ItemType.POTION, "Potion of blood"),
                new Item(ItemType.WEAPON, "Sword of silver +1"),
                new Item(ItemType.POTION, "Potion of rust"),
                new Item(ItemType.POTION, "Potion of healing"),
                new Item(ItemType.RING, "Ring of armor"),
                new Item(ItemType.WEAPON, "Steel halberd"),
                new Item(ItemType.WEAPON, "Dagger of poision")
        );
    }

    public Iterator<Item> iterator(ItemType itemType) {
        return new TreasureChestItemIterator(this, itemType);
    }

    public List<Item> getItems() {
        return new ArrayList<>(items);
    }
}
