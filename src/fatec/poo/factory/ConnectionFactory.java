/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.factory;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kaique
 */
public class ConnectionFactory {

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost/projetojava", "root", "");
        } catch (SQLException excecao) {
            throw new RuntimeException(excecao);
        }
    }

    public static void closeConnecttion(Connection con) {

        if (con != null) {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static void closeConnecttion(Connection con, PreparedStatement stmt) {

        closeConnecttion(con);
        if (con != null) {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static void closeConnecttion(Connection con, PreparedStatement stmt, ResultSet rs) {

        closeConnecttion(con, stmt);
        if (con != null) {
            try {
                if (rs != null) {
                    rs.close();
                }
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
