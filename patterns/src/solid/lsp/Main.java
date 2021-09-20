package solid.lsp;

/**
 * Esse principio diz uma classe base deve poder ser substituída pela sua classe derivada.
 * "Se nada como um pato, voa como um pato, porém precisa de baterias, provavelmente você possui um problema de abstração."
 *
 */
public class Main {

    public static void main(String[] args) {
        var quad = new Square();
        quad.setHeight(10);
        quad.setWidth(5);

        getRectangleArea(quad);
    }

    public static void getRectangleArea(Rectangle rectangle) {
        /** Aqui o cálculo se dá por 5 * 5
         * E não por 10 * 5 como colocado acima
         * ferindo então o príncipio de Liskov, pois a classe derivada não foi capaz de substituir
         * totalmente a classe base, isso é, devido a comportamentos de cálculo de área presentes em
         * formas geométricas, apesar de na geometria um quadrado ser um retângulo aqui no mundo da programação
         * essa abstração não faz muito sentido. Deveríamos isolar cada regra de calcular área em classes distintas,
         * sem herança.
         * **/
        System.out.println("Cálculo da área do retangulo");
        System.out.println(rectangle.height + " " + rectangle.width);
        System.out.println(rectangle.area());
    }

}

class Rectangle {

    public double height;

    public double width;

    public Double area() {
        return height * width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
class Square extends Rectangle {

    @Override
    public void setHeight(double height) {
        super.height = (super.width = height);
    }

    @Override
    public void setWidth(double width) {
        super.width = (super.height = width);
    }
}