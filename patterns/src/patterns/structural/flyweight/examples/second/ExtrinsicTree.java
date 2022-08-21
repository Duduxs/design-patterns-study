package patterns.structural.flyweight.examples.second;


import java.awt.*;

/**
 * it contains a unique state for each tree
 */
public class ExtrinsicTree {

    private int x;
    private int y;
    private IntrinsicTreeType type;

    public ExtrinsicTree(int x, int y, IntrinsicTreeType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public void draw(Graphics g) {
        type.draw(g, x, y);
    }

}
