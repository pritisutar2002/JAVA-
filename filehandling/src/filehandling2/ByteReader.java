package filehandling2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ByteReader {
	public static void main(String[] args) throws IOException {
		File f1=new File("D:/JavaQS/Test.txt");
	
		if(f1.exists()) {
			FileInputStream FIS=new FileInputStream(f1);
			int bytetoread=2;
			for(int i=0;i<=2; i++) {
				int bytevalue =FIS.read();
				System.out.println(bytevalue);

				
			}
			FIS.close();
			
		}else {
			System.out.println("File not fount");
		}
		
	}

}
