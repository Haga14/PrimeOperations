package perfectNumbers;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import primeOperations.FactorFinder;

public class PerfectNumberFinder {

	public static void main(String[] args) {
		
		
		FactorFinder find = new FactorFinder();
		ArrayList<Integer> numberSet = new ArrayList<Integer>();
		ArrayList<Integer> factorSet = new ArrayList<Integer>();
		int input = 1;
		int counter = 0;
		while(input != 0 || input > 0)
		{
			System.out.println("Please enter the next number, enter 0 to stop");
			input = inputProcessor();
			if(input > 0)
			{
				if(input != 991199)
				{
					numberSet.add(input);
				}

			}
			else
			{
				continue;
			}
		}
		
		if(input == 0)
		{
			if(numberSet.size() == 0)
			{
				System.out.println("You didn't enter any numbers to analyze.\nThe program will now terminate.");
				System.exit(0);
			}
			for(int i = 0; i < numberSet.size(); i++)
			{
				factorSet = find.findFactors(numberSet.get(i));
				for(int a = 0; a < factorSet.size(); a++)
				{
					counter += factorSet.get(a);
					
				}
				
				if(counter == numberSet.get(i) & numberSet.get(i) != 0)
				{
					System.out.println("The number " + numberSet.get(i) + " is a perfect number.");
				}
				else if(numberSet.get(i) != 0)
				{
					System.out.println("The number " + numberSet.get(i) + " is NOT a perfect number.");
				}
				counter = 0;

			}
		}
		System.exit(0);
				
	}
	
	
	
	public static int inputProcessor()//This method gets and validates the user input.
	{
		Scanner inputGetter = new Scanner(System.in);
		int input = -1;
		for(int i = 0; i < 10; i++)
		{
			try
			{
				input = inputGetter.nextInt();
				if(input < 0)
				{
					System.out.print("Invalid Number");
				}
				break;
			}
			catch(InputMismatchException e)
			{
				if(i != 7 || i != 9)
				{
					input = 991199;
					System.out.println("Invalid Number");
					break;
				}
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
		
		return input;
	}
	
}
