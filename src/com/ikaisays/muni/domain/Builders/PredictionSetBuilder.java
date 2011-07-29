package com.ikaisays.muni.domain.Builders;

import com.ikaisays.muni.domain.Prediction;
import com.ikaisays.muni.domain.PredictionSet;
import com.ikaisays.muni.domain.Route;

import java.util.List;

public class PredictionSetBuilder {
    private String agencyTitle;
    private Route route;
    private String stopTitle;
    private String stopTag;
    private List<Prediction> predictions;

    public PredictionSetBuilder setAgencyTitle(String agencyTitle) {
        this.agencyTitle = agencyTitle;
        return this;
    }

    public PredictionSetBuilder setRoute(Route route) {
        this.route = route;
        return this;
    }

    public PredictionSetBuilder setStopTitle(String stopTitle) {
        this.stopTitle = stopTitle;
        return this;
    }

    public PredictionSetBuilder setStopTag(String stopTag) {
        this.stopTag = stopTag;
        return this;
    }

    public PredictionSetBuilder setPredictions(List<Prediction> predictions) {
        this.predictions = predictions;
        return this;
    }

    public PredictionSet createPredictionSet() {
        return new PredictionSet(agencyTitle, route, stopTitle, stopTag, predictions);
    }
}