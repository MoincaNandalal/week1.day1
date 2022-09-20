package week1.day1;

public class Car {
	
	public void driveCar() {
		// TODO Auto-generated method stub
System.out.println("Car Stared");
	}
	public void applyBrake() {
		// TODO Auto-generated method stub
		System.out.println("Applied brake");

	}
	public void soundHorn() {
		// TODO Auto-generated method stub
		System.out.println("Press Horn");

	}
	public void isPuncture() {
		// TODO Auto-generated method stub
System.out.println("Tyre is fine");
	}

	public static void main(String[] args) {
		Car obj = new Car();
		obj.driveCar();
		obj.applyBrake();
		obj.soundHorn();
		obj.isPuncture();

	}

}
