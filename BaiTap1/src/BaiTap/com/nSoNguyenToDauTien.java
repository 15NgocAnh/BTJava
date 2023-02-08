package BaiTap.com;
import java.util.Scanner;

public class nSoNguyenToDauTien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Nhập n: ");
		int n = new Scanner(System.in).nextInt();
		Duyet();
		for (int i=0;i<n;i++) {
			System.out.print(snt[i]+" ");
		}
	}
	static int snt[] = new int[10001];
	public static void Duyet() {
		int a=0;
		for (int i=2;i<10000;i++) {
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
