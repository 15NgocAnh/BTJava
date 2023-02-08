package BaiTap.com;

import java.util.Scanner;

public class ChuongTrinh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			Menu();
			System.out.print("Chọn: ");
			int chon = new Scanner(System.in).nextInt();
			if (chon==0) break;
			else {
				switch(chon) {
					case 1:{
						PTBac2.main(args);;
						break;
					}
					case 2:{
						GiaiThua.main(args);;
						break;
					}
					case 3:{
						Fibonacci.main(args);;
						break;
					}
					case 4:{
						UCLN_BCNN.main(args);;
						break;
					}
					case 5:{
						SNT.main(args);;
						break;
					}
					case 6:{
						nSoNguyenToDauTien.main(args);;
						break;
					}
					case 7:{
						SNT5ChuSo.main(args);;
						break;
					}
					case 8:{
						TongChuSo.main(args);;
						break;
					}
					case 9:{
						SoThuanNghich.main(args);;
						break;
					}
					case 10:{
						Fibonacci_SNT.main(args);;
						break;
					}
				}
			}
		}
	}
	
	public static void Menu() {
		System.out.println("\n----- MENU CHƯƠNG TRÌNH -----");
		System.out.println("[1]. Phương trình bậc 2");
		System.out.println("[2]. Giai thừa");
		System.out.println("[3]. Số Fibonacci thứ n");
		System.out.println("[4]. Ucln và Bcnn");
		System.out.println("[5]. Số nguyên tố nhỏ hơn n");
		System.out.println("[6]. n số nguyên tố đầu tiên");
		System.out.println("[7]. Số nguyên tố có 5 chữ số");
		System.out.println("[8]. Tổng các chữ số của một số nguyên n");
		System.out.println("[9]. Số thuận nghịch có 6 chữ số");
		System.out.println("[10]. Số Fibonacci nhỏ hơn n là số nguyên tố");
		System.out.println("[0]. Exit");
	}

}
