package patterns;

public class DatabaseConnection {
	
	private static  DatabaseConnection connection= new DatabaseConnection();

	private DatabaseConnection() {
		super();
	}
	
	public static DatabaseConnection getConnection() {
		
		return connection ;
	}
	
	

}
