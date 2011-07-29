package com.ikaisays.muni.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a Direction of a line, including the stops.
 * <p/>
 * Example data:
 * http://webservices.nextbus.com/service/publicXMLFeed?command=routeConfig&a=sf-muni&r=F
 */
public class Direction {
    private String tag;
    private String title;
    private String name;
    private List<Stop> stops;

    public Direction(String tag, String title, String name) {
        this.tag = tag;
        this.title = title;
        this.name = name;
        stops = new ArrayList<Stop>();
    }

    public void addStop(Stop stop) {
        stops.add(stop);
    }

    public String getTag() {
        return tag;
    }

    public String getTitle() {
        return title;
    }

    public String getName() {
        return name;
    }

    public List<Stop> getStops() {
        return stops;
    }
}
