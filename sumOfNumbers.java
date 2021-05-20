package cis.vmi.edu;

import java.util.Scanner;

/*
 * Author: Joshua Licona
 * Purpose: Add three numbers together
 * Help received: none
 * Technique: Math.random(), println, if else statements
 */

public class sumOfNumbers {

	public static void main(String[]arg) {
		
		Scanner scanner=new Scanner(System.in);
		
		int randomNum1=(int)(Math.random()*10);
		int randomNum2=(int)(Math.random()*10);
		int randomNum3=(int)(Math.random()*10);
		
		int sum=randomNum1+randomNum2+randomNum3;
		
		System.out.println("Print the sum of "+randomNum1+","+randomNum2+", and "+randomNum3);
		int answer=scanner.nextInt();
		
		if(answer==sum) {
			System.out.println("Correct!");
		}
		else {
			System.out.println("Sorry bro, got it wrong");
		}
		
	}
}
