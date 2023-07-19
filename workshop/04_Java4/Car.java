package vehicle;

public class Car extends Vehicle{

	private double restOil;
	private int curWeight;
	
	public Car() {}
	
	public Car(int maxWeight, double oilTankSize, double efficiency) {
		super(maxWeight, oilTankSize, efficiency);
	}

	public void addOil(int oil) {
		restOil += (double)oil;
	}
	public void moving(int distance) {
		restOil -= (double)distance/getEfficiency();
	}
	public void addWeight(int weight) {
		if (weight < getMaxWeight()) {
			curWeight += weight;
		}
	}
	
	@Override
	public String toString() {
		String str = String.format("%s \t\t %.1f \t\t %d", super.toString(), getRestOil(), getCurWeight());
		return str;
	}

	public double getRestOil() {
		return restOil;
	}

	public void setRestOil(double restOil) {
		this.restOil = restOil;
	}

	public int getCurWeight() {
		return curWeight;
	}

	public void setCurWeight(int curWeight) {
		this.curWeight = curWeight;
	}
	

	
}
