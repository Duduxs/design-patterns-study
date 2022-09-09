package patterns.behavioural.iterator.examples.first;

import static patterns.behavioural.iterator.examples.first.ItemType.*;

public class Main {

    private static final TreasureChest TREASURE_CHEST = new TreasureChest();

    private static void demonstrateTreasureChestIteratorForType(ItemType itemType) {

        System.out.println("Item iterator for ItemType " + itemType + ": ");

        var itemIterator = TREASURE_CHEST.iterator(itemType);

        while (itemIterator.hasNext()) {
            System.out.println(itemIterator.next().toString());
        }

    }

    public static void main(String[] args) {
        demonstrateTreasureChestIteratorForType(RING);
        demonstrateTreasureChestIteratorForType(POTION);
        demonstrateTreasureChestIteratorForType(WEAPON);
        demonstrateTreasureChestIteratorForType(ANY);
    }


}
