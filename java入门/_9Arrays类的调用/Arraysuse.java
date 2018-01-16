/*
	一、初次接触java的库文件
java里面有Api文档编写程序时可以调用
类似之前学的STM32的库函数
此处演示Arrays相关的包 
*/

import java.util.Arrays;
public class Arraysuse{
	public static void main(String []args){
		
	int [] a = {1,5,4,2,6,7,4,1};
	//拷贝a中数组赋值给大小为10的数组 a0[] 中
	int [] a0 = Arrays.copyOf(a,10);
	for(int i=0;i<a0.length;i++)
		System.out.print(a0[i]+" ");
	System.out.println();
	
	//拷贝从下标为3个数为（5-3）的数组赋值给 a1[ ]
	int [] a1 = Arrays.copyOfRange(a,3,6);
	Arrays.copyOf(a,10);//拷贝数数组
	for(int i=0;i<a1.length;i++)
		System.out.print(a1[i]+" ");
	
	//数组比较 返回 布尔类形
	System.out.println();
	int [] aa = {1,5,4,2,6,7,4,1};
	boolean boa = Arrays.equals(a,aa);//相同为ture
	System.out.println(boa);
	
	//数组填充
	int [] a2 = new int[8];
	Arrays.fill(a2,10);//全部填从10
	for(int i=0;i<a2.length;i++)
		System.out.print(a2[i]+" ");
	System.out.println();
	Arrays.fill(a2,1,5,5);//仅队1-5填充5
	for(int i=0;i<a2.length;i++)
		System.out.print(a2[i]+" ");
	
	//排序
	System.out.println();
	Arrays.sort(a);
	for(int i=0;i<a.length;i++) 
		System.out.print(a[i]+" ");
	//二分法
	 
	//使用System的方法进行拷贝数组
	System.out.println();
	int [] a5 = new int[10];
	System.arraycopy(a,0,a5,3,5);
		//从 a里地0个元素开始拷贝5个元素到a5的第三个元素
	for(int i=0;i<a5.length;i++) 
		System.out.print(a5[i]+" ");
	
	}
} 
/*

*/