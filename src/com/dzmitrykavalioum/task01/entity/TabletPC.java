package com.dzmitrykavalioum.task01.entity;

import java.io.Serializable;

public class TabletPC extends Appliance {
    private int batteryCapacity;
    private double displayInches;
    private int memoryRom;
    private int flashMemoryCapacity;
    private String color;


    public TabletPC() {

    }

    public TabletPC(int batteryCapacity, double displayInches, int memoryRom, int flashMemoryCapacity,
                    String color, double price) {
        super(price);
        this.batteryCapacity = batteryCapacity;
        this.displayInches = displayInches;
        this.memoryRom = memoryRom;
        this.flashMemoryCapacity = flashMemoryCapacity;
        this.color = color;

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
}
