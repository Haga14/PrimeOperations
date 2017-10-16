package primeOperations;
import java.util.ArrayList;
import java.util.Scanner;
public class FactorFinderTestDriver {

	public static void main(String[] args) {
		Scanner inputGetter = new Scanner(System.in);
		int incomingNum;
		FactorFinder findsFactors = new FactorFinder();
		ArrayList<Integer> factorBank; // = new ArrayList<Integer>(0);
		for(int i = 0; i < 20; i++)
		{
			incomingNum = inputGetter.nextInt();
			factorBank = new ArrayList<Integer>(findsFactors.findFactors(incomingNum));
			for(int a = 0; a < factorBank.size(); a++)
			{
				System.out.println(factorBank.get(a));
			}
			
		}
		
		inputGetter.close();
		System.exit(9);

	}

}
