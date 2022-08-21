package patterns.structural.flyweight.examples.second;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;

public class ForestContext extends JFrame {

    private Collection<ExtrinsicTree> trees = new ArrayList<>();

    public void plantTree(int x, int y, String name, Color color, String otherTreeData) {

        IntrinsicTreeType type = IntrinsicTreeFactory.getTreeType(name, color, otherTreeData);

        trees.add(new ExtrinsicTree(x, y, type));

    }

    @Override
    public void paint(Graphics graphics) {
        for (ExtrinsicTree tree : trees) {
            tree.draw(graphics);
        }
    }

}
