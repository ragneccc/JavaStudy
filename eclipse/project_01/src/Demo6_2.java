interface A{}
interface B{}
interface C extends A,B{} //�ӿڿ��Զ�̳�

interface Window{
	public static final int width = 2000;
	int leng = 300;
	
	public abstract void close();
	void open();
}
abstract class Window1 implements Window{//�ؼ��� implments
	
}

class Window2 implements Window{//�ӿ�ʵ��
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



