package BaiTap.com;

public class SNT5ChuSo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duyet();
		for (int i=0;i<10000;i++) {
			if (String.valueOf(snt[i]).length()==5) {
				System.out.print(snt[i] + " ");
			}
		}
	}
	static int snt[] = new int[10001];
	public static void Duyet() {
		int a=0;
		for (int i=10000;i<100000;i++) {
			if (SNT(i))
				snt[a++]=i;
		}
	}
	
	public static boolean SNT(int n) {
		for (int i = 2; i<=Math.sqrt(n); i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
