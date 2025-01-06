package filehandling;

import java.io.File;
import java.io.IOException;

public class deleteFile {
	public static void main(String[] args) throws IOException {
		
		File f1=new File("D:/JavaQS/Test1.txt");
		if(f1.createNewFile()) {
			System.out.println("File is created ");
			f1.delete();
			System.out.println("File is deleted");
			
		}else {
			System.out.println("File is already exists");
		}
	}

}
