·相对于面向过程
·面向过程是功能行为
·类是个抽象的概念年
·类是一种数据类型

代码由类管理--代码全部存在于类当中

类里面有什么{
	属性
	方法{
		成原变量要赋初始值
	}
	
	一个文件只允许 有一个public类
}

默认构造方法会创建（不显示）
构造方法使用this关键字调用
	this.属性
	this.方法
	
构造方法 格式
	public 类名(参数列表)
	
	
抽象过程---->	
		类--->抽象类--->接口
		
一个对象可以多个名字
	Student s1 = new Student();
	Student s2 = s1;
	Student s3 = s1;
	
匿名对象（没有名字的对象）
	不声明保存对象的变量；
	new Student().print();
	方法和属性只用一次、
	匿名队形可以作为参数传递。


封装
	隐藏对象的属性和实现和实现细节	仅对外提供访问方式
	好处{
		变化隔离
		便于使用
		重要性
		安全性
	}
public	>	protected	>	default 	>	private

private :
	只有本类可以访问
default ：
	只有本包可以访问
private ：
	其他包的子类中可以访问
public ：
	任何地方可以访问
	
private
this  


static 
	静态方法中不可以写 this super 关键字
	静态方法只能访问静态成员(属性)
	用类直接调用静态方法
	
	
	
	
	