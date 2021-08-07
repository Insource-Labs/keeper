/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Insource Labs. All rights reserved 2020 - Present.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/
package com.insourcelabs.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author sachin <dev@insourcelabs.com>
 */
public class DBCon {
    
    private static DBCon dBUtil;
    private final Connection connection;

    private DBCon() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampleDb", "sachin", "rockey@123");
    }

    public static DBCon getInstance() throws ClassNotFoundException, SQLException {
        if (dBUtil == null) {
            dBUtil = new DBCon();
        }
        return dBUtil;
    }

    public Connection getCon() {
        return connection;
    }
    
    
}
