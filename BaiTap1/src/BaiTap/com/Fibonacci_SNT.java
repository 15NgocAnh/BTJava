package BaiTap.com;

import java.util.Scanner;

public class Fibonacci_SNT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Nhập n: ");
		int n = new Scanner(System.in).nextInt();
		Fibonacci();
		System.out.println("Các số Fibonacci nhỏ hơn "+n+" là số nguyên tố là:");
		int i = 0;
		while(F[i]<n) {
			if (SNT(F[i]))
				System.out.print(F[i]+" ");
			i++;
		}
	}
	
	static int F[] = new int[100];
	
	public static void Fibonacci() {
		F[0] = F[1] = 1;
		for (int i=2;i<100;i++) {
			F[i] = F[i-1] + F[i-2];
		}
	}
	
	public static boolean SNT(int n) {
		for (int i=2;i<= Math.sqrt(n);i++) {
			if (n%i==0)	return false;
		}
		return true;
	}
}
