package com.car;

public class CarTest {

	public static void main(String[] args) {
		
		Car car [] = {new L3("L3", "1500", 50, 25, 0),
					  new L5("L5", "2000", 70, 35, 0)};

		
		System.out.println("vehicleName \t engineSize \t oilTank \t oilSize \t distance \t temperature");
		System.out.println("---------------------------------------------------------------------------------------------");
		System.out.println(car[0].getName()+" \t\t "+car[0].getEngine()+" \t\t "+car[0].getOilTank()+" \t\t "+car[0].getOilSize()+" \t\t "+car[0].getDistance()+" \t\t "+((L3)car[0]).getTempGage());
		System.out.println(car[1].getName()+" \t\t "+car[1].getEngine()+" \t\t "+car[1].getOilTank()+" \t\t "+car[1].getOilSize()+" \t\t "+car[1].getDistance()+" \t\t "+((L5)car[1]).getTempGage());
		System.out.println();
		
		car[0].setOil(25);
		car[1].setOil(25);
		System.out.println("25 주유");
		System.out.println("vehicleName \t engineSize \t oilTank \t oilSize \t distance \t temperature");
		System.out.println("---------------------------------------------------------------------------------------------");
		System.out.println(car[0].getName()+" \t\t "+car[0].getEngine()+" \t\t "+car[0].getOilTank()+" \t\t "+car[0].getOilSize()+" \t\t "+car[0].getDistance()+" \t\t "+((L3)car[0]).getTempGage());
		System.out.println(car[1].getName()+" \t\t "+car[1].getEngine()+" \t\t "+car[1].getOilTank()+" \t\t "+car[1].getOilSize()+" \t\t "+car[1].getDistance()+" \t\t "+((L5)car[1]).getTempGage());
		System.out.println();
		
		car[0].go(80);
		car[1].go(80);
		System.out.println("80 주행");
		System.out.println("vehicleName \t engineSize \t oilTank \t oilSize \t distance \t temperature");
		System.out.println("---------------------------------------------------------------------------------------------");
		System.out.println(car[0].getName()+" \t\t "+car[0].getEngine()+" \t\t "+car[0].getOilTank()+" \t\t "+car[0].getOilSize()+" \t\t "+car[0].getDistance()+" \t\t "+((L3)car[0]).getTempGage());
		System.out.println(car[1].getName()+" \t\t "+car[1].getEngine()+" \t\t "+car[1].getOilTank()+" \t\t "+car[1].getOilSize()+" \t\t "+car[1].getDistance()+" \t\t "+((L5)car[1]).getTempGage());
		System.out.println();
		
	}

}
