package co.eunji.prj.member;
import java.util.Scanner;
public class Test {
	private int num1;
	private int num2;
	private Scanner scn=new Scanner(System.in);
	
	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	public void getSum() {
		System.out.print("첫번째 값을 입력해주세요=");
		setNum1(scn.nextInt());
		System.out.print("두번째 값을 입력해주세요=");
		setNum2(scn.nextInt());
		int sum=0;
		for(int i=num1;i<=num2;i++) {
			sum=sum+i;
		}
		System.out.println(num1+"과"+num2+"사이 값의 합은"+sum+"입니다.");
	}
	
}
