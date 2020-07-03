package demo.zhujie;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CreateStudent {

    public static void main(String[] args) {
        String sql = getSQL();
        createTable(sql);
    }

    private static void createTable(String sql) {
        Connection conn = null;
        PreparedStatement pstat = null;
        ResultSet res = null;
        try {
            conn = JDBCUtil.getConnction();
            pstat = conn.prepareStatement(sql);
            int i = pstat.executeUpdate();
            System.out.println("更新计数器i==" + i);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.closeAll(conn, pstat, res);
        }

    }

    private static String getSQL() {
        Class class1 = Student.class;
        StringBuilder str = new StringBuilder("CREATE TABLE ");
        Table table = (Table) class1.getAnnotation(Table.class);
        str.append(table.tableName() + " (");

        Field[] declaredFields = class1.getDeclaredFields();
        for (Field field : declaredFields) {
            if (field.isAnnotationPresent(Column.class)) {
                Column column = field.getAnnotation(Column.class);
                String columnName = column.columnName();
                String columnType = column.columnType();
                int columnLength = column.columnLength();
                String columnTraint = column.columnTraint();
                str.append(columnName + " " + columnType + "(" + columnLength + ") " + columnTraint + ",");
            }
        }
        String sql = str.substring(0, str.length() - 1) + ")";
        return sql;
    }

}
