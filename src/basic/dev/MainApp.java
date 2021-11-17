package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub ​
		/**
		* 11.1. Tinh tong tu 1 den 100
		*/
		int i = 0;
		int tong = 0;
		while(i <= 100) {
			tong += i;
			i++;
		}
		System.out.println("Tong tu 1 den 100 la :  " + tong);
		System.out.println("----------------------------------------");
		
		/**
		* 11.2. Tinh tong cac so nguyen chia het cho 3 be hon n. n nhap vao tu ban phim
		*/
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao so nguyen n: ");
		int n = sc.nextInt();
		i = 0;
		tong = 0;
		while(i <= n) {
			i++;
			if(i % 3 == 0) 
			tong += i;
		}
		System.out.println("Tong cac so chia het cho 3: " + tong);
		System.out.println("--------------------------------");
		/**
		* 11.3. Viet chuong trinh in ra 100 so fibonaci
		*/
		int count = 100, num1 = 0, num2 = 1;
		System.out.println("Chuoi voi " +count+ " so fibonacci dau tien la: ");
		int a = 1;
		while(a <= count) {
			System.out.println(num1+ " ");
			int sum = num1 + num2;
			num1 = num2;
			num2 = sum;
			a++;
		}
		System.out.println("-------------------------");
		/**
		* 11.4. Kiem tra mot so nguyen la so polinom
		*/
		
		System.out.println("Nhap vao so nguyen n: ");
		n = sc.nextInt();
		int temp = n;
		int invert = 0;
		/** temp chỉ có tác vụ định nghĩa cho 1 kiểu dữ liệu duy nhất
		 * invert dao nguoc
		  */
		while(n > 0) {
			int mod = n % 10;
			n = n/10;
			invert = invert * 10 + mod;
			
		}
		if(invert == temp)
			System.out.println(temp + " la so polinom");
		else
			System.out.println(temp + "khong la so polinom");
		System.out.println("-------------------------------");
		
		/**
		* 11.5. Tong cac chu so chia het cho 3
		*/
		System.out.println("Tong cac so tu 100 den 999 chia het cho 3 la : ");
		int b = 100;
		while(b <= 999) {
			int temp1 = (b / 100) + ((b - (b/100)*100)/10) + (b % 10);
			if (temp1 % 3 == 0) System.out.println(b);
			b++;
		}
		System.out.println("---------------------------------");
		/**
		 * BAI TAP LAM THEM : BANG CUU CHUONG
		 */
		System.out.println("BANG CUU CHUONG");
		int  h, k;
		k = 1;
		while(k <= 10) {
			h = 1;
			System.out.println("\t");
			while(h <= 10) {
				System.out.print(h + "x" + k + "=" + (h*k) + "\t"  );
				h++;
			}
			k++;
		}
		
	}
}
	