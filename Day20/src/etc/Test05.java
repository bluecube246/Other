package etc;

import java.io.File;

public class Test05 {
	public static void main(String[] args) throws InterruptedException {
		// USB 자동 감지 프로그램
		int origin = 0;
		boolean[] check = new boolean[26];
		while (true) {
			int count = 0;
			for (char drive = 'A'; drive <= 'Z'; drive++) {
				String driveName = drive + ":";
				File file = new File(driveName);
				if (file.canRead()) {
					count++;
					if (!check[drive - 'A']) {
						System.out.println(driveName + "추가됨");
						check[drive - 'A'] = true;
					}
				} else if (check[drive - 'A'] == true && !file.canRead()) { // 제거된거
					System.out.println(driveName + "제거됨");
					check[drive - 'A'] = false;
					// System.out.println(file.exists() + "," + file.canRead());
				}
			}
			//밑에부터 없어도됨 
			if (origin > 0) {
				if (origin < count) {
					System.out.println("신규드라이브 추가");
				} else if (origin > count) {
					System.out.println("드라이버 제거됨");
				}
			}
			origin = count;

			// System.out.println("읽기 가능 드라이브 : "+ count + "개");
			Thread.sleep(500);
		}
	}
}
