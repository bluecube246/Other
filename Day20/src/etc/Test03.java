package etc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test03 {
	public static void main(String[] args) {
		String data = "Window 3.1, Window 95 Window 98, Window 2000, Window NT, Window XP";
		String regex = "(Window) (95|98|XP)"; 
		
		//정규표현식을 이용해 검사를 하려면 Matcher란 클래스가 필요
		Matcher m = Pattern.compile(regex).matcher(data);
		//.find() 더이상의 검색 결과가 있는가? 
		//.group() 결과를 반환 
		System.out.println(m.find());
		System.out.println(m.group(0)); //가장 바깥쪽 일치 결과 
		System.out.println(m.group(1)); //0번 바로 안쪽 () 내용
		System.out.println(m.group(2));
		
		while(m.find()){
			System.out.println(m.group(0));
			System.out.println(m.start(0));
			System.out.println(m.end(0));
			
			String s = m.group(0);
			data.replace(s, "윈도우 망해라");
		}
		
		System.out.println(data);
	}
}
