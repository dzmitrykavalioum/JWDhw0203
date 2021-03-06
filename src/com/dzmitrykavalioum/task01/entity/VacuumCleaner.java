package com.dzmitrykavalioum.task01.entity;

public class VacuumCleaner extends Appliance {
    private int powerConsumption = 100;
    private String filterType;
    private String bagType;
    private String wandType;
    private int motorSpeedRegulation;
    private int cleaningWidth;


    public VacuumCleaner() {

    }

    public VacuumCleaner(int powerConsumption, String filterType,
                         String bagType, String wandType,
                         int motorSpeedRegulation, int cleaningWidth, double price) {
        super(price);
        this.powerConsumption = powerConsumption;
        this.filterType = filterType;
        this.bagType = bagType;
        this.wandType = wandType;
        this.motorSpeedRegulation = motorSpeedRegulation;
        this.cleaningWidth = cleaningWidth;

    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public String getFilterType() {
        return filterType;
    }

    public void setFilterType(String filterType) {
        this.filterType = filterType;
    }

    public String getBagType() {
        return bagType;
    }

    public void setBagType(String bagType) {
        this.bagType = bagType;
    }

    public String getWandType() {
        return wandType;
    }

    public void setWandType(String wandType) {
        this.wandType = wandType;
    }

    public int getMotorSpeedRegulation() {
        return motorSpeedRegulation;
    }

    public void setMotorSpeedRegulation(int motorSpeedRegulation) {
        this.motorSpeedRegulation = motorSpeedRegulation;
    }

    public int getCleaningWidth() {
        return cleaningWidth;
    }

    public void setCleaningWidth(int cleaningWidth) {
        this.cleaningWidth = cleaningWidth;
    }


    @Override
    public String toString() {
        return "Vacuum cleaner \t power consumption: " + powerConsumption + "\tfilter type: " + filterType +
                "\tbag type: " + bagType + "\twand type: " + wandType + "\tmotor speed regulation: " +
                motorSpeedRegulation + "\tcleaning width: " + cleaningWidth + "\t price- " + getPrice();
    }
}
