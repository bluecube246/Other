package io.string;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Test02 {
	public static void main(String[] args) throws IOException {
		//Writer 계열을 이용한 String 출력
		File target = new File("file","string2.txt");
		
		FileWriter writer = new FileWriter(target);
		//CPU -> writer -> target -> 실제파일 
		writer.write("여러분 안녕");
		writer.write("다음달에 만나요");
		//writer.close(); //flush 
		
		//버퍼와 엔터처리 도구를 추가 연결 
		BufferedWriter buffer = new BufferedWriter(writer);
		PrintWriter printer = new PrintWriter(buffer);
		//CPU -> printer -> buffer -> writer -> target -> 실제파일
		
		printer.println();
		printer.println();
		printer.println();
		printer.println("자바는 어려워");
		printer.println("자바는 재밌어");
		
		printer.close(); //flush
		
	}
	
}
