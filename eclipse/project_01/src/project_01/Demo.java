package project_01;

import java.util.Scanner;
public class Demo {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int x = input.nextInt();
		int a[]= new int[x];
		for(int i=0;i<a.length;i++)
		{
			a[i]=i+1;
			
		}
		System.out.println(add(a));		
	}
	static int add(int a[])
	{
		int sum = 0;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}
		return sum;
	}
}
