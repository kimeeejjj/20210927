package co.eunji.prj.member;

public class Practiced {
	public static void main(String[] args) {
	
		for(int i=1;i<=9;i++) {
			System.out.println("====="+i+"´Ü=====");
			for(int l=1;l<=9;l++) {
				int sub = i*l;
				System.out.println(i+"X"+l+"="+sub);
			}
		}
	
	}
}
