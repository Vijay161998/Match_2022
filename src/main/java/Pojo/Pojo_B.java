package Pojo;

public class Pojo_B {
	
	public static void main(String[] args) {
		
		Pojo_A a = new Pojo_A();
		System.out.println(a.getAge());
		
		int age =a.getAge();
		System.out.println("Age "+ age);
		
		a.setAge(32);
		int age_1=a.getAge();
		
		System.out.println("after the set age" +age_1);
		
		
	}

}
