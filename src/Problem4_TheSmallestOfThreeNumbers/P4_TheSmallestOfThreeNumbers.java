package Problem4_TheSmallestOfThreeNumbers;

import java.util.Scanner;

public class P4_TheSmallestOfThreeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		if(a > b){
			if(b > c){
				System.out.println(c);
			}
			else{
				System.out.println(b);
			}
		}
		else{
			if(a > c){
				System.out.println(c);
			}
			else{
				System.out.println(a);
			}
		}
	}

}
