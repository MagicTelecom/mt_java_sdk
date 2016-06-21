/*
 * MagicTelecomAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 on 06/20/2016
 */
package com.magictelecom.api.models;

import java.util.*;

public class TrunkBuilder {
    //the instance to build
    private Trunk trunk;

    /**
     * Default constructor to initialize the instance
     */
    public TrunkBuilder() {
        trunk = new Trunk();
    }

    public TrunkBuilder routing(Routing routing) {
        trunk.setRouting(routing);
        return this;
    }

    public TrunkBuilder description(String description) {
        trunk.setDescription(description);
        return this;
    }

    public TrunkBuilder sipEndPointUri(String sipEndPointUri) {
        trunk.setSipEndPointUri(sipEndPointUri);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Trunk build() {
        return trunk;
    }
}