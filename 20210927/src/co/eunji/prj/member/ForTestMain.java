package co.eunji.prj.member;

import java.util.Scanner;

public class ForTestMain {
	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	ForTest fortest=new ForTest();
	
	System.out.print("ù��° ���� �Է��ϼ��� :");
	fortest.setNum1(scn.nextInt());
	System.out.print("�ι�° ���� �Է��ϼ��� :");
	fortest.setNum2(scn.nextInt());
	
	int sum=0;
	for(int i=fortest.getNum1();i<=fortest.getNum2();i++) {
		sum=sum+i;
	}
	
	System.out.println(fortest.getNum1()+"��"
					+fortest.getNum2()+"���� ���ڵ��� ����"
					+sum+"�Դϴ�.");

	}
	

}
