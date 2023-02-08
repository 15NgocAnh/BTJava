package BaiTap.com;
import java.util.Scanner;

public class PTBac2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println(" - Nhập vào hệ số a, b, c: ");
		while(true) {
			System.out.print("Nhập vào a: ");
			a = sc.nextInt();
			System.out.print("Nhập vào b: ");
			b = sc.nextInt();
			System.out.print("Nhập vào c: ");
			c = sc.nextInt();
			if (a!=0)
				break;
			else 
				System.out.println("Mời nhập lại!");
		}
		PT_Bac2(a, b, c);
	}
	
	public static void PT_Bac2(double a, double b, double c) {
		double delta = b*b - 4*a*c;
		if (delta < 0 )
			System.out.println("Phương trình vô nghiệm!");
		else if (delta == 0){
			System.out.println("Phương trình có nghiệm kép!");
			double x = -b/2*a;
			System.out.printf("x1 = x2 = %d",x);
		}
		else {
			System.out.println("Phương trình có 2 nghiệm phân biệt!");
			double x1 = (-b + Math.sqrt(delta))/(2*a);
			double x2 = (-b - Math.sqrt(delta))/(2*a);
			System.out.println("x1 = " + x1);
			System.out.println("x2 = " + x2);
		}
	}

}
