package oop2;

public class BoxCase {
	private String model;
	private String manufacturer;
	private String powerSupply;
	
	public BoxCase(String model, String manufacturer, String powerSupply) {
		super();
		this.model = model;
		this.manufacturer = manufacturer;
		this.powerSupply = powerSupply;
	}
	
	public void pressPowerButton() {
		System.out.println("Power button pressed!");
	}
}
