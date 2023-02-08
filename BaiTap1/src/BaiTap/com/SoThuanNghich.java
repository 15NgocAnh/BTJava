package BaiTap.com;

public class SoThuanNghich {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Các số thuận nghịch có 6 chữ số là:");
		for (int i=100000;i<1000000;i++) {
			if (ThuanNghich(String.valueOf(i)))
				System.out.print(i+" ");
		}
	}
	
	public static boolean ThuanNghich(String n) {
		StringBuilder str = new StringBuilder(n);
		String x = str.reverse().toString();
		return String.valueOf(n).equals(x);
	}
}
