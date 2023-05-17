package quiz05;

public class Calculator {
	
	int result;
	double pi;
	
	void add(int a){
		result += a;
	}
	
	void sub(int a){
		result -= a;
	}
	
	double circle(int a) {
		pi = 3.14;
		
		return pi*a*a;
	}
}
