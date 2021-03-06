package oop2;

public class Monitor {
	private String model;
	private String manufacturer;
	private int size;
	
	public Monitor(String model, String manufacturer, int size) {
		super();
		this.model = model;
		this.manufacturer = manufacturer;
		this.size = size;
	}
	
	public void drawPixel(int x, int y, String color) {
		System.out.println("Drawing at " + x + ", " + y + " with color : " + color);
	}
}
