package com.ikaisays.muni.domain.Builders;

import com.ikaisays.muni.domain.Prediction;

public class PredictionBuilder {
    private long epochTime;
    private int seconds;
    private int minutes;
    private boolean departure;
    private String dirTag;
    private String vehicle;
    private String block;
    private String tipTag;

    public PredictionBuilder setEpochTime(long epochTime) {
        this.epochTime = epochTime;
        return this;
    }

    public PredictionBuilder setSeconds(int seconds) {
        this.seconds = seconds;
        return this;
    }

    public PredictionBuilder setMinutes(int minutes) {
        this.minutes = minutes;
        return this;
    }

    public PredictionBuilder setDeparture(boolean departure) {
        this.departure = departure;
        return this;
    }

    public PredictionBuilder setDirTag(String dirTag) {
        this.dirTag = dirTag;
        return this;
    }

    public PredictionBuilder setVehicle(String vehicle) {
        this.vehicle = vehicle;
        return this;
    }

    public PredictionBuilder setBlock(String block) {
        this.block = block;
        return this;
    }

    public PredictionBuilder setTipTag(String tipTag) {
        this.tipTag = tipTag;
        return this;
    }

    public Prediction createPrediction() {
        return new Prediction(epochTime, seconds, minutes, departure, dirTag, vehicle, block, tipTag);
    }
}