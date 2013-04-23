package org.efreak.bukkitmanager.addon.postgresql;

import org.efreak.bukkitmanager.Database;
import org.efreak.bukkitmanager.addons.BukkitmanagerAddon;

public class PostgreSQLSupport extends BukkitmanagerAddon {

	@Override
	public void onLoad() {
		super.onLoad();
		name = "PostgreSQLDatabase";
		Database.registerDatabaseSystem("PostgreSQL", new PostgreSQL());
	}
	
	@Override
	public void onEnable() {
		super.onEnable();
	}
	
}
