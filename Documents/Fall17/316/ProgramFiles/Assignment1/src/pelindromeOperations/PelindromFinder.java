package pelindromeOperations;

import java.util.ArrayList;

public class PelindromFinder {
	
	private static ArrayList<Integer> fullList = new ArrayList<Integer>();
	private static ArrayList<Integer> firstHalf = new ArrayList<Integer>();
	private static ArrayList<Integer> secondHalf = new ArrayList<Integer>();
	
	public void fill(int[] incomingNum)
	{
		for(int i = 0; i < incomingNum.length; i++)
		{
			fullList.add(incomingNum[i]);
		}
		fillFirstHalf();
		fillSecondHalf();
	}
	
	private static void fillFirstHalf()
	{
		for(int i = 0; i < fullList.size()/2; i++)
		{
			firstHalf.add(fullList.get(i));
		}
	}
	
	private static void fillSecondHalf()
	{
		for(int i = fullList.size() - 1;i > fullList.size()/2 - 1 ; i--)
		{
			secondHalf.add(fullList.get(i));
		}
	}
	
	
	public boolean isItPelindrome()
	{
		for(int i = 0; i < firstHalf.size(); i++)
		{
			if(firstHalf.get(i) != secondHalf.get(i))
			{
				return false;
			}
			
		}
		
		return true;
	}
	
	
	
	
	

}
