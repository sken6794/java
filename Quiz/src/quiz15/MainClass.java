package quiz15;

public class MainClass {

	public static void main(String[] args) {
		
		IBag bag = new Bag();
		bag.insert("자바의정석");
		bag.insert("이것이 자바다");
		bag.insert("김영한의 스프링");
		bag.insert("이것이 자바다");
		bag.insert("토비의 스프링");
		bag.insert("오라클");
		bag.print();
		System.out.println(bag.search("자바의정석"));
		System.out.println(bag.delete("이것이 자바다"));
		bag.print();
	}

}
