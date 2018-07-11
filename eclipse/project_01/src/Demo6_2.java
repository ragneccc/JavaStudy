interface A{}
interface B{}
interface C extends A,B{} //接口可以多继承

interface Window{
	public static final int width = 2000;
	int leng = 300;
	
	public abstract void close();
	void open();
}
abstract class Window1 implements Window{//关键字 implments
	
}

class Window2 implements Window{//接口实现
	public void close() {
		System.out.println("close");
	};
	public void open() {
		System.out.println("open");
	};
}
public class Demo6_2 {
	public static void main(String []args) {
		Window w1 = new Window2();
		call(w1);
	}
	static void call(Window window){
		window.open();
		window.close();
	}
}



