package BaiTap.com;
import java.util.Scanner;

public class GiaiThua {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Nhập vào n: ");
		int n = new Scanner(System.in).nextInt();
		long result = 1;
		for (int i=1;i<=n;i++) {
			result *= i;
		}
//		System.out.println(n+"! = "+result);
		System.out.println(n+"! = "+Giai_Thua(n));
	}
	
	public static long Giai_Thua(int n) {
		if (n==1)
			return 1;
		else
			return n*Giai_Thua(n-1);
	}

}
