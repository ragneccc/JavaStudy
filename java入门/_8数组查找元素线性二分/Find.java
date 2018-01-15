import java.util.Scanner;
public class Find{
	public static void main(String []args){
		int s,i;
		int a[]={0,11,22,33,44,55,66,77,88,99};
		Scanner input = new Scanner(System.in);
		for(i=0;i<10;i++){
			System.out.print(a[i]+"\t");
		}
		System.out.println("");
		System.out.println("查找元素：");
		s = input.nextInt();
		for(i=0;i<a.length;i++){
			if(a[i]==s){
				System.out.print("位置在："+i);
				break;
			}else{
				if(i==a.length-1){
				System.out.print("不存在");
				}
			}
		}
	}
}