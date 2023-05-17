package quiz18;

import java.util.Scanner;
import java.util.StringTokenizer;

public class TokenQuiz01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringTokenizer to = new StringTokenizer(sc.nextLine());
		System.out.println("토큰 갯수 : "+to.countTokens());
		String[] toArr = new String[to.countTokens()];
		/*
		for(int i =0; i<toArr.length; i++) {
			toArr[i] = (i+1)+". "+to.nextToken();
		}
		for(String t : toArr) {
			System.out.println(t);
		}
		
		System.out.println(Arrays.toString(toArr));
		
		System.out.println(to.hasMoreTokens());
		*/
		//System.out.println((i+1)+". "+to.nextToken());
		
		for(int i = 1; to.hasMoreTokens(); i++) {
			String str = to.nextToken();
			toArr[i-1] = str;
			System.out.println(i+". "+str);
			
		}
		
	}
}
