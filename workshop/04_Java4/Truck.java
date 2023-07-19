package vehicle;

public class Truck extends Car{

	public Truck() {}
	
	public Truck(int maxWeight, double oilTankSize, double efficiency) {
		super(maxWeight, oilTankSize, efficiency);
	}

	public double getEfficiency() {
		double efficiency = super.getEfficiency();
		double minus=0;
		if (getCurWeight() != 0) {
			minus = getCurWeight()/5*0.2;
		}
		return efficiency-minus;
	}

	@Override
	public void moving(int distance) {
		super.moving(distance);
		double setRestOil = getRestOil() - calcOil(distance);
	}
	
	private double calcOil(int distance) {
		double calcOil = distance/getEfficiency();
		return calcOil;
	}
	
	public int getCost(int distance) {
		double getCost = calcOil(distance)*3000;
		return (int)getCost;
	}

	@Override
	public String toString() {
		String str = String.format("%s \t\t %.1f", super.toString(), getEfficiency());
		return str;
		}

}
