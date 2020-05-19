package com.swetha.javatrials;

public class PrintCharacters {

	public static String print() {

		for (int i=0;i<24;i++) {
			if(i<=6) {
				System.out.print("+");
			}
			else if (i>6 && i<=12) {
				System.out.print("@");
			}
			else if (i>12 && i<=18) {
				System.out.print("*");
			}
			else if (i>18 && i<=24) {
				System.out.print("#");
			}
			
			if(i==6||i==12||i==18||i==24) {
				System.out.println("\n");
			}
		}
		return null;
	}
	
	public static void main(String args[]) {
		print();
	}
}
