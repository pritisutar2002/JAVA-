package filehandling;

import java.io.File;
import java.io.IOException;

public class CreateFile {
	public static void main(String[] args) throws IOException {
		File f1= new File("Test1.txt");
		if(f1.createNewFile()) {
			System.out.println("File is created on default location");
			
			}
		else {
			System.out.println("File is already exists");
			
			
		}
	}

}
