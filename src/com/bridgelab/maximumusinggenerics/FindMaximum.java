package com.bridgelab.maximumusinggenerics;

/*****************************************
 * @author mihir
 * @since 30-June-2021
 * 
 * Finding maximum problem using generic.
 ****************************************/

public class FindMaximum
{
	static Integer max;
	/**
	 * Name : maximumInteger
	 * 
	 * Description : Finding maximum number.
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 * 
	 * Algorithm : Finding max integer using compareTo() method.
	 * 
	 * Modification : First commit 30-June-2021.
	 */
	public static int maximumInteger(Integer intNumeOne, Integer intNumTwo, Integer intNumThree)
	{
		max = intNumeOne;
		if(intNumTwo.compareTo(max) > 0)
		{
			max = intNumTwo;
		}
		if(intNumThree.compareTo(max) > 0)
		{
			max = intNumThree;
		}
		return max;
	}
	
	/**
	 * @param args
	 * Passing integer value to function.
	 * Calling maximumInteger function.
	 * printing the maximum number as a result.
	 */
	public static void main(String[] args)
	{
		Integer intNumeOne = 15, intNumTwo = 55, intNumThree = 24;
		
		maximumInteger(intNumeOne, intNumTwo, intNumThree);
		System.out.println("Maximum amoungst : " + intNumeOne + ", " + intNumTwo + ", " + intNumThree + " : is : " + max);
	}
}
