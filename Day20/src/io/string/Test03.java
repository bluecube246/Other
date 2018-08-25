package io.string;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		File target = new File("file", "string3.txt");

		// FileWriter writer = new FileWriter(target);
		//
		// BufferedWriter buffer = new BufferedWriter(writer);
		// PrintWriter printer = new PrintWriter(buffer);

		PrintWriter printer = new PrintWriter(new BufferedWriter(new FileWriter(target)));

		while (true) {
			System.out.print("입력 : ");
			String a = in.nextLine();
			if (a.equals("end")) {
				printer.close();
				break;
			} else {
				printer.println(a);
				printer.flush(); // 컴퓨터가 꺼져도 저장이돤다
			}
		}

	}
}
