package org.example;

import java.sql.*;
import java.util.*;
public class connection {
    Connection c;
    Statement s;

    connection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c= DriverManager.getConnection("jdbc:mysql:///bank_system", "root", "Piyush@14122001");
            s = c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
