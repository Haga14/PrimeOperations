/*
 * This class takes a given number, and it performs two operations.
 * 	1. It finds all the divisors of the given number.
 * 	2. If the number of divisors is greater than 2, it determines that the number is in fact prime. 
 * 	3. Otherwise, the number is determined as being a non-prime number.
 * 	4. This program has been tested on 9/14/17 at 3:00 PM and it passed all tests.
 */

package primeOperations;

public class PrimeFinder {

	private static int input;
	public PrimeFinder() {
		// TODO Auto-generated constructor stub
	}
	
	public PrimeFinder(int incoming) //Ask Ankur why this won't function is a loop.
	{
		input = incoming;
	}
	
	public void setInput(int incomingNum)
	{
		input = incomingNum;
	}
	
	public  boolean isPrime()
	{
		boolean isPrime = true;
		if(divisor() > 2)
		{
			isPrime = false;
		}
		
		return isPrime;
	}
	
	public static int divisor()
	{
		int counter = 1;
		for(int i = 1; i < (input/2) + 1; i++)
		{
			if((double)input/i == input/i)
			{
				counter += 1;
			}
		}
		
		return counter;
	}

}
