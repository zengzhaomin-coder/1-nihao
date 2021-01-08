package nihao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class IHavaAClass {
	public static void main(String[] args) throws Exception {
		Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1434;databaseName=xxx;user=sa;password=");
		
		Statement statement = connection.createStatement();
		ResultSet resultset = statement.executeQuery("select * from book");
		while (resultset.next()) {
			int id = resultset.getInt(1);
			String name = resultset.getString(2);
			float price = resultset.getFloat(3);
			System.out.println("id: " + id + " name: " + name + " price: " + price);
		}
		
		resultset.close();
		statement.close();
		connection.close();
	}
}
