package com.dzmitrykavalioum.task01.entity;

public class Oven extends Appliance {

    private int powerConsumption;
    private double weight;
    private double capacity;
    private double depth;
    private double height;
    private double width;

    public Oven() {
    }

    public Oven(int powerConsumption, double weight, double capacity, double depth, double height, double width, double price) {
        super(price);
        this.powerConsumption = powerConsumption;
        this.weight = weight;
        this.capacity = capacity;
        this.depth = depth;
        this.height = height;
        this.width = width;

    }

    public Oven(OvenBuilder ovenBuilder) {
        super(ovenBuilder.price);
        this.powerConsumption = ovenBuilder.powerConsumption;
        this.weight = ovenBuilder.weight;
        this.capacity = ovenBuilder.capacity;
        this.depth = ovenBuilder.depth;
        this.height = ovenBuilder.height;
        this.width = ovenBuilder.width;

    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }


    //Oven : POWER_CONSUMPTION=1000, WEIGHT=10, CAPACITY=32, DEPTH=60, HEIGHT=45.5, WIDTH=59.5
    @Override
    public String toString() {
        return "Oven \t power consumption: " + powerConsumption +
                "\tweight: " + weight +
                "\tcapacity: " + capacity +
                "\tdepth: " + depth +
                "\theight: " + height +
                "\twidth: " + width +
                "\tprice: " + getPrice();
    }

    public static class OvenBuilder {
        public double capacity;
        public double depth;
        public double width;
        public double height;
        public double weight;
        public int powerConsumption;
        public double price;

        public OvenBuilder(String[] allDescription) {
            this.powerConsumption = Integer.parseInt(allDescription[1]);
            this.weight = Double.parseDouble(allDescription[3]);
            this.capacity = Double.parseDouble(allDescription[5]);
            this.depth = Double.parseDouble(allDescription[7]);
            this.height = Double.parseDouble(allDescription[9]);
            this.width = Double.parseDouble(allDescription[11]);
            this.price = Double.parseDouble(allDescription[13]);
        }

        public Oven build() {
            return new Oven(this);
        }
    }
}
