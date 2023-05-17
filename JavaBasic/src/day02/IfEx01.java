package day02;

public class IfEx01 {

	public static void main(String[] args) {

		//Math.random
		//0~100
		int point = (int)(Math.random()*101);
		
		//커트라인 60점 
		if(point >= 60) {
			System.out.println(point +"점 합격");
		} else {
			System.out.println(point + "점 불합격");
			
		}
		System.out.println("수고");
		/*
		 * if(point < 60) { System.out.println(point + "점 불합격");
		 * 
		 * }
		 */
		
		
	}

}
