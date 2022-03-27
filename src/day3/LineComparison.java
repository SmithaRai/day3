package day3;

import java.util.Scanner;

public class LineComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//LineComparsion line1 = new LineComparsion(5, 3, 3, 4);
		//LineComparsion line2 = new LineComparsion(8, 3, 3, 4);
		Scanner in = new Scanner(System.in);
		System.out.println("Enter x1 nd x2:");
		int x1 = in.nextInt();
		int x2 = in.nextInt();
		System.out.println("Enter y1 and y2:");
		int y1 = in.nextInt();
		int y2 = in.nextInt();
		
		int length1 =   calculate_length(x1,x2,y1,y2);
		int length2 =  calculate_length(x1,x2,y1,y2);
		System.out.println("length 1: " + length1);
		System.out.println("length 2: " + length2);
		compareTo(length1, length2);
	}
		private static int calculate_length(int x1, int x2, int y1, int y2) {
			int length = (int)Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
			return length;
			}
		
		private static void compareTo(int length1, int length2) {
			if (length1 == length2)
				System.out.println("length 1 is equal to length 2");
			else if (length1 > length2)
				System.out.println("length 1 is greater than length 2");
			else
				System.out.println("length 2 is greater than length 1");
		}
	
	


	
	

}
