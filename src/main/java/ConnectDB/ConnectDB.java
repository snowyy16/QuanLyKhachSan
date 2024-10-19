/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConnectDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Admin
 */
public class ConnectDB {
//     public static Connection con = null;
//    private static final ConnectDB instance = new ConnectDB();
//
//    public static ConnectDB getInstance() {
//        return instance;
//    }
//
//    public void connect() throws SQLException {
//        try {
//        	String url = "jdbc:sqlserver://localhost:1433;databasename=PhanMemQuanLyKhachSan";
//            String user = "sa";
//            String password = "123";
//            con = DriverManager.getConnection(url, user, password);`
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//    }
//
//    
//
//    public static Connection getCon() {
//        return con;
//    }
	public Connection getConnection() {
        Connection connection = null;
        try {
            String url = "jdbc:sqlserver://localhost:1433;databaseName=PhanMemQuanLyKhachSan";
            String username = "sa";
            String password = "123";
            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
