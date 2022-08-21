package patterns.structural.flyweight.examples.second;

import java.awt.*;

import static java.awt.Color.BLACK;

/**
 * It has shared state among a lot of trees.
 */
public class IntrinsicTreeType {

    private String name;
    private Color color;
    private String otherTreeData;

    public IntrinsicTreeType(String name, Color color, String otherTreeData) {
        this.name = name;
        this.color = color;
        this.otherTreeData = otherTreeData;
    }

    /**
     * Extrinsic state will always come from parameters instead of putting it on class as class' properties.
     */
    public void draw(Graphics g, int x, int y) {
        g.setColor(BLACK);
        g.fillRect(x - 1, y, 3, 5);
        g.setColor(color);
        g.fillOval(x - 5, y - 10, 10, 10);
    }

}
