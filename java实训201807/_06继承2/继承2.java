两个凡是{
	凡是含有抽象方法的类 就是抽象方法
	凡是 abstract 修饰的类都是抽象类
}
抽象{
	抽象  失误的共性，本质内容的抽取出来	
}
 抽象类{
	用来 当做一个模板
	抽象类 里面的方法
	abstract 和 final 是不共存的
} 

多态{
	不同参数 完成时限不同功能
}
多态使用的3个条件{
	1 一定有子类对父类的继承继承 或 父类接口的实现
	2 要子类对父类中方法的覆写 或 对 就父接口的实现
	3 用父类的引用指向子类的实现
}

接口{
	对外暴露的规则
	程序功能拓展
	接口可以多实现
	类与类之间是实现关系
	格式、
		interface{}
	修饰符固定的（就这两种）
		全局公共常量	public static final	类型 常量名(不写也会默认这种类型)
		公共方法		public abstract 函数模板名();
	
}

异常{
	Throwable
		error
			重大问题不可控
		exception
			异常类
			getMessage()
				获取异常信息返回字符串
			toString()
				获取异常类名和异常信息
			printStackTrace()
			printStackTrace(PrintStream s)
	throws 后跟异常类名（把异常抛给上一级处理异常）
	throw	用在函数内跟异常对象
	
	try{
		需要检测代码
	}
	catch（异常类 变量）
	{
		异常处理代码
	}
	finally{
		一定会执行的代码
	} 
	
	自定义异常
	
}
异常细节{
	方法被覆盖时，覆盖他的方法要跑出异常的子类
	遗产范围必能扩大
}

包package{
	对文件进行分类管理
	给类提供多层命名空间
	程序文件的第一行
	类名的全称的是  包名.类名的全称的是（不可以找到目录直接运行，，必须包含包名全称的包名）
	包也是一种封装形式
	
	
}

















