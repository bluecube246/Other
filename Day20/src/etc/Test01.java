package etc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) throws FileNotFoundException {
		//Scanner를 이요하여 파일 읽기
		File target = new File("file", "수업 준비사항.txt");
		Scanner in = new Scanner(target);
		
		//.nextLine() 문장을 읽어와라 
		//.hasNextLine() 읽을 문장이 있는가?
		
		while(in.hasNextLine()){
			String s = in.nextLine();
			System.out.println(s);
			
		}
		
		in.close();
	}
}
