/*
 * MagicTelecomAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 on 06/20/2016
 */
package com.magictelecom.api.models;

import java.util.*;

public class RoutingBuilder 
        extends RoutingBaseBuilder {
    //the instance to build
    private Routing routing;

    /**
     * Default constructor to initialize the instance
     */
    public RoutingBuilder() {
        routing = new Routing();
    }

    public RoutingBuilder sipUser(String sipUser) {
        routing.setSipUser(sipUser);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Routing build() {
        return routing;
    }
}