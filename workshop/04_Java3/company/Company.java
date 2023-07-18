package company;

public class Company {
	
	private double salary;
	private double income;
	private double afterTaxIncome;
	private double bonus;
	private double afterTaxBonus;
	
	public Company() {}

	public Company(double salary) {
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getIncome() {
		double income = salary*12;
		return income;
	}

	public void setIncome(double income) {
		this.income = income;
	}

	public double getAfterTaxIncome() {
		double afterTaxIncome = getIncome()*0.9;
		return afterTaxIncome;
	}

	public void setAfterTaxIncome(double afterTaxIncome) {
		this.afterTaxIncome = afterTaxIncome;
	}

	public double getBonus() {
		double bonus = salary * 0.2 * 4;
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public double getAfterTaxBonus() {
		double afterTaxBonus = getBonus()*0.945;
		return afterTaxBonus;
	}

	public void setAfterTaxBonus(double afterTaxBonus) {
		this.afterTaxBonus = afterTaxBonus;
	}
	
	
	

}
