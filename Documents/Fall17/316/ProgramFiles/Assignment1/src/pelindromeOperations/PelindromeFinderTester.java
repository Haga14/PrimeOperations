package pelindromeOperations;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

@SuppressWarnings("unused")
public class PelindromeFinderTester {

	public static void main(String[] args) {
		PelindromFinder findPelindromes = new PelindromFinder();
		
		System.out.println("Please enter a number to check if is a pelindrome.");				
		int[] input = ArrayMaker();
	
		if(input.length == 5 )
		{
			findPelindromes.fill(input);
			if(findPelindromes.isItPelindrome())
			{
				System.out.println("The number is a pelindrome");
			}
			else
			{
				
				System.out.println("The number is NOT a pelidrome");
			}
		}
		else 
		{
			System.out.print("Invalid Number");
		}
				
	}
	
	public static String inputProcessor()//This method gets and validates the user input.
	{
		Scanner inputGetter = new Scanner(System.in);
		int input = 0;
		String inputString = "";
		for(int i = 0; i < 10; i++)
		{
			System.out.println("What number would you like to check? Please enter only non-zero positive integers. For example: 10");
			
			inputString = inputGetter.next();
			try
			{
				input = Integer.parseInt(inputString);
				break;
			}
			catch(NumberFormatException e)
			{
				if(i == 7)
				{
					System.out.println("You are running out of tries. You have 2 attempts left");
				}
				else if(i == 9)
				{
					inputGetter.close();
					System.out.println("This was your 10th attempt. The program will now terminate. \nGoodbye:");
					System.exit(0);
				}
				else
				{
					continue;
				}
			}

		}
		
		
	
		
		
		return inputString;
	}
	
	
	public static int[] ArrayMaker()
	{
		String testString = inputProcessor();
		int[] intLength = new int[testString.length()];
		
		for(int i = 0; i < testString.length(); i++)
		{
			intLength[i] = Integer.parseInt(testString.substring(i, i + 1));
		}
		
		
		return intLength;
	}
	


}
