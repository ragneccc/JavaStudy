java里面继承

一个类只可以有一个父类（单继承多实现）{
	--子类可以直接访问 private 以外的属性和方法
	--可以间接访问 父类私有 属性和方法
}
	class Demo{
	}
	class SubDemo extends Demo{
	}
多层继承
类雨类之间有所属关系

super 与 this 用法基本相同
super 代表父类引用
当父类出现同名方法(重写)，可以用 super 区分
super();//调用父类的构造方法
java 所有类都是 Object 类子类

方法重写覆盖{
	名字，返回值，参数一样
	访问权限 相等或更大
}

子类 的实例化
	每个构造函数的第一行都有一个默认的代码 super();
	
final关键字 可以修饰 修饰类 方法 属性 {
	final 类不可以被继承（太监类）
	final 方法 继承后不能被复写 变成常量 所有必须要赋值
	内部类（方法中 类中）  应用监听器
	private final static int count = 19；《=等价=》 private static final int count = 19
	
}
