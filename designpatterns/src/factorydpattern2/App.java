package factorydpattern2;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		System.out.println("----------- Enter your choice to Book the vheical -------------");
		System.out.println("Enter 1 for book the Ubercar");
		System.out.println("Enter 2 for book the UberAuto");
		
		Scanner s1= new Scanner(System.in);
		int choice=s1.nextInt();
		
		try {
			bookRides(choice).book();
		}catch(NullPointerException e) {
			System.out.println("Something went wrong");
		}
	}

  private static Vheical bookRides(int choice) {
	  Vheical vheical=null;
	  switch(choice){
	  case 1:vheical=new Car();
	         break;
	  case 2:vheical=new Auto();       
	         break;
	  default : System.out.println("Invalid choice");       
		  
	  }
	  
	
	return vheical;
		
		
	}

}
