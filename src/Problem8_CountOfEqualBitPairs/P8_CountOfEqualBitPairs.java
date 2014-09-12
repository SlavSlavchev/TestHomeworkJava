package Problem8_CountOfEqualBitPairs;

import java.util.Scanner;

public class P8_CountOfEqualBitPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		String binaryN = Integer.toBinaryString(n);
		int binaryNLenght = binaryN.length();
		int sum = 0;
		
		for(int i = 0; i < binaryNLenght - 1; i++){
			if(binaryN.charAt(i) == binaryN.charAt(i + 1)){
				sum++;
			}
		}
		
		System.out.println(sum);
		
	}

}
