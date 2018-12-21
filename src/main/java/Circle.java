class Circle extends Figure{

    //region GETTER AND SETTER
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    //endregion

    private double radius;
    private int x;
    private int y;

    public Circle(double radius, int x, int y) {
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double circumfence() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String output() {
        return "Kreis mit Radius " + this.radius + ":\nFläche -> " + area() + "\nUmfang -> " + circumfence();
    }

}
