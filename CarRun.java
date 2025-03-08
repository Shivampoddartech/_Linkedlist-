package Day2;

import java.util.ArrayList;

public class CarRun {
	public static void main(String[] args) {
		ArrayList<Car> al = new ArrayList<Car>();
		al.add(new Car("Alto", 500000));
		al.add(new Car(" Bmw", 78000000));
		al.add(new Car("Benz", 800000));
		for (Car car : al) {
			System.out.println(car);
		}
	}
}
