package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Yo! Which year is it? ");
		int year = in.nextInt();
		boolean leap;
		leap = ((year % 4 == 0) && (year % 100 != 0)) || (year % 4 ==0);
		System.out.print(year + " is a leap year: " + leap);
	}

}
