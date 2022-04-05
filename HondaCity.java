
public class HondaCity extends CarInheri1{
	private int mirrors;
	private int speed;
	
	public HondaCity(String companyName, String modelName, int wheels, int mirrors, int speed) {
		super(companyName, modelName, wheels);
		this.mirrors = mirrors;
		this.speed = speed;
	}
	
	public static void main(String[] args) {
		CarInheri1 hondaCity = new CarInheri1("Honda", "Honda", 10);
		hondaCity.company();
		hondaCity.noOfWheels();
		hondaCity.setWheels(5); //after providing intiial value from constructor, if one wants to 
		//change the value, use setter method it will update the value!
		hondaCity.noOfWheels();
	}
	
}
