package com.mainserver.testhub.ws.dao.base;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

abstract public class BaseDao {

    private Connection conn;

    public BaseDao() {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "root", "");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    protected Connection getConnection() throws SQLException {
        return conn;
    }

}
