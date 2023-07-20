package vehicle;

public class Truck extends Car{

	public Truck() {}
	
	public Truck(int maxWeight, double oilTankSize, double efficiency) {
		super(maxWeight, oilTankSize, efficiency);
	}

	@Override
	public double getEfficiency() {
		double minus=0;
		if (getCurWeight() != 0) {
			minus = getCurWeight()/5*0.2;
		}
		return 	super.getEfficiency()-minus;
	}

	@Override
	public void moving(int distance) {
		setRestOil((double)getRestOil() - calcOil(distance));
	}
	
	private double calcOil(int distance) {
		double calcOil = distance/getEfficiency();
		return calcOil;
	}
	
	public int getCost(int distance) {
		double cost = calcOil(distance)*3000;
		return (int)cost;
	}

	@Override
	public String toString() {
		return String.format("%s \t\t %.1f\n", super.toString(), getEfficiency());
	}

}
