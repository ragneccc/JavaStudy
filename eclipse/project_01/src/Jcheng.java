//继承
class Student{
	private String name;
	private int age;
	
	void whoIsMe() {
		System.out.println("这是父类");
	}
	void print() {
		System.out.println("这是Student类"+name+"  "+age);
	}
}
class LGStudent extends Student{
	void print3() {
		System.out.println("这是zilei");
	}
	void whoIsMe() {
		System.out.println("这是子类");
	}
}

public class Jcheng {
	public static void main(String []args) {
		Student s = new Student();
		s.print();
		LGStudent lgs = new LGStudent();
		lgs.print3();
		lgs.whoIsMe();
		
	}
}