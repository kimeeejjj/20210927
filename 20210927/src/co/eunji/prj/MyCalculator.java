package co.eunji.prj;

public class MyCalculator { //Method Override(반환값,매개변수타입,매개변수개수 등이 다른 같은 이름의 메소드들)
	public void sum (int n, int m) { //void 내가 수행하고 끝내겠다. 리턴값 없음.
		System.out.println(n+m);
	}
	
	public float sum (float n, int m) {
		return n+m;
	}
	
	public float sum(float n, float m) {
		return n+m;
	}
	
	public double sum(double n, double m) {
		return n+m;
	}
	
	public int sum(int n, int m, int l) {
		return n+m+l;
	}
	
	public int sum (int n) {
		int factorial=1;
			for(int i=1;i<=n;i++) {
				factorial=factorial*i;
			}
		return factorial;
	}
	
	
}
