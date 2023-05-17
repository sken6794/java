package day11.inter.basic2;

public class MainClass {

	public static void main(String[] args) {
		
		Animal dog = new Dog();
		Animal cat = new Cat();
		Animal tiger = new Tiger();
		Animal[] animals = {dog, cat, tiger};
		for(Animal ani : animals) {
			ani.eat();
		}
		
		//dog, cat은 인터페이스 타입으로 형변환이 된다.
		//dog, cat, goldfish를 저장하고, 반복문
		IPet[] pets = new IPet[3];
		pets[0] = (IPet)cat;
		pets[1] = (IPet)dog;
		pets[2] = new GoldFish();
		for(IPet pet : pets) {
			pet.play();
		}
		
		PetHouse.carePet((IPet)dog);
		PetHouse.carePet((IPet)cat);
		
	}

}
