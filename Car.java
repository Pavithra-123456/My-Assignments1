package week1.day1;

public class Car {
public void applyBrake() {
	System.out.println("Applied brake");
}
public void soundhorn() {
	System.out.println("sound horn");
}
public static void main(String[] args) {
	Car hyundai=new Car();
	hyundai.applyBrake();
	hyundai.soundhorn();
}
}
