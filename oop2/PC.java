package oop2;

public class PC {
	private BoxCase boxCase;
	private MotherBoard motherBoard;
	private Monitor monitor;
	
	public PC(BoxCase boxCase, MotherBoard motherBoard, Monitor monitor) {
		super();
		this.boxCase = boxCase;
		this.motherBoard = motherBoard;
		this.monitor = monitor;
	}
	
	public void powerUp() {
		boxCase.pressPowerButton();
		monitor.drawPixel(122, 255, "red");
		motherBoard.loadProgram("Windows Bootup");
	}
	
}
