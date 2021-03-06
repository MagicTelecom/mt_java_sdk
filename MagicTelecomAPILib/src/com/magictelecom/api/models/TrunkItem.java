/*
 * MagicTelecomAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 on 06/20/2016
 */
package com.magictelecom.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class TrunkItem 
        extends Item {
    private static final long serialVersionUID = 4699135528876312295L;
    private Routing routing;
    private String attributes;
    private int channels;
    private String sipUri;
    private String trunkHandle;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("_routing")
    public Routing getRouting ( ) { 
        return this.routing;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("_routing")
    public void setRouting (Routing value) { 
        this.routing = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("attributes")
    public String getAttributes ( ) { 
        return this.attributes;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("attributes")
    public void setAttributes (String value) { 
        this.attributes = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("channels")
    public int getChannels ( ) { 
        return this.channels;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("channels")
    public void setChannels (int value) { 
        this.channels = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("sip_uri")
    public String getSipUri ( ) { 
        return this.sipUri;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("sip_uri")
    public void setSipUri (String value) { 
        this.sipUri = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("trunk_handle")
    public String getTrunkHandle ( ) { 
        return this.trunkHandle;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("trunk_handle")
    public void setTrunkHandle (String value) { 
        this.trunkHandle = value;
    }
 
}
 