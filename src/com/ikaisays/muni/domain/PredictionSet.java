package com.ikaisays.muni.domain;

import java.util.List;

/**
 * Represents a set of predictions, as represented by the predictions element here
 * <p/>
 * http://webservices.nextbus.com/service/publicXMLFeed?command=predictions&a=sf-muni&r=N&s=5205&useShortTitles=true
 */
public class PredictionSet {
    private String agencyTitle;
    private Route route;

    // Maybe this makes more sense to replace with a Stop instance?
    private String stopTitle;
    private String stopTag;

    private List<Prediction> predictions;

    public PredictionSet(String agencyTitle, Route route, String stopTitle, String stopTag, List<Prediction> predictions) {
        this.agencyTitle = agencyTitle;
        this.route = route;
        this.stopTitle = stopTitle;
        this.stopTag = stopTag;
        this.predictions = predictions;
    }

    public String getAgencyTitle() {
        return agencyTitle;
    }

    public Route getRoute() {
        return route;
    }

    public String getStopTitle() {
        return stopTitle;
    }

    public String getStopTag() {
        return stopTag;
    }

    public List<Prediction> getPredictions() {
        return predictions;
    }
}
