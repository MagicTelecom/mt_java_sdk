/*
 * MagicTelecomAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 on 06/20/2016
 */
package com.magictelecom.api.models;

import java.util.*;

public class CallerLocationBuilder {
    //the instance to build
    private CallerLocation callerLocation;

    /**
     * Default constructor to initialize the instance
     */
    public CallerLocationBuilder() {
        callerLocation = new CallerLocation();
    }

    /**
     * Address
     */
    public CallerLocationBuilder address(String address) {
        callerLocation.setAddress(address);
        return this;
    }

    /**
     * City
     */
    public CallerLocationBuilder city(String city) {
        callerLocation.setCity(city);
        return this;
    }

    /**
     * Country Name
     */
    public CallerLocationBuilder country(String country) {
        callerLocation.setCountry(country);
        return this;
    }

    /**
     * Location Name
     */
    public CallerLocationBuilder name(String name) {
        callerLocation.setName(name);
        return this;
    }

    /**
     * Postal Code
     */
    public CallerLocationBuilder postalCode(int postalCode) {
        callerLocation.setPostalCode(postalCode);
        return this;
    }

    /**
     * Region
     */
    public CallerLocationBuilder region(String region) {
        callerLocation.setRegion(region);
        return this;
    }

    /**
     * Unit Number
     */
    public CallerLocationBuilder unitNumber(int unitNumber) {
        callerLocation.setUnitNumber(unitNumber);
        return this;
    }

    /**
     * Unit Type
     */
    public CallerLocationBuilder unitType(String unitType) {
        callerLocation.setUnitType(unitType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CallerLocation build() {
        return callerLocation;
    }
}