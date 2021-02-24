package ControlFlow;

import java.util.Scanner;
import java.util.Random;

public class AsciiChars {
	 public static void printNumbers() {
		 char i;
		 for (i = '0'; i <= '9'; ++i)
		 System.out.println(i);
	  }

	  public static void printLowerCase() {
		  char c;
		  for (c = 'a'; c <= 'z'; ++c)
				  System.out.println(c);
	  }

	  public static void printUpperCase() {
		  char c;
		  for (c = 'A'; c <= 'Z'; ++c)
				  System.out.println(c);
	  }
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		
		AsciiChars.printNumbers();
		AsciiChars.printLowerCase();
		AsciiChars.printUpperCase();
		
		System.out.println("Please enter your name: ");
		String name = input.nextLine();
		System.out.println("Hello " + name);
		System.out.println("Do you want to continue? (yes, no).");
		String answer = input.nextLine();

		while (answer.equals("no")) {
				//doesn't break?
				System.out.println("Please return later to complete the survey.");
				break;
		}
		
		do {
			System.out.println("Do you have a red car? (yes, no)");
			String carAns = input.nextLine();
			System.out.println("What is two-digit model year of your car?");
			int carYear = Integer.parseInt(input.nextLine());
			System.out.println("What is the name of your favorite pet?");
			String petAns = input.nextLine();
			System.out.println("How old is your favorite pet?");
			int petAge = Integer.parseInt(input.nextLine());
			System.out.println("What is your lucky number?");
			int luckyNum = Integer.parseInt(input.nextLine());
			System.out.println("Do you have a favorite quarterback? (yes, no)");
			String footballAns = input.nextLine();
			
			if (footballAns.equals("yes")) {
				System.out.println("What is their jersey number?");
				int footballNum = Integer.parseInt(input.nextLine());
			}
			
			System.out.println("Enter a random number between 1 and 50.");
			int randomNum = Integer.parseInt(input.nextLine());

			int int1 = rand.nextInt(10);
			int int2 = rand.nextInt(100);
			
			int magicBall = (luckyNum * int1);
			
			if (magicBall > 75) {
				magicBall =- 25;
			}
			
			int nonMag1 = petAns.charAt(3);
			int nonMag2 = (carYear + luckyNum);
			int nonMag3 = (int2 - randomNum); 
			int nonMag4 = 42;
			int nonMag5 = (petAge + luckyNum);
			
			String nums = String.format("Lottery numbers: %d, %d, %d, %d, %d Magic Ball: %d", nonMag1, nonMag2, nonMag3, nonMag4, nonMag5, magicBall);
			
			System.out.println(nums);
			System.out.println("Would you like to play again? (yes, no)");
			String playAgain = input.nextLine();
		} 
		//cannot be resolved?
		//while (answer.equals("yes") || playAgain.equals("yes")); 		
		while (answer.equals("yes"));
	} //{
		//cannot be resolved?
		//while (playAgain.equals("no")) {
		//System.out.println("Thanks for playin");
		//break;
	} //} 
//}
