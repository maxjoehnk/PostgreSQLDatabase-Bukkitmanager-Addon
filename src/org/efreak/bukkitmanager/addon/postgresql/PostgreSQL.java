package org.efreak.bukkitmanager.addon.postgresql;

import java.sql.DriverManager;
import java.sql.SQLException;

import org.efreak.bukkitmanager.Database;

public class PostgreSQL extends Database {

	@Override
	protected void connect() throws ClassNotFoundException, SQLException {
		String host = config.getString("Database.Host");
		int port = config.getInt("Database.Port");
		String name = config.getString("Database.Name");
		String username = config.getString("Database.Username");
		String password = config.getString("Database.Password");
		Class.forName("org.postgresql.Driver");
		dbConn = DriverManager.getConnection("jdbc:postgresql://" + host + ":" + port + "/" + name, username, password);

	}

	@Override
	protected void config() {
		config.update("Database.Host", "localhost");
		config.update("Database.Port", 5432);
		config.update("Database.Name", "minecraft");
		config.update("Database.Username", "root");
		config.update("Database.Password", "");
	}

}
