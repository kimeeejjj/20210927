package co.eunji.prj;

public class CompareMax { //���޹��� �� ������ ū ���� ��������
	private int n;
	private int m;
	
	public CompareMax(int n, int m) { //������
		this.n=n;
		this.m=m;
	}
	
	public int getMax() {
		int max = 0; //�� ���� �������� 0�� �����Ѵ�.
		if(n > m) {
			max=n;
		}else if(n<m) {
			max=m;
		}
		return max;
	}
}
