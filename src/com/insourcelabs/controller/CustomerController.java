/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Insource Labs. All rights reserved 2020 - Present.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/
package com.insourcelabs.controller;

import com.insourcelabs.db.DBCon;
import com.insourcelabs.model.Customer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author sachin <dev@insourcelabs.com>
 */
public class CustomerController {

    public boolean addCusromer(Customer customer) throws ClassNotFoundException, SQLException{
        Connection con = DBCon.getInstance().getCon();
        PreparedStatement pstm = con.prepareStatement("INSERT INTO customer (name,address,tp) VALUES(?,?,?)");
        pstm.setString(1, customer.getName());
        pstm.setString(2, customer.getAddress());
        pstm.setString(3, customer.getTp());
        return pstm.executeUpdate()>0;
    }
    
}
