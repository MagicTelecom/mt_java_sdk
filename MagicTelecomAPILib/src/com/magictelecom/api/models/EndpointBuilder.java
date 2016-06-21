/*
 * MagicTelecomAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 on 06/20/2016
 */
package com.magictelecom.api.models;

import java.util.*;

public class EndpointBuilder {
    //the instance to build
    private Endpoint endpoint;

    /**
     * Default constructor to initialize the instance
     */
    public EndpointBuilder() {
        endpoint = new Endpoint();
    }

    public EndpointBuilder attrs(String attrs) {
        endpoint.setAttrs(attrs);
        return this;
    }

    public EndpointBuilder uri(String uri) {
        endpoint.setUri(uri);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Endpoint build() {
        return endpoint;
    }
}