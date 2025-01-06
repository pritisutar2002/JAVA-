package Signleton;

public class ConnectinMain {
	public static void main(String[] args) {
		
		DatabaseConnection d1=DatabaseConnection.getConnection();
		DatabaseConnection d2=DatabaseConnection.getConnection();
		DatabaseConnection d3=DatabaseConnection.getConnection();
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
	}

}
