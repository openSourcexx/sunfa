package demo.zhujie;

import java.sql.Connection;
import java.sql.SQLException;

public class ConnTest {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Connection conn = JDBCUtil.getConnction();

    }

}
