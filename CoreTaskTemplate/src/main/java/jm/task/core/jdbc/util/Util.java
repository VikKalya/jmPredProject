package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    public Connection connect() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/baseclienttest?autoReconnect=true&useSSL=false";
        String userName = "root";
        String password = "2332431512Kk";//Проверяем наличие JDBC драйвера для работы с БД
        Connection connection = DriverManager.getConnection(url, userName, password);
        return connection;
    }
}
