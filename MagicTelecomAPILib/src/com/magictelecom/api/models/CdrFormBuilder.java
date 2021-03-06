/*
 * MagicTelecomAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 on 06/20/2016
 */
package com.magictelecom.api.models;

import java.util.*;

public class CdrFormBuilder {
    //the instance to build
    private CdrForm cdrForm;

    /**
     * Default constructor to initialize the instance
     */
    public CdrFormBuilder() {
        cdrForm = new CdrForm();
    }

    public CdrFormBuilder cdrs(Cdrs cdrs) {
        cdrForm.setCdrs(cdrs);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CdrForm build() {
        return cdrForm;
    }
}