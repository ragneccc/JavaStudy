/* 方法 定义和调用				个人理解类似c语言的 函数

类的方法代表是实例的某种行为 （或功能）
	方法类型
	方法签名
	方法体
定义类的方法 
		访问修饰 方法类型 方法名(参数列表){		//方法名加参数列表 = 方法签名
			//方法体
		}
	步骤	1定义方法签名及返回值类型
			2书写方法体
方法的分类
	返回值为空 void 的方法；
	带有具体返回类型的方法；
	不带参数的方法；但带返回类型
	带参数的方法；
方法的返回值：
		如果方法有返回值，方法中必须有 return 语句；返回特定类型值
	方法可以调用其它方法
方法的调用
		对象名 . 方法名();
	java调用带参数的方法采用：值传递方式
		参数为基本数据类型，传递数值（直接）
		参数为对象或数组，传递引用值
		都是拷贝的过程 
	形参（调用处）
	实参（方法处）
变量的作用域
	声明位置确定作用域
		字段（类的属性）	类内可用
		局部部变量（方法内可用）
*/

//方法定义调用实例
public class MethodDemo
{
	public void methdo1(){
		System.out.println("f返回类型为空的且无参数的方法");
	}
	public String methdo2(){
		return "带返回无参数方法";
	}
	public void methdo3(String name){
		System.out.println("返回为空有参数，参数为："+name);
	}
	public String methdo4(String name,int age){
		return "有返回值，带俩参数方法，参数分别为"+name+" "+age;
	}
	
	//引用数据类型传参数
	public void operatorArray(int[] array){
		array[2] = 100;
		System.out.println(array[2]);
	}
	 
	 public static void main(String []args){
		MethodDemo demo = new MethodDemo();
		demo.methdo1();
		demo.methdo3("张三李四王五");
		System.out.println(demo.methdo2());
		System.out.println(demo.methdo4("李华小明",18));
		
		int[] array = {15,5,6,3,6};
		demo.operatorArray(array);
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+"\t");
		}
		
	}
}

















