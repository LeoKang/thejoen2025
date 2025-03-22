package java3.p13;

public class Computer extends Calculator {
	double areaCircle(double r) {
		System.out.println(
				"computer 객체의 areaCircle() 실행");
		return Math.PI * r * r;
	}
}
