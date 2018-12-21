class Rectangle extends Figure{

    //region GETTER AND SETTER
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    //endregion

    private int length;
    private int width;
    private int x;
    private int y;

    public Rectangle(int length, int width, int x, int y) {
        this.length = length;
        this.width = width;
        this.x = x;
        this.y = y;
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double circumfence() {
        return 2 * (length + width);
    }

    @Override
    public String output() {
        return "Rechteck mit Länge " + this.length + " und Breite " + this.width + ":\nFläche -> " + area() + "\nUmfang -> " + circumfence();
    }

}
