package demo.zhujie;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class JDBCUtil {
    static String user = null;
    static String password = null;
    static String url = null;
    static String className = null;

    static {
        ResourceBundle rb = ResourceBundle.getBundle("db");
        user = rb.getString("user");
        password = rb.getString("password");
        url = rb.getString("url");
        className = rb.getString("className");
    }

    public static Connection getConnction() throws SQLException, ClassNotFoundException {
        Class.forName(className);
        return DriverManager.getConnection(url, user, password);
    }

    public static void closeAll(Connection conn, PreparedStatement pstat, ResultSet res) {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (pstat != null) {
            try {
                pstat.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (res != null) {
            try {
                res.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
