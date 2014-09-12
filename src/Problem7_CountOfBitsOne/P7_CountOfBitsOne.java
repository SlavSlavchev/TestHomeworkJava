package Problem7_CountOfBitsOne;

import java.util.Scanner;

public class P7_CountOfBitsOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		String binaryN = Integer.toBinaryString(n);
		int sum = 0;
		
		int binaryNLenght = binaryN.length();
		System.out.println(binaryN);
		
		for(int i = 0; i < binaryNLenght; i++){
			if(binaryN.charAt(binaryN.length() - 1) == '1'){
				sum++;
			}
			binaryN = binaryN.substring(0, binaryN.length() - 1);
		}
		
//		for(char ch : binaryN.toCharArray()){
//			if(ch == '1'){
//				sum++;
//			}
//		}
		
		System.out.println(sum);
		
		
		
	}

}
