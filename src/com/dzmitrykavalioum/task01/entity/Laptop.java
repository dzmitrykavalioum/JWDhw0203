package com.dzmitrykavalioum.task01.entity;

public class Laptop extends Appliance{

    private double batteryCapacity;
    private String os;
    private int memoryRom;
    private int systemMemory;
    private double cpu;
    private double displayInches;


    public Laptop(double batteryCapacity, String os,
                  int memoryRom, int systemMemory,
                  double cpu, double displayInches, double price) {
        super(price);
        this.batteryCapacity = batteryCapacity;
        this.os = os;
        this.memoryRom = memoryRom;
        this.systemMemory = systemMemory;
        this.cpu = cpu;
        this.displayInches = displayInches;

    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public int getMemoryRom() {
        return memoryRom;
    }

    public void setMemoryRom(int memoryRom) {
        this.memoryRom = memoryRom;
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

    public double getDisplayInches() {
        return displayInches;
    }

    public void setDisplayInches(double displayInches) {
        this.displayInches = displayInches;
    }






    @Override
    public String toString() {
        return "Laptop "+ "\tbattery capacity: "+ batteryCapacity +
                "\tOS: " + os + "\tmemory rom: " + memoryRom +
                "\tsystem memory: " + systemMemory + "\tcpu: "+ cpu +
                "\tdisplay inches: " + displayInches + "\tprice: "+ getPrice();
    }
}