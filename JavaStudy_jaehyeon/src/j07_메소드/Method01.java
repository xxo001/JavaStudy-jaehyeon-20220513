package j07_메소드;

import java.util.Scanner;

public class Method01 {
	
	public static int calcFormula1(int a, int b, int c, int d, int e) {
		int result = a + (b*c) - (d*e);
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b , c , d ,e;
		int r1, r2, r3, r4;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		e = sc.nextInt();
		
		//x + y = z
		
		r1 = calcFormula1(a, b, c, d, e);
		r2 = calcFormula1(a, b, c, d, e);
		r3 = calcFormula1(a, b, c, d, e);
		r4 = calcFormula1(a, b, c, d, e);
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
	}

}
