package play;

public class Person02 {
	private String name;
	private int age;
	//构造代码块
	{
		System.out.println("构造代码块");
	}
	Person02() {
		System.out.println("person无参构造函数");
	}
	Person02(String name){
		System.out.println("有参"+name);
	}
	


}