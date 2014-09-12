package Problem6_FormattingNumbers;

import java.util.Locale;
import java.util.Scanner;

public class P6_FormattingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);

		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		String aLenght = String.valueOf(a);
		int aLenghtInt = aLenght.length();
		
		String bLenght = String.valueOf(b);
		int bLenghtInt = bLenght.length();
		
		String cLenght = String.valueOf(c);
		int cLenghtInt = cLenght.length();
		
		System.out.printf("|%1$s|%2$s|%3$s|%4$s|", String.valueOf(Integer.toHexString(a).toUpperCase() + "          ".substring(Integer.toHexString(a).length())),
										String.valueOf("0000000000".substring(Integer.toBinaryString(a).length()) + Integer.toBinaryString(a)),
										String.valueOf("          ".substring(bLenghtInt) + String.format("%.2f", b)),
										String.valueOf(String.format("%.3f", c) + "          ".substring(String.format("%.3f", c).length()))
										);
		
		
	}

}
