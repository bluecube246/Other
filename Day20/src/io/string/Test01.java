package io.string;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test01 {
	public static void main(String[] args) throws IOException {
		//String ���, ��ü������ byte[] �� ȣȯ�� �ǹǷ� ���� �ȹ���� �ȴ� 
		
		String t = "hello java~";
		byte[] b = t.getBytes();
		
		File target = new File("file","string1.txt");
		
		FileOutputStream out = new FileOutputStream(target);
		
				
		//CPU -> out -> target -> ��������
		//out.write(t);
		out.write(b);
		out.close();
	}
}
