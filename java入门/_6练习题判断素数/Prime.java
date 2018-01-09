public class Prime {  
public static void main(String args[]){  
    int i,j,n,m,x;       
    n=0;m=0;x=0;        //素数的个数  
    for(i=101;i<=500;i++){       
        for(j=1;j<=i;j++){         
            n=i%j;                    //因子  
            if(n==0)  { m=m+1; }      //因子数  
            }   
     if(m==2){System.out.print(i+" "); x=x+1;} //因子有两个一定是素数  
          m=0;            //清零  
        }  
       System.out.println();  
       System.out.println("在101~200之間一共有素數："+x+"個");  
        }  
   }  