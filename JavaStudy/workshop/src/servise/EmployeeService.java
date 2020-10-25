package servise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import bean.EmployeeBean;

/**
 * ・商品情報検索サービス
 */

public class EmployeeService {

    // 問① 接続情報を記述してください
    /** ドライバーのクラス名 */
    private static final String POSTGRES_DRIVER = "org.postgresql.Driver";
    /** ・JDMC接続先情報 */
    private static final String JDBC_CONNECTION = "jdbc:postgresql://localhost:5432/workshop";
    /** ・ユーザー名 */
    private static final String USER = "postgres";
    /** ・パスワード */
    private static final String PASS = "11291231";

    static EmployeeBean employeeDate = null;
    public bean.EmployeeBean al;

    public ArrayList<EmployeeBean> EmployeeBean(String id, String name, int price, String img_url) {
        ArrayList<EmployeeBean> al = new ArrayList<EmployeeBean>();
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            Class.forName(POSTGRES_DRIVER);
            connection = DriverManager.getConnection(JDBC_CONNECTION, USER, PASS);
            statement = connection.createStatement();

            String SQL = "SELECT * FROM items";
            resultSet = statement.executeQuery(SQL);

            while (resultSet.next()) {
                String column1 = resultSet.getString("id");
                String column2 = resultSet.getString("name");
                int column3 = resultSet.getInt("price");
                String column4 = resultSet.getString("insert_date");
                String column5 = resultSet.getString("img_url");

                employeeDate = new EmployeeBean();
                employeeDate.setId(column1);
                employeeDate.setName(column2);
                employeeDate.setInsert_date(column4);
                employeeDate.setPrice(column3);
                employeeDate.setImg_url(column5);
                al.add(employeeDate);
            }
            // forName()で例外発生
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            // getConnection()、createStatement()、executeQuery()で例外発生
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return al;
    }
}