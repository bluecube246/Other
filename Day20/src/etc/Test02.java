package etc;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) throws IOException {
		//Ȩ������ �ҽ��ڵ带 �о���� Scanner 
		
		URL url = new URL("http://www.naver.com");
		
		Scanner in = new Scanner(url.openStream(),"UTF-8");
		
		while(in.hasNextLine()){
			String line = in.nextLine();
			System.out.println(line);
		}
		
		in.close();
	}
}
