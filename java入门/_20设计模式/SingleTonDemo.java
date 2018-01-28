/*  设计模式

			GoF
			23种设计模式
	目的
		反复使用、容易理解
	eg.	
	单例模式(23种之一)
		单例类
		要点
			只有一个实例
			自行创建实例
			向系统提供实例
*/

public class  SingleTonDemo{
	public static void main(String [] aargs){
		SingleTon ton1 = SingleTon.getit();
		SingleTon ton2 = SingleTon.getit();
		
		S ton3 = S.getit();
		S ton4 = S.getit();
		S ton5 = S.getit();
		
		
	}
}

class SingleTon
{
	private static SingleTon t = new SingleTon();	//静态私有的 对象声明（只声明一次，
																	//外部不可调用）
	private SingleTon(){
		System.out.println("***");		//生成一次对象就 打印一次
	}
	public static SingleTon getit(){		//对外部提供接口
											//使用 类名.getit 传递出 唯一的对象地址
		return t;
	}
}

class S
{
	private static S n = null;		//这是一个属性,
							//先声明而不产生对象
	
	
	private S(){
		System.out.println("第二个函数");
	}
	//外部接口
	public static S getit(){	//判断后是否产生对象
		if(n == null){
			n = new S();
		}
		return n;
	}
}

