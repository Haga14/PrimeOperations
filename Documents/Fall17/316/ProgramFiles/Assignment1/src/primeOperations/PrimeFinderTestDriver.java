package primeOperations;
import java.util.Scanner;
public class PrimeFinderTestDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inputGetter = new Scanner(System.in);
		
		int incomingNum;
		
		PrimeFinder findsPrimes = new PrimeFinder();
		
		for(int i = 0; i < 20; i++)
		{
			incomingNum = inputGetter.nextInt();
			findsPrimes.setInput(incomingNum);
			if(findsPrimes.isPrime())
			{
				System.out.print(incomingNum + " is a prime number.");
			}
			else
			{
				System.out.print("That number is not a prime number.");
			}
			
		}
		
		
		inputGetter.close();
		System.exit(0);
	}

}
