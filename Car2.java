
public class Car2 {
	private String carName;
	private String fuelType;
	private int wheels;
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public int getWheels() {
		return wheels;
	}
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}
	@Override
	public String toString() {
		return "Car2 [carName=" + carName + ", fuelType=" + fuelType + ", wheels=" + wheels + "]";
	}
	
	
}
