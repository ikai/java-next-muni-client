package com.ikaisays.muni.domain;

/**
 * Represents a Stop as exampled here:
 * <p/>
 * http://webservices.nextbus.com/service/publicXMLFeed?command=routeConfig&a=sf-muni&r=F
 */
public class Stop {
    private final String tag;
    private final String title;
    private final float lat;
    private final float lon;
    private final String stopId;

    public Stop(String tag, String title, float lat, float lon, String stopId) {
        this.tag = tag;
        this.title = title;
        this.lat = lat;
        this.lon = lon;
        this.stopId = stopId;
    }

    public String getTag() {
        return tag;
    }

    public String getTitle() {
        return title;
    }

    public float getLat() {
        return lat;
    }

    public float getLon() {
        return lon;
    }

    public String getStopId() {
        return stopId;
    }
}
