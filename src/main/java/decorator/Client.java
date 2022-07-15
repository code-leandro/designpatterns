package decorator;

public class Client {

    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape circleBorderRed = new RedShapeDecorator(circle);
        Shape circleBorderRedAndFillGreen = new GreenFillDecorator(circleBorderRed);
        System.out.println("Circle with border red and filled green");
        circleBorderRedAndFillGreen.draw();

        System.out.println("---------------------");

        Shape rectangle = new Rectangle();
        Shape rectangleWithBorderRed = new RedShapeDecorator(rectangle);
        System.out.println("Rectangle with border red");
        rectangleWithBorderRed.draw();
    }
}
