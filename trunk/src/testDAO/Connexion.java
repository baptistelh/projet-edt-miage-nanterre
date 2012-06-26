package testDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connexion {

	/**
	 * URL de connection
	 */
	private static String url = "jdbc:oracle:thin:@miage03.dmiage.u-paris10.fr:1521:MIAGE";
	/**
	 * Nom du user
	 */
	private static String user = "flgalude";
	/**
	 * Mot de passe du user
	 */
	private static String passwd = "hello";
	/**
	 * Objet Connection
	 */
	private static Connection connect;

	/**
	 * M�thode qui va nous retourner notre instance et la cr�er si elle
	 * n'existe pas...
	 * 
	 * @return
	 */
	public static Connection getInstance() {
		if (connect == null) {
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
				connect = DriverManager.getConnection(url, user, passwd);
			} catch (SQLException e) {
				e.printStackTrace();

			} catch (ClassNotFoundException e) {
				e.printStackTrace();

			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();

			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return connect;
	}

}
