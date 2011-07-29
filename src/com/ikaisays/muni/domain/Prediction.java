package com.ikaisays.muni.domain;

/**
 * A single prediction item. XML line:
 * <p/>
 * <prediction epochTime="1311976749993" seconds="726" minutes="12"
 * isDeparture="false" dirTag="N__OB2" vehicle="1441" block="9710" tripTag="4500250"/>
 */
public class Prediction {
    private long epochTime;
    private int seconds;
    private int minutes;
    private boolean isDeparture;
    private String dirTag;
    private String vehicle;
    private String block;
    private String tipTag;

    public Prediction(long epochTime, int seconds, int minutes, boolean departure, String dirTag, String vehicle, String block, String tipTag) {
        this.epochTime = epochTime;
        this.seconds = seconds;
        this.minutes = minutes;
        isDeparture = departure;
        this.dirTag = dirTag;
        this.vehicle = vehicle;
        this.block = block;
        this.tipTag = tipTag;
    }

    public long getEpochTime() {
        return epochTime;
    }

    public int getSeconds() {
        return seconds;
    }

    public int getMinutes() {
        return minutes;
    }

    public boolean isDeparture() {
        return isDeparture;
    }

    public String getDirTag() {
        return dirTag;
    }

    public String getVehicle() {
        return vehicle;
    }

    public String getBlock() {
        return block;
    }

    public String getTipTag() {
        return tipTag;
    }
}
