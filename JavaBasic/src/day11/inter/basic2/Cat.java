package day11.inter.basic2;

public class Cat extends Animal implements IPet{

	@Override
	public void eat() {
		System.out.println("고양이 식사");
		
	}

	@Override
	public void play() {
		System.out.println("고양이 사냥놀이");
		
	}

}
