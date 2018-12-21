class Ellipse extends Figure{

    //region GETTER AND SETTER
    public double getMainAxis() {
        return mainAxis;
    }

    public void setMainAxis(double mainAxis) {
        this.mainAxis = mainAxis;
    }

    public double getSecondAxis() {
        return secondAxis;
    }

    public void setSecondAxis(double secondAxis) {
        this.secondAxis = secondAxis;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    //endregion

    private double mainAxis;
    private double secondAxis;
    private double x;
    private double y;

    public Ellipse(double mainAxis, double secondAxis, double x, double y) {
        this.mainAxis = mainAxis;
        this.secondAxis = secondAxis;
        this.x = x;
        this.y = y;
    }

    @Override
    public double area() {
        return Math.PI * mainAxis * secondAxis;
    }

    @Override
    public double circumfence() {
        return Math.PI * (mainAxis + secondAxis) * ( 1 + 3 *((mainAxis - secondAxis) / (mainAxis + secondAxis) * (mainAxis - secondAxis) / (mainAxis + secondAxis)) / (10 + Math.sqrt(4 - 3 * ((mainAxis - secondAxis) / (mainAxis + secondAxis) * (mainAxis - secondAxis) / (mainAxis + secondAxis)))));
    }

    @Override
    public String output() {
        return "Ellipse mit Hauptachse " + this.mainAxis + " und Nebenachse " + this.secondAxis + ":\nFläche > " + area() + "\nUmfang > " + circumfence();
    }

}
