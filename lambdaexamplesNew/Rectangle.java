package lambdaexamples;

abstract class Shape {
    protected int sides;

    public Shape(int sides) {
        this.sides = sides;
    }

    public abstract void draw();
}

public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        super(4); // Invoke the constructor of the abstract class
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle with width " + width + " and height " + height);
    }

}

class Main
{
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(4,55);
        System.out.println(rectangle.sides);

    }
}