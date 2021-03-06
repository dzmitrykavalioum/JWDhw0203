package com.dzmitrykavalioum.task01.entity;

public class TabletPc extends Appliance {
    private int batteryCapacity;
    private double displayInches;
    private int memoryRom;
    private int flashMemoryCapacity;
    private String color;


    public TabletPc() {

    }

    public TabletPc(int batteryCapacity, double displayInches, int memoryRom, int flashMemoryCapacity,
                    String color, double price) {
        super(price);
        this.batteryCapacity = batteryCapacity;
        this.displayInches = displayInches;
        this.memoryRom = memoryRom;
        this.flashMemoryCapacity = flashMemoryCapacity;
        this.color = color;

    }

    public TabletPc(TabletPcBuilder tabletPcBuilder) {
        super(tabletPcBuilder.price);
        this.batteryCapacity = tabletPcBuilder.batteryCapacity;
        this.displayInches = tabletPcBuilder.displayInches;
        this.memoryRom = tabletPcBuilder.memoryRom;
        this.flashMemoryCapacity = tabletPcBuilder.flashMemoryCapacity;
        this.color = tabletPcBuilder.color;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public double getDisplayInches() {
        return displayInches;
    }

    public void setDisplayInches(double displayInches) {
        this.displayInches = displayInches;
    }

    public int getMemoryRom() {
        return memoryRom;
    }

    public void setMemoryRom(int memoryRom) {
        this.memoryRom = memoryRom;
    }

    public int getFlashMemoryCapacity() {
        return flashMemoryCapacity;
    }

    public void setFlashMemoryCapacity(int flashMemoryCapacity) {
        this.flashMemoryCapacity = flashMemoryCapacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public String toString() {
        return "Laptop \t battery capacity: " + batteryCapacity + "\tdisplay inches: " + displayInches +
                "\tmemory rom: " + memoryRom + "\tflash memory capacity: " + flashMemoryCapacity +
                "\tcolor: " + color + "\tprice: " + getPrice();
    }

    public static class TabletPcBuilder {

        public int flashMemoryCapacity;
        public String color;
        public int batteryCapacity;
        public double displayInches;
        public int memoryRom;
        public double price;



        public TabletPcBuilder(String[] allDescription) {
            this.batteryCapacity = Integer.parseInt(allDescription[1]);
            this.displayInches = Double.parseDouble(allDescription[3]);
            this.memoryRom = Integer.parseInt(allDescription[5]);
            this.flashMemoryCapacity = Integer.parseInt(allDescription[7]);
            this.color = allDescription[9];
            this.price = Double.parseDouble(allDescription[11]);
        }

        public TabletPc build(){
            return new TabletPc(this);
        }
    }

}
