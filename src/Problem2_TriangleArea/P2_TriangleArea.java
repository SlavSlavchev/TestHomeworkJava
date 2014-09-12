package Problem2_TriangleArea;

import java.util.Scanner;

public class P2_TriangleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
						
		String[] lineA = input.nextLine().split(" ");
		String[] lineB = input.nextLine().split(" ");
		String[] lineC = input.nextLine().split(" ");
		
		int[] pointA = new int[2];
		pointA[0] = Integer.parseInt(lineA[0]);
		pointA[1] = Integer.parseInt(lineA[1]);
		
		int[] pointB = new int[2];
		pointB[0] = Integer.parseInt(lineB[0]);
		pointB[1] = Integer.parseInt(lineB[1]);
		
		int[] pointC = new int[2];
		pointC[0] = Integer.parseInt(lineC[0]);
		pointC[1] = Integer.parseInt(lineC[1]);
		
		int area = (pointA[0]*(pointB[1] - pointC[1]) + pointB[0]*(pointC[1] - pointA[1]) + pointC[0]*(pointA[1] - pointB[1])) / 2 ;
		area = Math.abs(area);
				
		System.out.println(area);
	}

}
