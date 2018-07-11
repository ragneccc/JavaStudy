//封装
class Student{
	private String name;
	private int age;
	
	public Student(String name,int age) {
		this.name = name;
		this.age = age;
	}
	void print() {
		System.out.println("这是Student类"+name+"  "+age);
	}
}

public class Demo1 {
	public static void main(String []args) {
		Student s = new Student("zhangsan",5);
		s.print();
		Student b = new Student("wang",8);
		b.print();
	}
}
