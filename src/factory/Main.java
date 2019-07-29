package factory;

public class Main {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        Shape triangle = factory.getShape("Triangle");
        triangle.draw();

        Shape circle = factory.getShape("Circle");
        circle.draw();

        Shape square = factory.getShape("square");
        square.draw();
    }
}
