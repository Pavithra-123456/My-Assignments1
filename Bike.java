package week1.day1;

public class Bike {
	public void applybrake() {
		System.out.println("brakes not applied");
	}
	public void soundhorn() {
		System.out.println("no horn");
	}
public static void main(String[] args) {
	Bike yamaha=new Bike();
	Car hyundai=new Car();
	yamaha.applybrake();
	yamaha.soundhorn();
	hyundai.applyBrake();
	hyundai.soundhorn();
}
}
