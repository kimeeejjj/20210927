package co.eunji.prj.member;

import java.util.Scanner;

public class ForTestMain {
	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	ForTest fortest=new ForTest();
	
	System.out.print("첫번째 수를 입력하세요 :");
	fortest.setNum1(scn.nextInt());
	System.out.print("두번째 수를 입력하세요 :");
	fortest.setNum2(scn.nextInt());
	
	int sum=0;
	for(int i=fortest.getNum1();i<=fortest.getNum2();i++) {
		sum=sum+i;
	}
	
	System.out.println(fortest.getNum1()+"과"
					+fortest.getNum2()+"사이 숫자들의 합은"
					+sum+"입니다.");

	}
	

}
