/*
 * MagicTelecomAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 on 06/20/2016
 */
package com.magictelecom.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class TrunkForm 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4765813444832140750L;
    private Trunk trunk;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("trunk")
    public Trunk getTrunk ( ) { 
        return this.trunk;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("trunk")
    public void setTrunk (Trunk value) { 
        this.trunk = value;
    }
 
}
 