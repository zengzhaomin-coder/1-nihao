package nihao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Xxx {
	public static Connection getConnection() throws SQLException {
		String url = "jdbc:sqlserver://localhost:1434;databaseName=xxx;user=sa;password=sa";
		return DriverManager.getConnection(url);
	}
	public static void closeDBResources(Connection connection, Statement statement, ResultSet resultset) {
		if (resultset != null)
			try {
				resultset.close();
			} catch (SQLException e) {
			}
		if (statement != null)
			try {
				statement.close();
			} catch (SQLException e) {
			}
		if (connection != null)
			try {
				connection.close();
			} catch (SQLException e) {
			}
	}
}
