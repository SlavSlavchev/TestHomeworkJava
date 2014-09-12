package Problem9_PointsInsideAHouse;

import java.util.Locale;
import java.util.Scanner;

public class P9_PointsInsideAHouse {	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] xy =  input.split(" ");
        double x = Double.parseDouble(xy[0]);
        double y = Double.parseDouble(xy[1]);
        if (x>=12.5 && x<=17.5 && y>=3.5 && y<=8.5 && x + y>=21) {    //First figure (left half of the roof) equations
                System.out.println("Inside");
        }
        else if (x>=17.5 && x<=22.5 && y>=3.5 && y<=8.5 && x - y <= 14) {//Second figure (right half of the roof) equations
                System.out.println("Inside");
        }
        else if (x>=12.5 && x<=17.5 && y>=8.5 && y<=13.5) {   //Third figure equations
                System.out.println("Inside");
        }
        else if (x>=20 && x<=22.5 && y>=8.5 && y<=13.5) {   //Fourth figure equations
                System.out.println("Inside");
        }
        else {
                System.out.println("Outside");
        }	
	}
}
