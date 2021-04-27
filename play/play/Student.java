package play;

public class Student extends Person {
	Student(String name, int age) {
		// TODO Auto-generated constructor stub
		super(name, age);
	}
	public void study() {
		System.out.println(this.getName()+"同学在学习");
	}
}
