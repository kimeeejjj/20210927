package co.eunji.prj;

public class Calculator { //Class ����,Ŭ���� ���� �����,���� �޸� �Ҵ� ������ �������� �ν��Ͻ� �־����
	private int firstNum;  //private ������ �� ���� ���
	private int secondNum; //1. �����ڸ� ���ؼ� 2.setter�� ���ؼ�
	
	public Calculator() { //�⺻������-setter,getter���� �⺻������ �� �ʿ�. �Ű������ʿ����.
		
	}
	
	public Calculator(int n, int m) { //������ ���� �� ���� ���
		this.firstNum=n;
		this.secondNum=m;
	}
	
	public Calculator(int n) { //�Ű����� 1���� ������
		this.firstNum=n;
	}
	
	public void setFirstNum(int n) {  //setter���� �� ���� ���
		this.firstNum=n;
	}
	
	public int getFirstNum() {
		return firstNum;
	}

	public void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
	}

	public int getSecondNum() {
		return secondNum;
	}

	public int sum() {
		return firstNum+secondNum;
	}
	
	public int sub() {
		return firstNum-secondNum;
	}
	
	
}
