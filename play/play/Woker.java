package play;

public class Woker extends Person {
	Woker(String name, int age) {
		// TODO Auto-generated constructor stub
		super(name, age);
	}
	public void work() {
		System.out.println(this.getName()+"工人在工作");
		
	}
}
