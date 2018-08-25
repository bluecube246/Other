package etc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test03 {
	public static void main(String[] args) {
		String data = "Window 3.1, Window 95 Window 98, Window 2000, Window NT, Window XP";
		String regex = "(Window) (95|98|XP)"; 
		
		//����ǥ������ �̿��� �˻縦 �Ϸ��� Matcher�� Ŭ������ �ʿ�
		Matcher m = Pattern.compile(regex).matcher(data);
		//.find() ���̻��� �˻� ����� �ִ°�? 
		//.group() ����� ��ȯ 
		System.out.println(m.find());
		System.out.println(m.group(0)); //���� �ٱ��� ��ġ ��� 
		System.out.println(m.group(1)); //0�� �ٷ� ���� () ����
		System.out.println(m.group(2));
		
		while(m.find()){
			System.out.println(m.group(0));
			System.out.println(m.start(0));
			System.out.println(m.end(0));
			
			String s = m.group(0);
			data.replace(s, "������ ���ض�");
		}
		
		System.out.println(data);
	}
}
