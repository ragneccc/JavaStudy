/*	面向对象编程 封装的概念 和 UML类图

		OOP三大特性
				封装		继承		多态
封装概念
	方法和属性封装在一个类里面
	实现信息的隐藏
	访问修饰符
		private			私有的 只能被本类访问
		protected		该类和其子类，以及同一个包里可以访问
		public			最大权限
		默认			同一个包中的类可以访问
	
UML类图
	统一建模语言
	图形化语言
	建模工具			
	starUML（类似下图）
			*************
			*	类名	*						‘-’ 私有
			*************						‘+’	公开
			*   +属性1  *	-age：int			‘#’	受保护
			*   -属性2  *	-name：String
			*************
			*   #操作   *	+sayHi()：void		
			*************
构造方法
	概念
		负责对象的初始化，为对象的属性赋合适的初始值
	语法规则
		构造方法 与 类名 一致
		无返回
		实现主要为 字段赋值
	调用方法
		很特别： new操作符（返回新建实例的引用）
	java 会系统保证每个类都有构造方法
	
	实现过程
			1 在堆分配内存空间
			2 复制共工作
			3 调用构造方法进行初始化
this关键字
	累的方法中使用 this ：调用此方法的对象的引用
	this 可看做一个变量，值为当前对象的引用
	可以处理方法中 的成员变量 和 形参同名的问题
	当方法内需要调用该方法的对象，可以用this


******在后面篇章	
staic关键字
方法重载
包（package）
*****************

*/


public class TeacherDemo
{
	public static void main(String [] args) {			//测试类
		Teacher t = new Teacher();
		//t.name = "zhangsna";
		t.setname("张三");
		System.out.println(t.getName());
		t.setAge(20);
		System.out.println(t.getAge());
	}
}

class Teacher
{
	private String name;
	private int age;
	
	
	public Teacher(){						//无参构造方法
		System.out.println("调用了无参构造方法");
	}
	public Teacher(String name){			//有参数的构造方法
		this();				//通过this调用其它构造方法
							//并且次语句必须是构造方法里面的第一个于语句
		this.name = name ;
	}
	public void setname(String tname){
		name = tname;
	}
	public String getName(){
		return name;
	}
	public void setAge(int age){
		if(age<25){
			System.out.println("too yang");			
			this.age = 25;						// this
		}
		else{
			this.age = age;
		}
	}
	public int getAge(){
		return this.age;
	}
}















