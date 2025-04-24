/**
 * rectangle information
 * @author Yuyen
 */

class Rectangle {

    private double length;
    private double width;

    /**
     * @param length the length of the rectangle
     * @param width the width of the rectangle
     */

    public Rectangle() {
        this.length = 4.0;
        this.width = 8.0;
    }

    /**
     * 
     * @param length1 the new length that will replace the original length
     */
    public Rectangle(double length1) {
        this.length = length1;
        this.width = 8.0;
    }

    /**
     * 
     * @param length2 the new length that will replace the original length
     * @param width2 the new width that will replace the original width
     */
    public Rectangle(double length2, double width2){
        this.length = length2;
        this.width = width2;
    }

    /**
     * 
     * @return the length of the rectangle
     */
    public double getLength() {
        return this.length;
    }

    /**
     * 
     * @return the width of the rectangle
     */
    public double getWidth() {
        return this.width;
    }
}