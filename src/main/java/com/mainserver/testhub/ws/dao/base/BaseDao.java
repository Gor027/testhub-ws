package com.mainserver.testhub.ws.dao.base;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

abstract public class BaseDao {



    protected Connection connectingDatabase() throws SQLException {

        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "root", "");
        return conn;
    }

}
