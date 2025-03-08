package Day2;

public class AutoBoxing {
	public static void main(String[] args) {

		System.out.println("Auto Boxing");

		int a = 150;
		Integer b = a;

		System.out.println(a + " " + b);

		System.out.println("Auto Unboxing");

		Integer c = 100;
		int d = c;

		System.out.println(c + " " + d);
	}
}
