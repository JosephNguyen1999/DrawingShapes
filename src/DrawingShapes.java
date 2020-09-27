/*
 * DrawingShapes.java
 * Author:  Joseph Nguyen
 * Submission Date:  2/25/2020
 *
 * Purpose: draws a shape made up of astericks depending on inputs (what shape, length, and height)
 *
 * Statement of Academic Honesty:
 *
 * The following code represents my own work. I have neither
 * received nor given inappropriate assistance. I have not copied
 * or modified code from any source other than the course webpage
 * or the course textbook. I recognize that any unauthorized
 * assistance or plagiarism will be handled in accordance with
 * the University of Georgia's Academic Honesty Policy and the
 * policies of this course. I recognize that my work is based
 * on an assignment created by the Department of Computer
 * Science at the University of Georgia. Any publishing 
 * or posting of source code for this assignment is strictly
 * prohibited unless you have written consent from the Department
 * of Computer Science at the University of Georgia.  
 */

import java.util.Scanner;

public class DrawingShapes {

	public static void main(String[] args) {

		//declares variables
		String shape;
		int length, height;

		//input for what shape
		System.out.println("Enter a shape: r t h o p");
		Scanner keyboard = new Scanner(System.in);
		shape = keyboard.nextLine();
		if (!shape.equals("r") && !shape.equals("t") && !shape.equals("h") && !shape.equals("o") && !shape.equals("p")) {
			System.out.println("Invalid Shape\nGoodbye!");
			System.exit(0);
		}
		//input for length
		System.out.println("Enter a length");
		length = keyboard.nextInt();
		if (length <=1) {
			System.out.println("Length must be greater than 1\nGoodbye!");
			System.exit(0);
		}

		//draws a triangle based on the length
		if (shape.equals("t")) {
			System.out.println("Below is a triangle with two side lengths of " + length + " *");
			for (int line = 0; line < length; line++) {
				for (int space = 0; space < (length - line); space++) {
					System.out.print(" ");
				}
				for (int asterick = 1; asterick < 2 + (2 * line); asterick++) {
					System.out.print("*");
				}

				System.out.println("");
			}
			System.exit(0);
		}

		//draws a hexagon based on the length
		if (shape.equals("h")) {
			System.out.println("Below is a hexagon with side lengths of " + length + " *");
			for (int line = 0; line < length; line++) {
				for (int space = 0; space < (length - line); space++) {
					System.out.print(" ");
				}
				for (int asterick = 0; asterick < length + (2 * line); asterick++) {
					System.out.print("*");
				}

				System.out.println("");
			}
			for (int line = (length - 1); line > 0; line--) {
				for (int space = -1; space < (length - line); space++) {
					System.out.print(" ");
				}
				for (int asterick = length + (2 * line); asterick > 2; asterick--) {
					System.out.print("*");
				}

				System.out.println("");
			}
			System.exit(0);
		}

		//draws an octagon based on the length
		if (shape.equals("o")) {
			System.out.println("Below is a octagon with side lengths of " + length + " *");
			for (int line = 0; line < (length - 1); line++) {
				for (int space = 1; space < (length - line); space++) {
					System.out.print(" ");
				}
				for (int asterick = 0; asterick < length + (2 * line); asterick++) {
					System.out.print("*");
				}

				System.out.println("");
			}
			for (int line = 0; line < length; line++) {
				for (int asterick = length + (2 * length); asterick > 2; asterick--) {
					System.out.print("*");
				}
				System.out.println("");
			}
			for (int line = (length - 1); line > 0; line--) {
				for (int space = 0; space < (length - line); space++) {
					System.out.print(" ");
				}
				for (int asterick = length + (2 * line); asterick > 2; asterick--) {
					System.out.print("*");
				}

				System.out.println("");
			}
			System.exit(0);
		}

		//draws a pentagon based on the length
		if (shape.equals("p")) {
			System.out.println("Below is a pentagon with 4 side lengths of " + length + " *");
			for (int line = 0; line < length; line++) {
				for (int space = 1; space < (length - line); space++) {
					System.out.print(" ");
				}
				for (int asterick = 1; asterick < 2 + (2 * line); asterick++) {
					System.out.print("*");
				}
				System.out.println("");
			}
			for (int line = length; line > 1; line--) {
				for (int asterick = 2; asterick < 1 + (2 * length); asterick++) {
					System.out.print("*");
				}
				System.out.println("");
			}
			System.exit(0);
		}

		//input for height
		System.out.println("Enter a height");
		height = keyboard.nextInt();
		if (height <=1) {
			System.out.println("Height must be greater than 1\nGoodbye!");
			System.exit(0);
		}

		//draws a rectangle based on the length and height
		if (shape.equals("r"))
			System.out.println("Below is a " + length + " by " + height + " rectangle of *");
		for (int line = 0; line < height; line++) {
			for (int asterick = 0; asterick < length; asterick++) {
				System.out.print("*");
			}
			System.out.println("");
		}

		System.exit(0);
		keyboard.close();
	}

}
