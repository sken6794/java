package day11.inter.basic2;

public class Dog extends Animal implements IPet{

	@Override
	public void eat() {
		System.out.println("강아지 식사");
		
	}

	@Override
	public void play() {
		System.out.println("강아지 산책");
		
	}

}
