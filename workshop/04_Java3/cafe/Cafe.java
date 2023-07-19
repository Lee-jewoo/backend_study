package cafe;

public class Cafe {
	
	private Coffee[] coffeeList;
	private int index;
	
	public Cafe() {
		coffeeList = new Coffee[3];
	}
	
	public int totalPrice() {
		int totalPrice = 0;
		for (index=0; index<coffeeList.length; index++) {
			totalPrice += coffeeList[index].getPrice();
		}
		return totalPrice;
	}

	public void setCoffee (Coffee coffee) {
		if (index == coffeeList.length) {
			System.out.println("더 이상 저장할 수 없습니다.");
		} else {
			coffeeList[index] = coffee;
			index++;
		}
	}
	
	public Coffee[] getCoffeeList() {
		return coffeeList;
	}

}
