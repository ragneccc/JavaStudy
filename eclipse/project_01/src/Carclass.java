
class CarText {
	String color ="red";
	int number =4;
	
	public CarText(String color) {
		this.color = color;
	}
	
	void show() {
		System.out.println("������ɫ"+color);
		System.out.println("��̥����"+number);
	}
}

public class Carclass{
	public static void main(String[]args) {
		CarText car = new CarText("baide");
		//car.color="��";
		car.number=8;
		car.show();
	}
}