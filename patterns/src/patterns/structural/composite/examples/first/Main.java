package patterns.structural.composite.examples.first;

public class Main {

    public static void main(String[] args) {

        var pen = new ProductLeaf("Caneta", 3F);
        var pencil = new ProductLeaf("Lápis", 1F);
        var eraser = new ProductLeaf("Borracha", 2F);

        var schoolBox = new ProductComposite();
        schoolBox.add(pen, pencil, eraser);

        System.out.println(schoolBox);
        System.out.println(schoolBox.getPrice());
        System.out.println();

        var tablet = new ProductLeaf("Tablet", 2000F);
        var kindle = new ProductLeaf("Kindle", 300F);
        var smartphone = new ProductLeaf("Smartphone", 2500F);

        var modernBox = new ProductComposite();

        modernBox.add(tablet, kindle, smartphone, schoolBox);

        System.out.println(modernBox);
        System.out.println(modernBox.getPrice());
        System.out.println();

    }
}
