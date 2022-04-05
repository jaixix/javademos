package oop3;

public class DeskPhone implements ITInterface{

	public void placeCall(double phoneNumber) {
		System.out.println("Calling : " + phoneNumber);
	}

	@Override
	public boolean isRinging() {
		System.out.println("The number us ringing!"); 
		return true;
	}
	
}
