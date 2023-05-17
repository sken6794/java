package day11.inter.basic3;

public class Samsung implements Printed{
	
	
	
	
	@Override
	public void print(String document) {
		System.out.println("삼성 : "+ document);
		
	}
	
	@Override
	public void colorPrint(String document, String color) {
		System.out.println(color + "삼성 : "+ document);
		
	}
	
	@Override
	public int copy(int n) {
		System.out.println("삼성 : "+n +"장 복사");
		return n;
	}
	
	
}
