package whileloops;

import java.util.Scanner;

public class KeepGuessing
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		int pin = 9;

		System.out.println("WELCOME TO THE KEEP GUESSING GAME");
		System.out.println("I have chosen a number between 1 and 10. Try to guess it.");
		
		int no = keyboard.nextInt();
		System.out.print("Your guess:" + no);
		
 		
        while ( no != pin )
		{
			System.out.println("\nThat is incorrect :(. Guess again.");
			
			no = keyboard.nextInt();
			System.out.print("Your guess: ");
		}

		System.out.println("\nResult is here \nYour guess is " + no + " and the number was also " + pin + "\nWOWWWWWWWWW That's right! You're a good guesser. \n");
	
}
}
