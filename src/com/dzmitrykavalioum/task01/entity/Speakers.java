package com.dzmitrykavalioum.task01.entity;

public class Speakers extends Appliance {
    private int powerConsumption;
    private int numberOfSpeakers;
    private String frequencyRange;
    private int cordLength;


    public Speakers() {

    }

    public Speakers(int powerConsumption, int numberOfSpeakers,
                    String frequencyRange, int cordLength, double price) {
        super(price);
        this.powerConsumption = powerConsumption;
        this.numberOfSpeakers = numberOfSpeakers;
        this.frequencyRange = frequencyRange;
        this.cordLength = cordLength;

    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public int getNumberOfSpeakers() {
        return numberOfSpeakers;
    }

    public void setNumberOfSpeakers(int numberOfSpeakers) {
        this.numberOfSpeakers = numberOfSpeakers;
    }

    public String getFrequencyRange() {
        return frequencyRange;
    }

    public void setFrequencyRange(String frequencyRange) {
        this.frequencyRange = frequencyRange;
    }

    public int getCordLength() {
        return cordLength;
    }

    public void setCordLength(int cordLength) {
        this.cordLength = cordLength;
    }


    @Override
    public String toString() {
        return "Speakers \t power consuption: " + powerConsumption + "\tnumber of speakers: " + numberOfSpeakers +
                "\tfrequenct range: " + frequencyRange + "\tcord length" + cordLength + "\tprice: " + getPrice();
    }
}
