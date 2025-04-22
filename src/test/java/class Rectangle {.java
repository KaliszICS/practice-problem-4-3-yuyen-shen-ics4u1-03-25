class Rectangle {

    private double length;
    private double width;

    public Rectangle() {
        this.length = 4.0;
        this.width = 8.0;
    }

    public Rectangle(double length1) {
        this.length = length1;
        this.width = 8.0;
    }

    public Rectangle(double length2, double width2){
        this.length = length2;
        this.width = width2;
    }

    public double getLength() {
        return this.length;
    }

    public double getWidth() {
        return this.width;
    }
}