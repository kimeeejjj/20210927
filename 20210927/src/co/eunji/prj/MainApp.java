package co.eunji.prj;

import co.eunji.prj.member.Member;

public class MainApp {
	public static void main(String[] args) {
//		Calculator calculator=new Calculator(); //Ŭ�������� = �ν��Ͻ�����
//		calculator.setFirstNum(200); //setter�� ���� ���� �����Ѵ�.
//		calculator.setSecondNum(20);
//		int sum = calculator.sum();
//		int sub = calculator.sub();
	
//		Calculator calculator = new Calculator(20,20); //�����ڸ� ���� ���� �����Ѵ�.
//		int sum = calculator.sum();
//		int sub = calculator.sub();
		
//		System.out.println("������ ���="+sum);
//		System.out.println("������ ���="+sub);
	
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
//		System.out.println("�μ��߿� ū ����="+max);
		
//		Calculator calculator = new Calculator();
//		calculator.setFirstNum(200);
//		calculator.setSecondNum(500);
//		System.out.println("���޵� �� ���� ��="+calculator.sum());
	
		Member member =new Member("hong","1234","ȫ�浿","�뱸������");
		member.run();
	}
}
