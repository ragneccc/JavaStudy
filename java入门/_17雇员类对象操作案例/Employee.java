/* 雇员对象操作

案例简介
		定义一个雇员类
			显示个人信息（姓名/年龄）
			统计指定字符在字符串种中出现的次数
运行结果
			我的名字是：
			zhangsan
			今年 20 岁
			指定字符出现了 _ 次
实现过程/案例设计
	创建雇员类，设置对应的属性和方法
	创建雇员对象，给属性赋值/调用相关功能

*/

public class Employee{
	public String name;
	public int age;
	
	public String toString(){
		return"我的名字叫"+name+"今年："+age+"岁";
	}
	public int finenum(String src,String dst){
		int count = 0; //计数器
		int i;
		i = src.indexOf(dst);
		while(i != -1){
			count++;
			i+= dst.length();
			i = src.indexOf(dst,i);			
		}
		return count;
	}
	public static void main(String []args){
		Employee emp = new Employee();
		emp.name = "zhngsan";
		emp.age = 52;
		System.out.println(emp.toString());
		String src = "一天一天过了一天又一天";
		String dst = "一天";
		System.out.println(emp.finenum(src,dst));
	}
	
}