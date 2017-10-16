/*
 * This program excepts a number and finds all the factors of that given number. Then returns an arraylist populated with the factors.
 * This program was tested on 9/14/2017 at 6:09 PM and it past all tests.
 */

package primeOperations;
import java.util.ArrayList;
public class FactorFinder {
	public FactorFinder() {
		// TODO Auto-generated constructor stub
	}
	
	public  ArrayList<Integer> findFactors(int incoming)
	{
		
		ArrayList<Integer> factors = new ArrayList<Integer>(1);
		for(int i = 1; i < (incoming/2) + 1; i++)
		{
			if((double)incoming/i == incoming/i)
			{
				factors.add(i);
			}
		}
		
		return factors;
	}

}
