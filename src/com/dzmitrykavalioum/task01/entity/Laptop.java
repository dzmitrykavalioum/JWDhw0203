package com.dzmitrykavalioum.task01.entity;

public class Laptop extends Appliance {

    private String os;
    private int systemMemory;
    private double cpu;
    private double batteryCapacity;
    private double displayInches;
    private int memoryROM;

    public Laptop() {
    }

    public Laptop(LaptopBuilder builder) {
        super(builder.price);
        this.os = builder.os;
        this.systemMemory = builder.systemMemory;
        this.cpu = builder.CPU;
        this.batteryCapacity = builder.batteryCapacity;
        this.displayInches = builder.displayInches;
        this.memoryROM = builder.memoryROM;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public int getSystemMemory() {
        return systemMemory;
    }

    public void setSystemMemory(int systemMemory) {
        this.systemMemory = systemMemory;
    }

    public double getCpu() {
        return cpu;
    }

    public void setCpu(double cpu) {
        this.cpu = cpu;
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public double getDisplayInches() {
        return displayInches;
    }

    public void setDisplayInches(double displayInches) {
        this.displayInches = displayInches;
    }

    public int getMemoryROM() {
        return memoryROM;
    }

    public void setMemoryROM(int memoryROM) {
        this.memoryROM = memoryROM;
    }


    @Override
    public String toString() {
        return "Laptop " + "\tbattery capacity: " + batteryCapacity +
                "\tOS: " + os + "\tmemory rom: " + memoryROM +
                "\tsystem memory: " + systemMemory + "\tcpu: " + cpu +
                "\tdisplay inches: " + displayInches + "\tprice: " + getPrice();
    }

    public static class LaptopBuilder {
        public String os;
        public int systemMemory;
        public double CPU;
        public double batteryCapacity;
        public double displayInches;
        public int memoryROM;
        public double price;

        public LaptopBuilder(String[] allDescription) {
            this.batteryCapacity = Double.parseDouble(allDescription[1]);
            this.os = allDescription[3];
            this.memoryROM = Integer.parseInt(allDescription[5]);
            this.systemMemory = Integer.parseInt(allDescription[7]);
            this.CPU = Double.parseDouble(allDescription[9]);
            this.displayInches = Double.parseDouble(allDescription[11]);
            this.price = Double.parseDouble(allDescription[13]);
        }

        public Laptop build() {
            return new Laptop(this);
        }

    }
}
