package com.ikaisays.muni.domain;

/**
 * Represents a Muni route, as displayed here:
 * <p/>
 * http://webservices.nextbus.com/service/publicXMLFeed?command=routeList&a=sf-muni
 */
public class Route {

    private final String tag;
    private final String title;

    // As of the writing of this code there are only two directions
    private Direction inboundDirection;
    private Direction outboundDirection;

    public Route(String tag, String title) {
        this.tag = tag;
        this.title = title;
    }

    public String getTag() {
        return tag;
    }

    public String getTitle() {
        return title;
    }

    public Direction getInboundDirection() {
        return inboundDirection;
    }

    public void setInboundDirection(Direction inboundDirection) {
        this.inboundDirection = inboundDirection;
    }

    public Direction getOutboundDirection() {
        return outboundDirection;
    }

    public void setOutboundDirection(Direction outboundDirection) {
        this.outboundDirection = outboundDirection;
    }
}
