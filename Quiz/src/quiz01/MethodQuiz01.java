package quiz01;

public class MethodQuiz01 {

	public static void main(String[] args) {
		
		method1();
		System.out.println(method2("가"));
		System.out.println(method3(1,2,3.3));
		System.out.println(method4(10));
		method5(2,"가");
		System.out.println(maxNum(15,10));
		System.out.println(abs(-5));
		System.out.println(abs2(-5));
		char[] a = {'a','a','a','a'};
		System.out.println(method6(a));
		
		System.out.println(java(7));
	}

	static void method1() {
		System.out.println("안녕");
	}
	
	static String method2(String s) {
		
		return s;
	}
	/*
	static double method3(int a, int b, double c) {
		double sum = 0;
		sum = a + b + c;
		return sum;
	}
	*/
	static double method3(int a, int b, double c) {
		
		return a + b + c;
	}
	
	/*
	static String method4(int a) {
		String s = "";
		if(a%2 == 0) {
			s = "짝수";
		} else {
			s = "홀수";
		}
		
		return s;
	}
	*/
	
	static String method4(int a) {
		/*
		if(a%2 == 0) {
			return "짝수";
		} else {
			return "홀수";
		}
		*/
		return a % 2 == 0? "짝수" : "홀수" ; 
			
	}
	
	
	
	
	static void method5(int i, String s ) {
		for(int a = 1; a<= i; a++) {
			System.out.print(s+" ");
		}
		System.out.println();
	}
	
	static int maxNum(int a, int b) {
		/*
		if(a > b) {
			return a;
		} else {
			return b;
		}
		*/
		System.out.println("max");
		return a > b ? a : b ;
		
	}
	
	static int abs(int a) {
		/*
		if(a < 0) {
			a *= -1; 
		}
		*/
		return a > 0 ? a : -a;
	}
	
	static int abs2(int a) {

		if(a < 0) {
			a = -a; 
		}

		return a;
	}
	
	static String method6(char[] a) {
		String str = "";
		for (int i = 0; i < a.length; i++) {
			str += a[i];
		}
		
		
		return str;
	}
	
	static int method7(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
	
	
	
	static String[] method8(String s, String r) {
		String[] a = {s,r};
		return a; 
	}
	
	static String java(int a) {
		String s = "";
		for(int i = 1; i <= a; i++) {
			if(i%2 != 0) {
				s += "자";
			} else {
				s += "바";
			}
		}
		return s;
	}
	
	
	
}












