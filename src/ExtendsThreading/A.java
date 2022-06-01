package ExtendsThreading;

public class A {
	void sum() {
		int s = 0;
		for (int i = 1; i <= 100000; i++) {
			s = s + i;
			System.out.println("sum>> "+s);
		}
	}
	void print() {
		System.out.println("hello");
	}
}
