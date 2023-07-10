package br.com.cod3r.factory.app.dbadapter.factory;

import br.com.cod3r.factory.app.dbadapter.db.DB;
import br.com.cod3r.factory.app.dbadapter.db.OracleDB;
import br.com.cod3r.factory.app.dbadapter.db.PostgresDB;

import java.util.Optional;

public class DBFactory {
	public Optional<DB> getDatabase(String databaseProvider){
		if("ORACLE".equals(databaseProvider.toUpperCase())){
			return Optional.of(new OracleDB());
		} else if ("POSTGRES".equals(databaseProvider.toUpperCase())){
			return Optional.of(new PostgresDB());
		}
		return Optional.empty();
	}
}
