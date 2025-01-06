package filehandling.buffer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriter {
	
	public static void main(String[] args) throws IOException {
		File f1=new File("D:\\JavaQS\\Text.txt");
		FileWriter fw=new FileWriter(f1);
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("Hello world");
		bw.newLine();
		bw.write("This is java jang");
		bw.close();
		fw.close();
		
	}

}
