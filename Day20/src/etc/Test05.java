package etc;

import java.io.File;

public class Test05 {
	public static void main(String[] args) throws InterruptedException {
		// USB �ڵ� ���� ���α׷�
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
						System.out.println(driveName + "�߰���");
						check[drive - 'A'] = true;
					}
				} else if (check[drive - 'A'] == true && !file.canRead()) { // ���ŵȰ�
					System.out.println(driveName + "���ŵ�");
					check[drive - 'A'] = false;
					// System.out.println(file.exists() + "," + file.canRead());
				}
			}
			//�ؿ����� ����� 
			if (origin > 0) {
				if (origin < count) {
					System.out.println("�űԵ���̺� �߰�");
				} else if (origin > count) {
					System.out.println("����̹� ���ŵ�");
				}
			}
			origin = count;

			// System.out.println("�б� ���� ����̺� : "+ count + "��");
			Thread.sleep(500);
		}
	}
}
