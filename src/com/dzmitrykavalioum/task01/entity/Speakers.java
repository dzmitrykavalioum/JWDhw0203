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

    public Speakers(SpeakersBuilder speakersBuilder) {
        super(speakersBuilder.price);
        this.powerConsumption = speakersBuilder.powerConsumption;
        this.numberOfSpeakers = speakersBuilder.numberOfSpeakers;
        this.frequencyRange = speakersBuilder.frequencyRange;
        this.cordLength = speakersBuilder.cordLength;

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

    public static class SpeakersBuilder {

        public int powerConsumption;
        public int numberOfSpeakers;
        public String frequencyRange;
        public int cordLength;
        public double price;

        public SpeakersBuilder(String[] allDescription) {
            this.powerConsumption = Integer.parseInt(allDescription[1]);
            this.numberOfSpeakers = Integer.parseInt(allDescription[3]);
            this.frequencyRange = allDescription[5];
            this.cordLength = Integer.parseInt(allDescription[7]);
            this.price = Double.parseDouble(allDescription[9]);
        }

        public Speakers build() {
            return new Speakers(this);
        }

    }
}
