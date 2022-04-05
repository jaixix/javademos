package oop2;

public class MotherBoard {
	private String model;
	private String manufacturer;
	private int ramSlots;
	
	public MotherBoard(String model, String manufacturer, int ramSlots) {
		super();
		this.model = model;
		this.manufacturer = manufacturer;
		this.ramSlots = ramSlots;
	}
	
	public void loadProgram(String programName) {
		System.out.println("Loading Program : " + programName);
	}
	
}