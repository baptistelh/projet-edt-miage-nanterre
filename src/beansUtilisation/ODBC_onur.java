package beansUtilisation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.List;
import beans.*;

public class ODBC_onur {

	public static Connection getConnectiontoDB(String login, String password,
			String url) {

		Connection connection = null;

		try {
			connection = DriverManager.getConnection(url, login, password);
			// interaction avec la base
		} catch (SQLException sqle) {
			// cf Comment g�rer les erreurs ?
		} 
		return connection;
		}
	
	//recupere tous les creneaux d'un enseigant
	public static List <Creneau> getCreneaux (Connection c, Enseignant e)(){	
	}
	
	//enregistre creneaux d'un enseignant. L'idee est de tout �cras� dans la base pour l'enseignant donn� et de r�ecire. 
	public static boolean setCreneau


}