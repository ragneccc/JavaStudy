public class Dodo{	
	public static void main(String []args){
		int i,j;
		System.out.println("do三角形");
		i=1;
		do{j=1;
			do{
				System.out.print("*");
				j++;
			}
			while(j<=i);
			i++;
			System.out.println(" ");
		}
		while(i<12);
		System.out.println("while三角形");
		i=0;
		while(i<10){
			j=0;
			while(j<i){
				System.out.print(" ");
				j++;
			}
			while(j<10){
				System.out.print("*");
				j++;
			}
			i++;
			System.out.println(" ");
		}
		System.out.println("for三角形");
		for(i=0;i<8;i++){
			for(j=0;j<(20-i);j++){
				System.out.print(" ");
			}
			for(j=0;j<(i*2+1);j++){
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
	}
	
}
/*
在某些时候当程序出现汉子（包括注释部分）无法是用控制台编译
	可使用如下方法编译
		
		javac -encoding UTF-8  原文件.java

*/