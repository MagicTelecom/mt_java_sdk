/*
 * MagicTelecomAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 on 06/20/2016
 */
package com.magictelecom.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Checkout 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5692538799333799499L;
    private String externalOrderReference;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("external_order_reference")
    public String getExternalOrderReference ( ) { 
        return this.externalOrderReference;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("external_order_reference")
    public void setExternalOrderReference (String value) { 
        this.externalOrderReference = value;
    }
 
}
 