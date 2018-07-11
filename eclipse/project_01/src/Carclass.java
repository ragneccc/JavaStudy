
class CarText {
	String color ="red";
	int number =4;
	
	public CarText(String color) {
		this.color = color;
	}
	
	void show() {
		System.out.println("汽车颜色"+color);
		System.out.println("轮胎个数"+number);
	}
}

public class Carclass{
	public static void main(String[]args) {
		CarText car = new CarText("baide");
		//car.color="黑";
		car.number=8;
		car.show();
	}
}