package Problem5_DecimalToHexadecimal;

import java.util.Scanner;

public class P5_DecimalToHexadecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		String nHexa = Integer.toHexString(n).toUpperCase();
		System.out.println(nHexa);
	}

}
