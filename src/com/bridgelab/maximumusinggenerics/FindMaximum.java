package com.bridgelab.maximumusinggenerics;

/*****************************************
 * @author mihir
 * @since 30-June-2021
 * 
 * Finding maximum numbers using generic.
 ****************************************/

public class FindMaximum
{
	/**
	 * Name : genericMaximum
	 * 
	 * Description : Finding maximum amongst all.
	 * 
	 * @param intNumeOne
	 * @param intNumTwo
	 * @param intNumThree
	 * @return
	 * 
	 * Algorithm : Finding max variable using compareTo() method who's having T type of data type.
	 * 
	 * Modification : 2nd commit 01-July-2021.
	 */
	public static<T extends Comparable<T>> T genericMaximum(T intNumeOne, T intNumTwo, T intNumThree)
	{
		T maximum = intNumeOne;
		if(intNumTwo.compareTo(maximum) > 0)
		{
			maximum = intNumTwo;
		}
		if(intNumThree.compareTo(maximum) > 0)
		{
			maximum = intNumThree;
		}
		displayMaximum(intNumeOne, intNumTwo, intNumThree, maximum);
		return maximum;
	}
	
	/**
	 * Name : displayMaximum
	 * 
	 * Description : Display Maximum amongst all.
	 * 
	 * @param <T>
	 * @param firstVariable
	 * @param secondVariable
	 * @param thirdVariable
	 * @param maximumVariable
	 * 
	 * Algorithm : Accepting returned variables from genericMaximum() method and just printing the maximum variable amongst all.
	 * 
	 * Modification : First commit 01-July-2021
	 */
	public static <T> void displayMaximum(T firstVariable, T secondVariable, T thirdVariable, T maximumVariable)
	{
		System.out.println("Maximum amoungst : " + firstVariable + ", " + secondVariable + ", " + thirdVariable + " : is : " + maximumVariable);
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
		Float floatNumOne = 218.13f, floatNumTwo = 555.453f, floatNumThree = 999.999f;
		String stringOne = "Apple", stringTwo = "Peach", stringThree = "Banana";
		
		genericMaximum(intNumeOne, intNumTwo, intNumThree);
		genericMaximum(floatNumOne, floatNumTwo, floatNumThree);
		genericMaximum(stringOne, stringTwo, stringThree);
	}
}
