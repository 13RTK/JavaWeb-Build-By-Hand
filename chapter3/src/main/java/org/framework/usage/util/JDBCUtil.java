package org.framework.usage.util;

import org.framework.usage.entity.User;
import org.smart4j.framework.annotation.Service;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Service
public class JDBCUtil {
    public List<User> getUserList() {
        String sql = "SELECT * FROM user";
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        List<User> userList = new ArrayList<User>();

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo_test", "root", "123456");
            statement = connection.prepareStatement(sql);
            resultSet = statement.executeQuery();

            while (resultSet.next()) {
                User curUser = new User();
                curUser.setId(resultSet.getInt("id"));
                curUser.setNickname(resultSet.getString("nickname"));
                curUser.setAccountName(resultSet.getString("account_name"));
                curUser.setPassword(resultSet.getString("password"));

                userList.add(curUser);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                resultSet.close();
                statement.close();
                connection.close();
            } catch (SQLException e) {
                System.out.println("close failure");
            }
        }


        return userList;
    }
}
