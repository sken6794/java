package quiz11;

public class MainClass {

	public static void main(String[] args) {
		
		Computer com = new Computer(new KeyBoard(), new Monitor(), new Mouse());
		
		Computer com1 = new Computer();
		com1.computerInfo();
		
		com.computerInfo();
		com.getMonitor().info();
		
	}

}
