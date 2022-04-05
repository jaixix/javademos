
public class CarInheri1 {
	private String companyName;
	private String modelName;
	private int wheels;
	
	public CarInheri1(String companyName, String modelName, int wheels) {
		super();
		this.companyName = companyName;
		this.modelName = modelName;
		this.wheels = wheels;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	@Override
	public String toString() {
		return "CarInheri1 [companyName=" + companyName + ", modelName=" + modelName + ", wheels=" + wheels + "]";
	}
	
	public void company() {
		System.out.println(modelName + " is from Company : " + companyName);
	}
	
	public void noOfWheels() {
		System.out.println("Car Main class : Wheels :" + wheels);
	}
	
}
