package com.bridgelab.maximumusinggenerics;

/*****************************************
 * @author mihir
 * @since 30-June-2021
 * 
 * Using generic array and sorting it.
 ****************************************/

public class FindMaximum
{
	/**
	 * Name : sorting.
	 * 
	 * Description : sorting array.
	 *
	 * @param <T>
	 * @param sortArray
	 * 
	 * Algorithm  : accepting generic type of arrays using bubble sort to sort the array.
	 * using compareTo() method to compare adjacent array element and swapping them to sort the array.
	 * 
	 * Modification : First commit 01-July-2021
	 */
	public static<T extends Comparable<T>> void sorting(T[] sortArray)
	{
		for (int i = 0; i < sortArray.length; i++)
		{
            for (int j = i + 1; j < sortArray.length; j++)
            {
                if (sortArray[i].compareTo(sortArray[j]) > 0)
                {
                    T temp = sortArray[i];
                    sortArray[i] = sortArray[j];
                    sortArray[j] = temp;
                }
            }
        }
		printSortedArray(sortArray);
	}
	
	/**
	 * Name : printSortedArray
	 * 
	 * Description : printing sorted array.
	 * 
	 * @param <T>
	 * @param sortArray
	 * 
	 * Modification : First commit 01-July-2021
	 */
	public static <T> void printSortedArray(T[] sortArray)
	{
		System.out.println("Sorted Array:");
		System.out.print("[");
		for(T element : sortArray)
		{
			System.out.print(" " + element + " ");
		}
		System.out.print("]");
		System.out.println();
	}
	
	/**
	 * Name : main.
	 * Calling methods from main.
	 * 
	 * @param args
	 */
	public static void main(String[] args)
	{
		Integer[] intArray = { 76, 29, 44, 99, 2, 7};
		Double[] doubleArray = { 44.79, 1.1, 77.68, 2.2, 0.1, 55.1};
		
		sorting(intArray);
		sorting(doubleArray);
	}
}
