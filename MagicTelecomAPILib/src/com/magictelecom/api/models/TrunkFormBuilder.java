/*
 * MagicTelecomAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 on 06/20/2016
 */
package com.magictelecom.api.models;

import java.util.*;

public class TrunkFormBuilder {
    //the instance to build
    private TrunkForm trunkForm;

    /**
     * Default constructor to initialize the instance
     */
    public TrunkFormBuilder() {
        trunkForm = new TrunkForm();
    }

    public TrunkFormBuilder trunk(Trunk trunk) {
        trunkForm.setTrunk(trunk);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public TrunkForm build() {
        return trunkForm;
    }
}