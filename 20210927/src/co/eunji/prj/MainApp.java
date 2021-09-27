package co.eunji.prj;

import co.eunji.prj.member.Member;

public class MainApp {
	public static void main(String[] args) {
//		Calculator calculator=new Calculator(); //클래스생성 = 인스턴스만듦
//		calculator.setFirstNum(200); //setter를 통해 값을 전달한다.
//		calculator.setSecondNum(20);
//		int sum = calculator.sum();
//		int sub = calculator.sub();
	
//		Calculator calculator = new Calculator(20,20); //생성자를 통해 값을 전달한다.
//		int sum = calculator.sum();
//		int sub = calculator.sub();
		
//		System.out.println("덧셈의 결과="+sum);
//		System.out.println("뺄셈의 결과="+sub);
	
//		MyCalculator myCalculator = new MyCalculator();
//		myCalculator.sum(10, 10);
//		float f = myCalculator.sum(5.0f, 5);
//		System.out.println(f);
		
//		int n =myCalculator.sum(5);
//		System.out.println(n);
		
//		double d = myCalculator.sum(10.2, 10.2);
//		System.out.println(d);
		
//		double d2 =myCalculator.sum(10.1, 100);
	
		CompareMax compareMax = new CompareMax(100,50);
//		int max = compareMax.getMax();
//		System.out.println("두수중에 큰 값은="+max);
		
//		Calculator calculator = new Calculator();
//		calculator.setFirstNum(200);
//		calculator.setSecondNum(500);
//		System.out.println("전달된 두 수의 합="+calculator.sum());
	
		Member member =new Member("hong","1234","홍길동","대구광역시");
		member.run();
	}
}
