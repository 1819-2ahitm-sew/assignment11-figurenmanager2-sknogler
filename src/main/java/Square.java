class Square extends Figure{

    //region GETTER AND SETTER
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
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

    public Square(int length, int x, int y) {
        this.length = length;
        this.x = x;
        this.y = y;
    }

    private int length;
    private int x;
    private int y;



    @Override
    public double area() {
        return length * length;
    }

    @Override
    public double circumfence() {
        return 4 * length;
    }

    @Override
    public String output() {
        return "Quadrat mit Seitenlänge " + this.length + ":\nFläche -> " + area() + "\nUmfang -> " + circumfence();
    }

}
