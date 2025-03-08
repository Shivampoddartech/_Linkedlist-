package Day2;

import java.util.ArrayList;

public class Car {
	String brand;
	int cost;

	Car(String brand, int cost) {
		this.brand = brand;
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Car brand=" + brand + ", cost=" + cost + "";
	}

}
