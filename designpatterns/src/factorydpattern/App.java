package factorydpattern;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		
		System.out.println("------------- Enter your Choice ----------");
		System.out.println("Enter 1 for order Thar");
		System.out.println("Enter 2 for order Scarpio");
		System.out.println("Enter 3 for order VUX700 ");
		
		Scanner s1=new Scanner(System.in);
		int choice=s1.nextInt();
		try {
			carFactory(choice).order();
		}catch(NullPointerException e) {
			System.out.println("Something went wrong");
		}
		
		
		
	}
	public static Car carFactory(int choice) {
		Car car=null;
		switch(choice) {
		case 1:car=new Thar();
		       break;
		case 2: car=new Scarpio();
		       break;
		case 3: car=new VUX700();
		       break;
		default:System.out.println("Invalid choice");
		}
		
		return car;
		
	}

}
