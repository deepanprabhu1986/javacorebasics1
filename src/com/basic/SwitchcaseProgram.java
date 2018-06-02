package com.basic;

public class SwitchcaseProgram {
	public static void main(String args[]) {
		int a=1;
		String s="one";
		switch(a) {
		case 1:
			System.out.println("Value is one");
			break;
		case 2:
			System.out.println("Value is two");
			break;
			default:
				System.out.println("Value is Invalid");
				break;
				
			
		}
		switch("one") {
		case "one":
			System.out.println("Value is one");
			break;
		case "two":
			System.out.println("Value is two");
			break;
			default:
				System.out.println("Value is Invalid");
				break;
				
			
		}
	}

}
