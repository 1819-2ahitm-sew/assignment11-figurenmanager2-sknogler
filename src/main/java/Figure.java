abstract class Figure {

    static Square square = new Square(5, 20, 20);
    static Rectangle rect = new Rectangle(2, 3, 20, 20);
    static Circle circle = new Circle(3, 20, 20);
    static Ellipse ellipse = new Ellipse(3, 2, 20, 20);

    static Figure[] figures = {square, rect, circle, ellipse};

    abstract public double area();

    abstract public double circumfence();

    abstract public String output();

}
