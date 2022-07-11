package week1.day2;

public class Calculator {
	private void add(int a, int b) {
		System.out.println(a + b);

	}

	private void sub(float c,int d) {
		System.out.println(c - d);

	}

	private void mul(double e, double f, long i) {
		System.out.println(e*f*i);

	}

	private void div(long g, float h) {
		System.out.println(g / h);

	}

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.add(2, 3);
		calc.sub(5.3f, 2);
		calc.mul(5, 4,2l);
		calc.div(120l, 22.5f);
	}

}
