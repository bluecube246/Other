package io.string;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test05 {
	public static void main(String[] args) throws IOException {
		// \\192.168.10.101\\황인빈\\2월 7시 자바절대 경로
		File target = new File("file", "수업 준비사항.txt");

		FileReader reader = new FileReader(target);
		BufferedReader buffer = new BufferedReader(reader);

		while (buffer.ready()) {
			String a = buffer.readLine();
			//if(s == nu11) break;
			System.out.println(a);
		}

		buffer.close();
	}
}
