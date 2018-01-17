/*	对象的创建和使用 基本概念原理

一、创建并使用对象
		使用 new 关键字创建对象
			实例：
				public class Example{ //本来是一个抽象的概念类
					int field1;
					double field2; //俩属性
					public static void main(String[] args){	//程序入口点
						Example e = new Example();//注释1
					}
				}
				注释1：Example e = new Example:定义一个 Example类 类型的对象 存储在 堆内存中
					返回一个堆内存的内存地址赋值给 e （e为Example类型）
					这个堆的大小根据 Example 类的属性 来分配
		对象的声明、创建 与 赋值有3步骤
			Dog = myDog  =  new Dog();
				1		 3		2 
			1、要求java虚拟机分配内存空间给引用变量 命名为：myDog
					存在栈内存
					myDog 被固定为 Dog 类型
					是控制 Dog 的遥控器 而不是 其他的 
			2、要求虚拟机分配空间创建 Dog 对象； new Dog();
			3、堆地址赋值给引用变量 myDog 
		使用成员访问符“.”来操作对象
			给对象属性赋值
					对象名.属性 = 值;
			对对象发送消息/调用方法
					对象名.方法();
				实例：
				Example e = new Example();
				e.field1 = 100;
				System.out.print(e.toString());
*/
class Dog
{
	public String brand;//品种
	public int age;//年龄
	
	//方法
	public String toString(){		//返回String 类型的方法 名字为toString
		return "这是一条 "+age+" 岁的 "+brand+" 品种的疯狗疯狗";
	}
	public static void main(String []args){
		Dog dog = new Dog();//构造了一个Dog类型的对象
		dog.brand = "中华田园犬";
		dog.age = 80;
		System.out.print(dog.toString());//调用方法并将返回的值打印
	}
}













