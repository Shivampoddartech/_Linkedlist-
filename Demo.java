package Day2;

import java.util.LinkedList;

public class Demo {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add(100);
		ll.add(2020.20);
		ll.add("true");
		ll.add("False");
		ll.add(null);
		System.out.println(ll);

		System.out.println("-----------");

		for (int i = 0; i < ll.size(); i++) {
			System.out.println(ll.get(i));
		}
		System.out.println("-----------");
		for (int i = ll.size() - 1; i > 0; i--) {
			System.out.println(ll.get(i));
		}
		System.out.println("-----------");
		for (Object o : ll) {
			System.out.println(o);
		}
	}
}
