package br.com.cod3r.factory.app.dbadapter;

import br.com.cod3r.factory.app.dbadapter.db.DB;
import br.com.cod3r.factory.app.dbadapter.factory.DBFactory;

import java.util.Optional;

public class Client {

	public static void main(String[] args) {
		Optional<DB> dbFactory = new DBFactory().getDatabase("oracle");
		dbFactory.ifPresentOrElse(db -> {
					db.query("SELECT * FROM users");
					db.update("INSERT INTO users VALUES ('User', 25)");
				},
				() -> {
					System.out.println("DatabaseProvider not found");
				});
	}
}
