package com.ikaisays.muni;

import com.ikaisays.muni.domain.Route;

import java.util.List;

/**
 * Implementation class for San Francisco Muni Client
 */
public interface NextMuniClient {

    /**
     *
     * @return a List of {@link com.ikaisays.muni.domain.Route} objects
     */
    public List<Route> getRoutes();


}
