package io.string;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test04 {
	public static void main(String[] args) throws IOException {
		File target = new File("file","string3.txt");
		
		//��δ� 2���� �ʿ�
		FileReader reader = new FileReader(target);
		BufferedReader buffer = new BufferedReader(reader);
		//CPU <- buffer <- reader <- target <- �������� 
		
		String a = buffer.readLine();
		System.out.println("a = " + a);
		
		String b = buffer.readLine();
		System.out.println("b = " + b);
		
		String c = buffer.readLine(); //EOF
		System.out.println("c = " + c);
		
		buffer.close();
	}
}
