package etc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) throws FileNotFoundException {
		//Scanner�� �̿��Ͽ� ���� �б�
		File target = new File("file", "���� �غ����.txt");
		Scanner in = new Scanner(target);
		
		//.nextLine() ������ �о�Ͷ� 
		//.hasNextLine() ���� ������ �ִ°�?
		
		while(in.hasNextLine()){
			String s = in.nextLine();
			System.out.println(s);
			
		}
		
		in.close();
	}
}
