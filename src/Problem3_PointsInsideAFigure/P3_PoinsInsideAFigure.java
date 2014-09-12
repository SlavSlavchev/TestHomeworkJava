package Problem3_PointsInsideAFigure;

import java.util.Scanner;

public class P3_PoinsInsideAFigure {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		String[] inputLine = input.nextLine().split(" ");
		double x = Double.parseDouble(inputLine[0]);
		double y = Double.parseDouble(inputLine[1]);
		
		if(x >= 12.5 && x <= 22.5){
			if(x >  17.5 && x < 20 ){
				if(y >= 6 && y <= 8.5){
					System.out.println("Inside");
				}
				else{
					System.out.println("Outside");
				}
			}
			else{
				if(y >= 6 && y <= 13.5){
					System.out.println("Inside");
				}
				else{
					System.out.println("Outside");
				}
			}
		}		
		else{
			System.out.println("Outside");
		}
	}
}
