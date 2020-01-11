package com.factorymethoddemoOne;

public class Client {

	public static void main(String[] args) 
	{
		VehicleFactory factory = new VehicleFactory();
		Vehicle v = factory.Create(VehicleType.VT_ThreeWheeler);
		v.printVehicle();

	}

}
