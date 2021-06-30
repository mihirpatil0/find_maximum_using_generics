package com.bridgelab.maximumusinggenerics;

/*****************************************
 * @author mihir
 * @since 30-June-2021
 * 
 * Finding maximum numbers using generic.
 ****************************************/

public class FindMaximum
{
	static Integer max;
	static Float maxFloat;
	static String maxString;
	
	/**
	 * Name : maximumInteger
	 * 
	 * Description : Finding maximum number.
	 * 
	 * @param intNumeOne
	 * @param intNumTwo
	 * @param intNumThree
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
	 * Name : maximumFloat
	 * 
	 * Description : Finding maximum float number.
	 * 
	 * @param floatNumOne
	 * @param floatNumTwo
	 * @param floatNumThree
	 * @return
	 * Algorithm : Finding max Float value using compareTo() method.
	 * 
	 * Modification : First commit 30-June-2021
	 */
	public static Float maximumFloat(Float floatNumOne, Float floatNumTwo, Float floatNumThree)
	{
		maxFloat = floatNumOne;
		
		if(floatNumTwo.compareTo(maxFloat) > 0)
		{
			maxFloat = floatNumTwo;
		}
		if(floatNumThree.compareTo(maxFloat) > 0)
		{
			maxFloat = floatNumThree;
		}
		return maxFloat;
	}
	
	/**
	 * Name : maximumString
	 * 
	 * Description : Printing maximum String.
	 * @param stringOne
	 * @param stringTwo
	 * @param stringThree
	 * @return
	 * 
	 * Algorithm : Finding max String value using compareTo() method.
	 * 
	 * Modification : First commit 30-June-2021
	 */
	public static String maximumString(String stringOne, String stringTwo, String stringThree)
	{
		maxString = stringOne;
		
		if(stringTwo.compareTo(maxString) > 0)
		{
			maxString = stringTwo;
		}
		if(stringThree.compareTo(maxString) > 0)
		{
			maxString = stringThree;
		}
		return maxString;
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
		
		maximumInteger(intNumeOne, intNumTwo, intNumThree);
		System.out.println("Maximum amoungst : " + intNumeOne + ", " + intNumTwo + ", " + intNumThree + " : is : " + max);
		
		maximumFloat(floatNumOne, floatNumTwo, floatNumThree);
		System.out.println("Maximum amoungst : " + floatNumOne + ", " + floatNumTwo + ", " + floatNumThree + " is : " + maxFloat);
		
		maximumString(stringOne, stringTwo, stringThree);
		System.out.println("Maximum amoungst : " + stringOne + ", " + stringTwo + ", " + stringThree + " is : " + maxString);
	}
}
