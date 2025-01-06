package Signleton;

public class DatabaseConnection {
	
	private static  DatabaseConnection connection;

	private DatabaseConnection() {
		super();
	}
	
	public static DatabaseConnection getConnection() {
		if(connection==null) {
			
			connection=new DatabaseConnection();
			
		}
		return connection ;
	}
	
	

}
