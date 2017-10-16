
package primeOperations;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Primer {

	public static void main(String[] args) {
		PrimeFinder findsPrimes = new PrimeFinder();
		ArrayList<Integer> primeFactors = new ArrayList<Integer>();
		int input = inputProcessor();
		
		if(input == -1) //A sentinel value that when returned, the program exits
		{
			System.out.println("The Program will now terminate.");
			System.exit(0);
		}
		else if(input != 991199)
		{
			findsPrimes.setInput(input);
			if(findsPrimes.isPrime())
			{
				System.out.println(input + " is a prime number.");
				System.exit(0);
			}
			else
			{
				System.out.println(input + " is not a prime number");
				primeFactors = findThePrimeFactorsOf(input);
				
				System.out.println("The prime factors of " + input + " are:");
				for(int i = 0; i < primeFactors.size(); i++)
				{
					System.out.println(primeFactors.get(i));
				}
				
			}
		}
		
		
		

	}
	
	public static ArrayList<Integer> findThePrimeFactorsOf(int incomingNum)
	{
		PrimeFinder findsPrimes = new PrimeFinder(); //This class takes in a number and determines whether that given number is a prime or not.
		FactorFinder findsFactors = new FactorFinder(); //This class takes in a number and finds all the factors of that number.
		ArrayList<Integer> factorList = new ArrayList<Integer>(); //This ArrayList will hold the set factors of incomingNum
		ArrayList<Integer> primeFactors = new ArrayList<Integer>(); //This ArrayList will hold the prime subset of the set of factors of incomingNum
		
		factorList = findsFactors.findFactors(incomingNum); //This finds and stores into factorList the set of factors of incomingNum
		
		for(int i = 0; i < factorList.size(); i++) //This loops through the set of factors of incomingNum and saves in primeFactors the prime subset of it.
		{
			findsPrimes.setInput(factorList.get(i));
			if(findsPrimes.isPrime())
			{
				primeFactors.add(factorList.get(i));
			}
			else
			{
				continue;
			}
		}
		
		return primeFactors;
	}
	
	public static int inputProcessor()//This method gets and validates the user input.
	{
		Scanner inputGetter = new Scanner(System.in);
		int input = -1;
		System.out.println("What number would you like to check? Please enter only non-zero positive integers. For example: 10");
		
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
