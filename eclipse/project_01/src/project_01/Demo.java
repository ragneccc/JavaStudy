package project_01;

public class Demo {

	public static void main(String[] args) {
		for(int i=9;i>=1;i--) {
			for(int j=1;j<=i;j++) {
						System.out.print(" ");	
						
					
				}
			
			for(int k =9;k>=i*2-5;k-- )
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
				
	}

}
