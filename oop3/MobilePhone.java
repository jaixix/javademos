package oop3;

public class MobilePhone implements ITInterface{

	@Override
	public void placeCall(double phoneNumber) {
		System.out.println("Phone is ringing from Mobile Phone!!!");
		
	}

	@Override
	public boolean isRinging() {
		System.out.println("Mobile Phone is ringing!!!");
		return true;
	}
	
}
