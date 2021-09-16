package repository;

import java.sql.*;

public class Connect {
    private static String status = "Not connected...";

    public static Connection createConnection()
        {

        Connection connection;

        String serverName = "localhost:3306";
        String dataBaseName = "almoxarifado_sql";
        String url = "jdbc:mysql://" + serverName + "/" + dataBaseName + "?autoReconnect=true&useSSL=false&useUnicode=true&characterEncoding=UTF-8&zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=GMT";
        String userName = "root";
        String password = "";

        try {
            connection = DriverManager.getConnection(url, userName, password);

            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();


            status = ("Connected successfully!");

            return connection;

        } catch (ClassNotFoundException e) {
            status = ("Driver not found.");

            return null;

        } catch (SQLException e) {
            status = ("Connection to database failed.");
            e.printStackTrace();

            return null;

        } catch (IllegalAccessException e) {
            status = ("Connection not allowed!");

            return null;

        } catch (InstantiationException e) {
            return null;
        }
    }

    public static ResultSet executeSelect(Connection connection, String sql) throws SQLException {
        Statement query = connection.createStatement();

        return query.executeQuery(sql);
    }

    public static java.sql.PreparedStatement prepareSql(Connection connection, String sql) throws SQLException {
        return connection.prepareStatement(sql);
    }

    public static String connectionStatus() {
        return "STATUS: " + status;
    }
}