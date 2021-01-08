package nihao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCDemo {
	public static void main(String[] args) {
		try (Connection connection = Xxx.getConnection()) {
			
			String sql = "select id, bookName, price from book where id = ? and bookName = ?";
			PreparedStatement statement = connection.prepareStatement(sql); // 预处理
			statement.setInt(1, 19);
			statement.setString(2, "world");
			
			try (ResultSet resultset = statement.executeQuery()) {
				while (resultset.next()) {
					int id = resultset.getInt(1);
					String name = resultset.getString(2);
					float price = resultset.getFloat(3);
					System.out.println("id: " + id + " name: " + name + " price: " + price);
				}
			}
		} catch (Exception e) {
			System.out.println("数据库连接的时候出现了错误: " + e.getMessage());
		}
	}
}
