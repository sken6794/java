package day11.inter.basic3;

public class LG implements Printed{
	
	private String logo = "Life is Good";
	
	
	
	@Override
	public void print(String document) {
		
		System.out.println(logo);
		System.out.println(document);
		
	}
	
	@Override
	public void colorPrint(String document, String color) {
		System.out.println(logo);
		System.out.println("색상 : "+color);
		System.out.println(color + "색상의 문서 : "+document);
		
	}
	
	@Override
	public int copy(int n) {
		
		for(int i = 0; i < n; i++) {
			System.out.println(i +"장 복사완료");
		}
		
		
		return 1; //완료시 1 반환
	}
	
	
}
