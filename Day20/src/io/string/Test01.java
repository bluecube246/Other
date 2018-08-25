package io.string;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test01 {
	public static void main(String[] args) throws IOException {
		//String 출력, 자체적으로 byte[] 과 호환이 되므로 따로 안배워도 된다 
		
		String t = "hello java~";
		byte[] b = t.getBytes();
		
		File target = new File("file","string1.txt");
		
		FileOutputStream out = new FileOutputStream(target);
		
				
		//CPU -> out -> target -> 실제파일
		//out.write(t);
		out.write(b);
		out.close();
	}
}
