package quiz22;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexQuiz02 {
	public static void main(String[] args) {
		
		String str = "123123-1231231 GS25(치킨마요) 4,400원";
		String str2 = "123123-1231232 GS25(주부18단) 5,000원";
		
		String pattern = "\\d{6}-\\d{7}";
		String pattern2 = "[A-Za-z]+25";
		//String pattern2 = "[A-Z]+\\d*";
		//String pattern2 = "[A-Z]{2}[0-9]{2}";
		String pattern3 = "\\([가-힣0-9]+\\)";
		//String pattern3 = "\\(+[가-힣0-9]*\\)";
		//String pattern3 = "\\([가-힣]{2,4}[0-9]*단*\\)";
		//String pattern4 = "\\d*,+\\d*원";
		String pattern4 = "[0-9,]+원";
		
		List<String> list = Arrays.asList(str,str2);
		for (int i = 0; i < list.size(); i++) {
			
			String t = list.get(i);
			Matcher m = Pattern.compile(pattern).matcher(t);
			Matcher m2 = Pattern.compile(pattern2).matcher(t);
			Matcher m3 = Pattern.compile(pattern3).matcher(t);
			Matcher m4 = Pattern.compile(pattern4).matcher(t);
			
			if(m.find() && m2.find() && m3.find() &&m4.find()) {
				System.out.println(m.group());
				System.out.println(m2.group());
				System.out.println(m3.group());
				System.out.println(m4.group());
			}
			
		}
		
		
		
		
		
		
	}
}
