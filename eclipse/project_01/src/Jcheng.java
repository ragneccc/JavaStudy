//�̳�
class Student{
	private String name;
	private int age;
	
	void whoIsMe() {
		System.out.println("���Ǹ���");
	}
	void print() {
		System.out.println("����Student��"+name+"  "+age);
	}
}
class LGStudent extends Student{
	void print3() {
		System.out.println("����zilei");
	}
	void whoIsMe() {
		System.out.println("��������");
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