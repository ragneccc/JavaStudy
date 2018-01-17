/* String 对象创建
		String s = "常用创建方法"；
			String s1 = "abcd";
			String s2 = "abcd";
			s1 == s2 -> ture; //地址相同
		String s = new String("不常用的创建方式");
			String s1 = new String("abcd");
			String s2 = new String("abcd");
			s1 == s2 -> false; //地址不相同
特点：			
	String对象是不可变的
	类中看似修改String值得方法，其实都是创建了新的String对象
	String的只读特性能
	String创建会先看看字符串池里有没有相同的，没有才会真正创建，有则地址赋值
	系统String非修改效率远高于另外俩字符串类型 StringBuffer StringBuilder（用于修改比较好）
String队形的常用方法
	length() //返回此字符的长度；
	charAt(int index) //返回指定索引处的char值
	concatenate(String str)	//指定字符串链接到次字符串的结尾
	contains(CharSequence s) //是否包含指定字符串序列
	equals(Object anObject) //将此字符串与制定对象比较
	compareTo(String anotherString) //按字典顺序比较字符串
	idexOf(int ch) //返回指定字符在此字符串第一次出现处的索引
	split(String regex) //根据匹配给定的正测表达式来拆分字符串
	substring(int beginIndex) //截取字符串
	toLower/uperCase() //大小写转换
	。。。。。（参照api文档）

*/

/* 面向对象的优点

便于模拟现实实体
隐藏细节
可重用性
*/
/* java内存管理机制

管理机制
	new 创建对象，在堆内存分配对象空间、初始化
	在方法栈中定义局部变量，持有对堆内存中对象的引用
	方法执行完，栈内存释放，局部变量销毁
	堆内存中没有对象引用它，->垃圾 垃圾回收器回收
垃圾回收器
	java运行时系统有一个垃圾回收线程负责清楚不适用的对象 ->垃圾回收器
	回收器定时扫描内存，对被使用的对象加上标记，按可能路径扫描结束后清楚未家标记的对象
	被回收的对象
		不被任何变量引用的对象
		引用变量自动放弃
		人为的将引用变量置为null

*/

public class StringDemo
{
	public static void main(String [] args){
		String con = "hello,my friend.I am your friend";
		System.out.println(con);
		System.out.println(con.charAt(2));
		System.out.println(con.compareTo("Hello")); //比较字符串返回字符串首歌不同字符串的差值
		con = con.concat("I led"); //字符串链接
		con = con + " Iled";
		System.out.println(con);
		//endsWith；  bool
		//startWith；	bool
		System.out.println(con.contains("my")); //bool 是否包含 my
		String s1 = "abcd";
		String s2 = "abcd";
		System.out.println(s1==s2);	//ture
		System.out.println(s1.equals(s2)); //ture
		System.out.println(con.indexOf("o"));  // o首次出现位置下标    4
		System.out.println(con.lastIndexOf("o"));	//o最后出现的位置下标	22
		System.out.println(con.indexOf("o",5));	//从第5个位置开始 第一次出现 o 的下标  22
		System.out.println(con.length());  //长度 	 42
		System.out.println(con.replace('l','m'));  //将字符串中所有的 l 替换为 m
		
		String [] arr = con.split(" "); //以空格拆分字符串 返回到 数组
			System.out.println(arr.length);
			for(int i = 0;i<arr.length;i++){
				System.out.print(arr[i]+"\t");
			}
		System.out.println(con.substring(5));	//从第5个位置开始裁剪 包括5
		System.out.println(con.substring(5,9));
		System.out.println(con.toLowerCase());	//全部变小写
		System.out.println(con.toUpperCase()); //全部便大写
	}	
	
}