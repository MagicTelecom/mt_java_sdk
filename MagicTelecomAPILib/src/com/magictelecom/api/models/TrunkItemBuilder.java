/*
 * MagicTelecomAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 on 06/20/2016
 */
package com.magictelecom.api.models;

import java.util.*;

public class TrunkItemBuilder 
        extends ItemBuilder {
    //the instance to build
    private TrunkItem trunkItem;

    /**
     * Default constructor to initialize the instance
     */
    public TrunkItemBuilder() {
        trunkItem = new TrunkItem();
    }

    public TrunkItemBuilder routing(Routing routing) {
        trunkItem.setRouting(routing);
        return this;
    }

    public TrunkItemBuilder attributes(String attributes) {
        trunkItem.setAttributes(attributes);
        return this;
    }

    public TrunkItemBuilder channels(int channels) {
        trunkItem.setChannels(channels);
        return this;
    }

    public TrunkItemBuilder sipUri(String sipUri) {
        trunkItem.setSipUri(sipUri);
        return this;
    }

    public TrunkItemBuilder trunkHandle(String trunkHandle) {
        trunkItem.setTrunkHandle(trunkHandle);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public TrunkItem build() {
        return trunkItem;
    }
}