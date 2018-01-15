/*2018/1/15 16：06
*/
import java.util.Scanner;
public class Calendar{
	public static void main(String []args){
		int year;
		int month;
		int days=0;
		boolean ru;
		
		//输入年月以上为判断闰年，和月的天数
		Scanner input = new Scanner(System.in);
		System.out.print("pelase Enter the year: ");
		year = input.nextInt();

		System.out.print("please Enter the month: ");
		month = input.nextInt();
		
		//确定闰年和月份天数
		if((year%400==0)||((year%100!=0)&&(year%4==0))){
			ru = false;		// 闰年
			System.out.print("                 闰年 "+year+" 年");
		}
		else{
			ru = true;		// 平年	
			System.out.print("                 平年 "+year+" 年");
		}	
		if(month==2&&ru==false)//天数判断
			days = 29;
		else if(month==2&&ru==true)
			days = 28;
		else if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)
			days = 31;
		else if(month==4||month==6||month==9||month==11)
			days = 30;
		System.out.println(" "+month+" 月共 "+days+" 天");	
		
		
		int i;			//循环用的变量
		int alldays=0;
		int firstweek;
		int thisdays;
		//确定月份的第一天星期数
		for(i=1900;i<year;i++){
			if((i%400==0)||((i%100!=0)&&(i%4==0))){
				alldays+=366;
			}
			else
			alldays+=365;
			
		}
		for(i=1;i<month;i++){
			if(i==1||i==3||i==5||i==7||i==8||i==10||i==12){
				alldays+=31;
			}
			if(i==4||i==6||i==9||i==11){
				alldays+=30;
			}
			if(i==2){
				if(ru)
					alldays+=28;
				else
					alldays+=29;
			}
				
		}
		firstweek=1+(alldays)%7;
		
		System.out.println("firstweek:"+firstweek);
		
		//按照格式打印日历
		System.out.println("\t\t\t公元"+year+"年"+month+"月");
		System.out.println("********************************************************");
		System.out.println("星期日\t星期一\t星期二\t星期三\t星期四\t星期五\t星期六");
		for(i=0;i<firstweek;i++){
			if(firstweek!=7)
			System.out.print("\t");
		}
		for(i=1;i<=days;i++){
			if((i+firstweek)%7!=0)
			System.out.print(i+"\t");
			else
			System.out.println(i+"\t");
		}
	}
	
}
