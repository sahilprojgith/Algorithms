package Sorting;

import java.util.Arrays;

public class Main
{

	public static void main(String[] args)
	{
		int [] numbers = {54,36,89,12,19};
		Sort sort = new Sort();
//		sort.BubbleSort(numbers);
//		sort.SelectionSort(numbers);
//		sort.InsertionSort(numbers);
//		System.out.println(Arrays.toString(sort.QuickSort(numbers, 0,numbers.length-1)));
		System.out.println(Arrays.toString(sort.MergeSort(numbers, 0,numbers.length-1)));

	}

}
