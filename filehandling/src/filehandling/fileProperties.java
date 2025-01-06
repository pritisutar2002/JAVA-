package filehandling;

import java.io.File;

public class fileProperties {
	public static void main(String[] args) {
		File f1=new File ("D:/JavaQS/Test.txt");
		if(f1.exists()) {
			System.out.println("File Location is :"+ f1.getAbsolutePath());
			System.out.println("File Name is :"+f1.getName());
			System.out.println("File lenght is : "+f1.length());
			System.out.println(f1.getName()+" is executable file ? ==> "+ f1.canExecute());
			System.out.println(f1.getName()+" id readable file ? ==> "+f1.canRead());
			System.out.println(f1.getName()+" is writable file ? ==> "+f1.canWrite());
			
		}else {
			System.out.println("File dose not exist");
		}
	}

}
