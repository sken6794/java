package day11.inter.basic2;

public class GoldFish extends Fish implements IPet{

	@Override
	public void swim() {
		System.out.println("금붕어 금붕어");
		
	}

	@Override
	public void play() {
		System.out.println("금붕어 핸들링");
		
	}

}
