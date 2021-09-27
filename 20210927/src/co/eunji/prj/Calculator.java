package co.eunji.prj;

public class Calculator { //Class 정의,클래스 원형 만들기,아직 메모리 할당 못받음 받으려면 인스턴스 있어야함
	private int firstNum;  //private 변수에 값 저장 방법
	private int secondNum; //1. 생성자를 통해서 2.setter를 통해서
	
	public Calculator() { //기본생성자-setter,getter사용시 기본생성자 꼭 필요. 매개변수필요없는.
		
	}
	
	public Calculator(int n, int m) { //생성자 통한 값 전달 방법
		this.firstNum=n;
		this.secondNum=m;
	}
	
	public Calculator(int n) { //매개값이 1개인 생성자
		this.firstNum=n;
	}
	
	public void setFirstNum(int n) {  //setter통한 값 전달 방법
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
