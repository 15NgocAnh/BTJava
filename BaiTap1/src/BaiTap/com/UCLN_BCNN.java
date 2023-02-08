package BaiTap.com;

import java.util.Scanner;

public class UCLN_BCNN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập vào 2 số a, b: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Ước chung lớn nhất của "+a+" và "+b+" là: "+Ucln(a,b));
		System.out.println("Bội chung nhỏ nhất của "+a+" và "+b+" là: "+Bcnn(a,b));
	}
	
	public static int Ucln(int a, int b) {
		if (b==0)	return a;
		else	return Ucln(b,a%b);
	}
	
	public static int Bcnn(int a, int b) {
		return a*b/Ucln(b,a%b);
	}
}
