/*
 二维数组 --> 以数组为元素的数组
 任何的而未数组，第一维决定了第二维大小
 第二维数组未定义时 可以不统一长度
*/
public class Array2{
	public static void main(String []args){
		int [][] arr1 = new int[10][];//未定第二维长度
		int [][] arr2 = new int[10][20]; 
		int [][] arr = {{1,2},{23,5},{2,3}};//静态初始化
		int [][] a4 = new int [3][];
		//动态初始化
			//高维指向低维
			a4[0]=new int[2];
			a4[1]=new int[3];
			a4[2]=new int[4];
			//给低维赋值
			a4[0][0]=1;
			a4[0][1]=2; 
			a4[1][0]=3;
			a4[1][1]=4;
			a4[1][2]=5;
			a4[2][0]=6;
			a4[2][1]=7;
			a4[2][2]=8;
			a4[2][3]=9;
		//遍历
		for(int i=0;i<a4.length;i++){
			for(int j=0;j<a4[i].length;j++){
				System.out.print(a4[i][j]+"\t");
			}
			System.out.println();
		}		
	}
}   