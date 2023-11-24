package com.tech.blog.helper;

import java.sql.*;

public class ConnectionProvider {

    private static Connection con;

    public static Connection getConnection() {
        try {

            if (con == null) {
                //driver class load
                Class.forName("com.mysql.cj.jdbc.Driver");

                //create a connection..
                con = DriverManager.
                        getConnection("jdbc:mysql://localhost:3306/techblog?useSSL=false", "root", "koli");

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return con;
    }

}
