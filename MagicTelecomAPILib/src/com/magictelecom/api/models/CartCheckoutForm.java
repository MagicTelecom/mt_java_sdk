/*
 * MagicTelecomAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 on 06/20/2016
 */
package com.magictelecom.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CartCheckoutForm 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5600683328637633187L;
    private Checkout checkout;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("checkout")
    public Checkout getCheckout ( ) { 
        return this.checkout;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("checkout")
    public void setCheckout (Checkout value) { 
        this.checkout = value;
    }
 
}
 