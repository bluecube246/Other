package io.string;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Test02 {
	public static void main(String[] args) throws IOException {
		//Writer �迭�� �̿��� String ���
		File target = new File("file","string2.txt");
		
		FileWriter writer = new FileWriter(target);
		//CPU -> writer -> target -> �������� 
		writer.write("������ �ȳ�");
		writer.write("�����޿� ������");
		//writer.close(); //flush 
		
		//���ۿ� ����ó�� ������ �߰� ���� 
		BufferedWriter buffer = new BufferedWriter(writer);
		PrintWriter printer = new PrintWriter(buffer);
		//CPU -> printer -> buffer -> writer -> target -> ��������
		
		printer.println();
		printer.println();
		printer.println();
		printer.println("�ڹٴ� �����");
		printer.println("�ڹٴ� ��վ�");
		
		printer.close(); //flush
		
	}
	
}
