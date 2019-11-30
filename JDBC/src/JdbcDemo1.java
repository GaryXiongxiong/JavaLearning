import java.sql.*;

/**
 * JavaLearning
 * JdbcDemo1
 *
 * @author Yixiong J
 * @version 2019/11/18 9:55
 */

public class JdbcDemo1 {
    public static void main(String[] args) throws Exception {
//        Class.forName("com.mysql.jdbc.Driver");
//        In the new version connector, driver has been automatically registered.
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?serverTimezone=UTC", "root", "di1tiancai");
        String sql = "SELECT * FROM new_table WHERE user_name = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1,"gary");
        ResultSet resultSet = preparedStatement.executeQuery();
        if(resultSet.next()){
            System.out.println(resultSet.getString(1));
            System.out.println(resultSet.getString(2));
            System.out.println(resultSet.getString(3));
        }
        preparedStatement.close();
        connection.close();
    }
}
