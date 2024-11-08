package candle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CandleRunner {

	public static void main(String[] args) {

		String url = "jdbc:mysql://127.0.0.1:3306/cotton";
		String userName = "root";
		String password = "Xworkzodc@123";
		String insertQuery = "insert into candle_table values (1,'80Rs','Cotton wicks')";

		Connection connection = null;

		try {
			connection = DriverManager.getConnection(url, userName, password);

			Statement statement = connection.createStatement();

			int value = statement.executeUpdate(insertQuery);

			if (value > 0) {

				System.out.println("This is saved");

			} else {

				System.out.println("This is not saved");
			}

		} catch (SQLException e) {

			e.printStackTrace();

		}
	}

}
