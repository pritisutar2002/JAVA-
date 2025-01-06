package filehandling.buffer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferRead {
	
	private static File f1;
	private static FileReader Fr;
	private static BufferedReader br;
	
	public static void main(String[] args) throws IOException {
		f1 = new File("D:\\JavaQS\\Text.txt");
		Fr= new FileReader(f1);
		br= new BufferedReader(Fr);
		
		fetch();
		
		br.close();
		Fr.close();
	}

	private static void fetch() throws IOException {
		// TODO Auto-generated method stub
		
		String line =null;
		while((line=br.readLine())!=null) {
			System.out.println(line);
		}
		
	}

}
