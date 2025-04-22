class Chair{
    
    private int legs;
    private String material;

    public Chair() {
        this.legs = 4;
        this.material = "wood";
    }

    public Chair(int legs1) {
        this.legs = legs1;
        this.material = "wood";
    }

    public Chair(int legs2, String material2) {
        this.legs = legs2;
        this.material = material2;
    }

    public int getLegs() {
        return this.legs;
    }

    public String getMaterial() {
        return this.material;
    }
}