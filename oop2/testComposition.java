package oop2;

public class testComposition {
	public static void main(String[] args) {
		BoxCase boxCase = new BoxCase("221", "Acer", "220 Volts");
		MotherBoard motherBoard = new MotherBoard("120", "Dell", 4);
		Monitor monitor = new Monitor("1", "Asus", 4);
		PC pc = new PC(boxCase, motherBoard, monitor);
		pc.powerUp();
	}
}
