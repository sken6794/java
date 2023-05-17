package day13.api.util.random;

import java.util.Random;

public class RandomEx {
	public static void main(String[] args) {
		
		//double d = Math.random();
		
		Random r = new Random();
		int ranInt = r.nextInt();
		System.out.println(ranInt);
		
		int ranInt2 = r.nextInt(10)+1;
		System.out.println(ranInt2);
		
		double d = r.nextDouble();
		System.out.println(d);
		
		int i = (int)Math.sqrt(976);
		
		
	}
	
	
}
