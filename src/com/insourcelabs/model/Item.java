/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Insource Labs. All rights reserved 2020 - Present.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/
package com.insourcelabs.model;

/**
 *
 * @author sachin <dev@insourcelabs.com>
 */
public class Item {
    private String name;
    private double price;
    private int qty;

    public Item() {
    }
    
    public Item(String name, double price, int qty) {
        this.name = name;
        this.price = price;
        this.qty = qty;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item{" + "name=" + name + ", price=" + price + ", qty=" + qty + '}';
    }
    
}
