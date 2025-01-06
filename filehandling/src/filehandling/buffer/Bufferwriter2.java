package filehandling.buffer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Bufferwriter2 {
	private static File f1;
	private static FileWriter fw;
	private static BufferedWriter bw;
	public static void main(String[] args) throws IOException {
		f1= new File("D:\\JavaQS\\Text.txt");
		fw = new FileWriter(f1);
		bw = new BufferedWriter(fw);
		print("Hello world");
		print("This is java");
		
		bw.close();
		fw.close();
		
	}
	private static void print(String msg) throws IOException {
		// TODO Auto-generated method stub
		bw.write(msg);
		bw.newLine();
		
	}

}
