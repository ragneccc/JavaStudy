abstract class Person{
	public Person() {
		
	}
	abstract void say();
}

class Worker extends Person{
	public Worker(){
		super();	//��仰���õĸ����Ĭ�ϿյĹ��췽��.����������๹�췽���ĵ�һ��
	}
	void say() {
		System.out.println("Worker");
	}
}
class Teacher extends Person{
	public Teacher(){
		super();	//��仰���õĸ����Ĭ�ϿյĹ��췽��.����������๹�췽���ĵ�һ��
	}
	void say() {
		System.out.println("Teacher");
	}
}
public class Class {
	public static void main(String [] args) {
		Person s1 = new Worker();
		Person s2 = new Teacher();
		call(s1);
		call(s2);
	}
	static void call(Person person) {
		person.say();
		if(person instanceof Teacher ) {
			Teacher t = (Teacher)person;
			t.say();
		}
	}
}
