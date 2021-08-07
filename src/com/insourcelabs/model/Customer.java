/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Insource Labs. All rights reserved 2020 - Present.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/
package com.insourcelabs.model;

/**
 *
 * @author sachin <dev@insourcelabs.com>
 */
public class Customer {
    
    private String name;
    private String address;
    private String tp;

    public Customer(String name, String address, String tp) {
        this.name = name;
        this.address = address;
        this.tp = tp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTp() {
        return tp;
    }

    public void setTp(String tp) {
        this.tp = tp;
    }

    @Override
    public String toString() {
        return "Customer{" + "name=" + name + ", address=" + address + ", tp=" + tp + '}';
    }

}
