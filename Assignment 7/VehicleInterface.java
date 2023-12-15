package com.inheritance;

interface VehicleOne{
	void start();
	void stop();
}

class CarOne implements VehicleOne{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Car Started");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Car Stopped");
	}
}

class MotorcycleOne implements VehicleOne{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Motorcycle Started");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Motorcycle Stopped");
	}
}

class TruckOne implements VehicleOne{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Truck Started");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Truck Stopped");
	}
}


public class VehicleInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VehicleOne[] v = new VehicleOne[3];
		
		v[0] = new CarOne();
		v[1] = new MotorcycleOne();
		v[2] = new TruckOne();
		
		for(int i=0;i<3;i++) {
			v[i].start();
		}
		
		for(int i=0;i<3;i++) {
			v[i].stop();
		}
	}

}
