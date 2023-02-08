package BaiTap.com;

import java.util.Scanner;

public class TongChuSo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Nhập n: ");
		int n = new Scanner(System.in).nextInt();
		System.out.println("Tổng các chữ số của "+n+" = "+Sum(n));
	}

	public static int Sum(int n) {
		int sum = 0;
		while(n!=0) {
			sum += n%10;
			n/=10;
		}
		return sum;
	}
}
