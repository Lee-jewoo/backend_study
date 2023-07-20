package com.car;

public class CarTest {

	public static void main(String[] args) {
		
		L3 car1 [] = new L3[1];
		L5 car2 [] = new L5[1];
		car1[0] = new L3("L3", "1500", 50, 25, 0);
		car2[0] = new L5("L5", "2000", 70, 35, 0);
		
		System.out.println("vehicleName \t engineSize \t oilTank \t oilSize \t distance \t temperature");
		System.out.println("---------------------------------------------------------------------------------------------");
		System.out.println(car1[0].getName()+" \t\t "+car1[0].getEngine()+" \t\t "+car1[0].getOilTank()+" \t\t "+car1[0].getOilSize()+" \t\t "+car1[0].getDistance()+" \t\t "+car1[0].getTempGage());
		System.out.println(car2[0].getName()+" \t\t "+car2[0].getEngine()+" \t\t "+car2[0].getOilTank()+" \t\t "+car2[0].getOilSize()+" \t\t "+car2[0].getDistance()+" \t\t "+car2[0].getTempGage());
		System.out.println();
		
		car1[0].setOil(25);
		car2[0].setOil(25);
		System.out.println("25 주유");
		System.out.println("vehicleName \t engineSize \t oilTank \t oilSize \t distance \t temperature");
		System.out.println("---------------------------------------------------------------------------------------------");
		System.out.println(car1[0].getName()+" \t\t "+car1[0].getEngine()+" \t\t "+car1[0].getOilTank()+" \t\t "+car1[0].getOilSize()+" \t\t "+car1[0].getDistance()+" \t\t "+car1[0].getTempGage());
		System.out.println(car2[0].getName()+" \t\t "+car2[0].getEngine()+" \t\t "+car2[0].getOilTank()+" \t\t "+car2[0].getOilSize()+" \t\t "+car2[0].getDistance()+" \t\t "+car2[0].getTempGage());
		System.out.println();
		
		car1[0].go(80);
		car2[0].go(80);
		System.out.println("80 주행");
		System.out.println("vehicleName \t engineSize \t oilTank \t oilSize \t distance \t temperature");
		System.out.println("---------------------------------------------------------------------------------------------");
		System.out.println(car1[0].getName()+" \t\t "+car1[0].getEngine()+" \t\t "+car1[0].getOilTank()+" \t\t "+car1[0].getOilSize()+" \t\t "+car1[0].getDistance()+" \t\t "+car1[0].getTempGage());
		System.out.println(car2[0].getName()+" \t\t "+car2[0].getEngine()+" \t\t "+car2[0].getOilTank()+" \t\t "+car2[0].getOilSize()+" \t\t "+car2[0].getDistance()+" \t\t "+car2[0].getTempGage());

		
		
		
	}

}
