/*
 * MagicTelecomAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 on 06/20/2016
 */
package com.magictelecom.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Endpoint 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4924960487006697819L;
    private String attrs;
    private String uri;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("attrs")
    public String getAttrs ( ) { 
        return this.attrs;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("attrs")
    public void setAttrs (String value) { 
        this.attrs = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("uri")
    public String getUri ( ) { 
        return this.uri;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("uri")
    public void setUri (String value) { 
        this.uri = value;
    }
 
}
 