/*
 * MagicTelecomAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 on 06/20/2016
 */
package com.magictelecom.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Item 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5458134536938735065L;
    private String itemType;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("item_type")
    public String getItemType ( ) { 
        return this.itemType;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("item_type")
    public void setItemType (String value) { 
        this.itemType = value;
    }
 
}
 