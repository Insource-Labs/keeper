/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Insource Labs. All rights reserved 2020 - Present.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/
package com.insourcelabs.controller;

import com.insourcelabs.db.DBCon;
import com.insourcelabs.model.Item;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author sachin <dev@insourcelabs.com>
 */
public class ItemController {

    public boolean addItem(Item item) throws ClassNotFoundException, SQLException{
        Connection con = DBCon.getInstance().getCon();
        PreparedStatement pstm = con.prepareStatement("INSERT INTO item (name,price,qty) VALUES(?,?,?)");
        pstm.setString(1, item.getName());
        pstm.setDouble(2, item.getPrice());
        pstm.setInt(3, item.getQty());
        return pstm.executeUpdate()>0;
    }
    
}
