package oop3;

public class TestClassInterface {
	public static void main(String[] args) {
		ITInterface it = new DeskPhone();
		it.placeCall(9920);
		it.isRinging();
		
		ITInterface it2 = new DeskPhone();
		it.placeCall(992054);
		it.isRinging();
	}
}
