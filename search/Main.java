package search;

public class Main
{

	public static void main(String[] args)
	{
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		BinarySearch bs = new BinarySearch();
		bs.binarySearch(array, 4);
//		LinearSearch ls = new LinearSearch();
//		ls.linearSearch(array, 10);
		bs.binarySearch(array, 11);
	}

}
