package etc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;

public class Test04 {
	public static void main(String[] args) throws FileNotFoundException {
		//파일 선택창 : JFileChooser (javax.swing 패키지) //java.awt javax.swing 
		
		JFileChooser fc = new JFileChooser(/*경로*/);
		
		//[1] 파일 열기 .showOpenDialog()
		int choice = fc.showOpenDialog(null);
		System.out.println("choice = " + choice);
		
		if(choice == 0){
			//파일 열기 수행 
			File target = fc.getSelectedFile(); //new 없어서 만든게 아니라 얻어온거
			
			Scanner in = new Scanner(target);
			while(in.hasNextLine()){
				System.out.println(in.nextLine());
			}
			in.close();
		}
		
		//[2] 파일 저장  .showSaveDialog()
		
	}
}
