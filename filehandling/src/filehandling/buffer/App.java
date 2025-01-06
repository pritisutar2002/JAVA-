package filehandling.buffer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class App {
	
	public static void main(String[] args) throws IOException {
		File contacts= new File("D:\\JavaQS\\Contacts.txt");
		File temp= new File("D:\\JavaQS\\Temp.txt");
		
		FileWriter fw= new FileWriter(contacts);
		FileReader fr1= new FileReader(temp);
		
		BufferedWriter bw= new BufferedWriter(fw);
		BufferedReader br=new BufferedReader(fr1);
		
		String contact=null;
		while((contact=br.readLine())!=null) {
			bw.write(contact);
			bw.newLine();
		}
		
		bw.write("Hiii");
		bw.newLine();
		bw.write("hello");
		bw.newLine();
		
		bw.close();
		br.close();
		fr1.close();
		fw.close();
		
		contacts.delete();
		temp.renameTo(contacts);
		
		
		
		
	}

}
