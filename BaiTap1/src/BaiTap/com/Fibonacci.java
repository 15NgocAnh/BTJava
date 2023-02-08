package BaiTap.com;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Nhập số Fibonacci thứ n cần tìm: ");
		int n = new Scanner(System.in).nextInt();
		Fibonacci();
		System.out.println(Fibo[n]);
	}
	static int Fibo[] = new int[101];
	public static void Fibonacci() {
		Fibo[1] = 1;
		Fibo[2] = 1;
		for (int i=3;i<100;i++) {
			Fibo[i] = Fibo[i-1] + Fibo[i-2];
		}
	}
}
