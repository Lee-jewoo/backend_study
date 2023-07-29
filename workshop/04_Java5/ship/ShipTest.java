package workshop07.ship;

import java.util.ArrayList;

public class ShipTest {

	public static void main(String[] args) {
		
		ArrayList<Ship> list = new ArrayList<Ship>();
		list.add(new Boat("Boat01", 500));
		list.add(new Cruise("Cruise01", 1000));
		
		System.out.println("shipName \t fuelTank");
		System.out.println("--------------------------");
		for (int i=0; i<list.size(); i++) {
			if (list.get(i) instanceof Boat) {
				System.out.println(list.get(i).getShipName() + " \t\t " + list.get(i).getFuelTank());
			} else if (list.get(i) instanceof Cruise) {
				System.out.println(list.get(i).getShipName() + " \t " + list.get(i).getFuelTank());
			}
		}
		System.out.println();
		System.out.println("10 운항");
		System.out.println("shipName \t fuelTank");
		System.out.println("--------------------------");
		for (int i=0; i<list.size(); i++) {
			if (list.get(i) instanceof Boat) {
				list.get(i).sail(10);
				System.out.println(list.get(i).getShipName() + " \t\t " + list.get(i).getFuelTank());
			} else if (list.get(i) instanceof Cruise) {
				list.get(i).sail(15);
				System.out.println(list.get(i).getShipName() + " \t " + list.get(i).getFuelTank());
			}
		}
		System.out.println();
		System.out.println("50 주유");
		System.out.println("shipName \t fuelTank");
		System.out.println("--------------------------");
		for (int i=0; i<list.size(); i++) {
			if (list.get(i) instanceof Boat) {
				list.get(i).refuel(20);
				System.out.println(list.get(i).getShipName() + " \t\t " + list.get(i).getFuelTank());
			} else if (list.get(i) instanceof Cruise) {
				list.get(i).refuel(30);
				System.out.println(list.get(i).getShipName() + " \t " + list.get(i).getFuelTank());
			}
		}
		

	}

}
