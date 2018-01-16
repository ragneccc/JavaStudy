/* 2018 /1/16 17：07
1、设计打印8行杨辉三角形
2、找出其特点
1
1	1
1	2	1
1	3	3	1
1	4	6	4	1
1	5	10	10	5	1
1	6	15	20	15	6	1
1	7	21	35	35	32	7	1
	应用二维数组
*/
import java.util.Scanner;
public class YHtriangle{
	public static void main(String []args){
		int h=8;
		Scanner imput = new Scanner(System.in);
		System.out.print("请输入杨辉三角形的行数：");
		h = imput.nextInt();
		int [][] arr= new int[h][h];
		//对角线和第一列赋值 1 
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				if(j==0||j==i){
					arr[i][j]=1;
				}
				else 
					arr[i][j]=0;
			}
		}
		//遍历
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				if(i>=j)
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
		//处理得到杨辉三角形
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				if(i>j&&arr[i][j]==0)
					arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
			}
		}
		
		//处理后遍历
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				if(i>=j)
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
	}
}