package etc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;

public class Test04 {
	public static void main(String[] args) throws FileNotFoundException {
		//���� ����â : JFileChooser (javax.swing ��Ű��) //java.awt javax.swing 
		
		JFileChooser fc = new JFileChooser(/*���*/);
		
		//[1] ���� ���� .showOpenDialog()
		int choice = fc.showOpenDialog(null);
		System.out.println("choice = " + choice);
		
		if(choice == 0){
			//���� ���� ���� 
			File target = fc.getSelectedFile(); //new ��� ����� �ƴ϶� ���°�
			
			Scanner in = new Scanner(target);
			while(in.hasNextLine()){
				System.out.println(in.nextLine());
			}
			in.close();
		}
		
		//[2] ���� ����  .showSaveDialog()
		
	}
}
