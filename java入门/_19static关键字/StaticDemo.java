/*	static关键字
特点
	修饰类的成员
		修饰成员属性---类变量（静态变量）
		修饰成员方法---类方法（静态方法）
	用static修饰之后 访问 不在是 对象名.属性 -> 而是  类名.属性（都可以）
		使被修饰的成员属于所有方法，
	当类被加载时就会被加载 ，优先于对象的存在
	修饰语句块---称为 静态代码块
		先于构造方法 执行 ，只执行一次
		静态成员初始化
			static{
				number2 = 2；
			}
	静态修饰的成员被所有对象共享
注意事项	
	static方法执行前 还没有产生对象
		静态方法 只能访问 外部的静态成员
		静态方法不能出现this关键字
*/
public class StaticDemo{
	public static void main(String [] args){

		
		Account acc1 = new Account();
		acc1.number1++;
		acc1.showNumber1();
		acc1.showNumber2();
		System.out.println(Account.number2);
		Account acc2 = new Account();
		acc2.showNumber1();
		acc2.showNumber2();
	}
}

class Account
{
	public int number1 = 1;
	public static int number2 = 2;
	
	public void showNumber1(){
		System.out.println(number1);
	}
	public void showNumber2(){
		System.out.println(number2);
	}
}