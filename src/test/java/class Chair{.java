/**
 * chair information
 * @author Yuyen
 */

class Chair{
    
    private int legs;
    private String material;

    /**
     * a set of information of the chair
     * @param legs the amount of legs the chair has
     * @param material the material that the chair is made of
     */

    public Chair() {
        this.legs = 4;
        this.material = "wood";
    }

    /**
     * @param legs1 the amount of legs that will replace its original number of legs
     */
    public Chair(int legs1) {
        this.legs = legs1;
        this.material = "wood";
    }

    /**
     * 2 variables of the chair
     * @param legs2 the new amount of legs that will replace the original value of legs
     * @param material2 the new material that will replace the original material
     */
    public Chair(int legs2, String material2) {
        this.legs = legs2;
        this.material = material2;
    }

    /**
     * 
     * @return the amount of legs
     */
    public int getLegs() {
        return this.legs;
    }

    /**
     * 
     * @return the material of the chair
     */
    public String getMaterial() {
        return this.material;
    }
}