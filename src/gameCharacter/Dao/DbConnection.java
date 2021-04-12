package gameCharacter.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
		private static final String URL = "jdbc:mysql://localhost:3306/game_character";
		private static final String USERNAME = "root";
		private static final String PASSWORD = "rootK";
		private static DbConnection INSTANCE = new DbConnection();
		
		private Connection connection;
		
		private DbConnection() {
		}
		public static DbConnection getInstance() {
			return INSTANCE;
		}
		public Connection getConnection() throws SQLException{
			INSTANCE.connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			System.out.println("Connection successful");

			return connection;
		}
	}
