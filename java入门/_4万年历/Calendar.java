/*2018/1/8 16：18 耗时约2小时（真次）
这是一个失败的练习
问题
	1，判断任意年月第一天是星期几
	2，输出格式当第一天为周一时出现bug
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
		
		//确定月份的第一天星期数
		int firstweek=5;
		int numru=0;
		int numday=0;
		if(year>=2018&&month>=1){			//bug
			if(year==2018&&month==1)
				firstweek=1;
			else if(year>2018||month>1){
			for(i=year;i>2018;i--){
					if((i%400==0)||((i%100!=0)&&(i%4==0))){
						numru++;
			}
				}		
				numday=(year-2018)*365+numru;
			}					
		}
		else{
			for(i=year;i<2018;i++){
				if((i%400==0)||((i%100!=0)&&(i%4==0))){
					numru++;
		}
			}		
			numday=(2018-year)*365+numru;
		}
		switch(month){				//这里bug
			case 1:numday+=31;
			case 2:numday+=28;
			case 3:numday+=31;
			case 4:numday+=30;
			case 5:numday+=31;
			case 6:numday+=30;
			case 7:numday+=31;
			case 8:numday+=31;
			case 9:numday+=30;
			case 10:numday+=31;
			case 11:numday+=30;
			case 12:numday+=31;
			default :System.out.println("输入有误");
		}
		firstweek=(numday-1)%7;
		
		//按照格式打印日历
		System.out.println("                      公元"+year+"年"+month+"月");
		System.out.println("**********************************************************");
		System.out.println("*星期一  星期二  星期三  星期四  星期五  星期六  星期日  *");
		System.out.print("*");
		for(i=1;i<firstweek;i++)
		System.out.print("        ");
		for(i=1;i<=days;i++){
			
			if((firstweek+i-1)%7==1){
				System.out.println("*");
				System.out.print("*");
			}
			if(i<10)
			System.out.print("   "+i+"    ");
			else
			System.out.print("  "+i+"    ");	
		}i=0;
		while(i<(6-(firstweek-2+days)%7)){
		System.out.print("        ");
		i++;
		}
		System.out.println("*");
		System.out.println("**********************************************************");
	}
	
}
