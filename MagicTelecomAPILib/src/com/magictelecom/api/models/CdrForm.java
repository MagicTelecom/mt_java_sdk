/*
 * MagicTelecomAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 on 06/20/2016
 */
package com.magictelecom.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CdrForm 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5256081902460912402L;
    private Cdrs cdrs;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("cdrs")
    public Cdrs getCdrs ( ) { 
        return this.cdrs;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("cdrs")
    public void setCdrs (Cdrs value) { 
        this.cdrs = value;
    }
 
}
 