package com.dzmitrykavalioum.task01.entity;

public class Refrigerator extends Appliance {

    private int powerConsumption;
    private double weight;
    private double height;
    private double width;
    private double freezerCapacity;
    private double overallCapacity;


    public Refrigerator() {

    }

    public Refrigerator(int powerConsumption,
                        double weight, double freezerCapacity,
                        double overallCapacity, double height, double width, double price) {
        super(price);
        this.powerConsumption = powerConsumption;
        this.weight = weight;
        this.height = height;
        this.width = width;
        this.freezerCapacity = freezerCapacity;
        this.overallCapacity = overallCapacity;

    }

    public Refrigerator(RefrigeratorBuilder refrigeratorBuilder) {
        super(refrigeratorBuilder.price);
        this.powerConsumption = refrigeratorBuilder.powerConsumption;
        this.weight = refrigeratorBuilder.weight;
        this.height = refrigeratorBuilder.height;
        this.width = refrigeratorBuilder.width;
        this.freezerCapacity = refrigeratorBuilder.freezerCapacity;
        this.overallCapacity = refrigeratorBuilder.overallCapacity;
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

    public double getFreezerCapacity() {
        return freezerCapacity;
    }

    public void setFreezerCapacity(double freezerCapacity) {
        this.freezerCapacity = freezerCapacity;
    }

    public double getOverallCapacity() {
        return overallCapacity;
    }

    public void setOverallCapacity(double overallCapacity) {
        this.overallCapacity = overallCapacity;
    }


    @Override
    public String toString() {
        return "Refrigerator \tpower consuption: " + powerConsumption +
                "\tweight: " + weight + "\tfreezer capacity: " + freezerCapacity +
                "\toverall capacity: " + overallCapacity + "\theight: " + height +
                "\twidth: " + width + "\tprice: " + getPrice();
    }

    public static class RefrigeratorBuilder {
        public double freezerCapacity;
        public double overallCapacity;
        public double width;
        public double height;
        public double weight;
        public int powerConsumption;
        public double price;

        public RefrigeratorBuilder(String[] arrProperties) {
            this.powerConsumption = Integer.parseInt(arrProperties[1]);
            this.weight = Double.parseDouble(arrProperties[3]);
            this.freezerCapacity = Double.parseDouble(arrProperties[5]);
            this.overallCapacity = Double.parseDouble(arrProperties[7]);
            this.width = Double.parseDouble(arrProperties[9]);
            this.height = Double.parseDouble(arrProperties[11]);
            this.price = Double.parseDouble(arrProperties[13]);
        }

        public Refrigerator build() {
            return new Refrigerator(this);
        }
    }
}
