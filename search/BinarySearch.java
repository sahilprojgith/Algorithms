package search;

public class BinarySearch
{

	public static int binarySearch(int arr[], int value)
	{
		int start = 0;
		int end = arr.length - 1;
		int middle = (start + end) / 2;
		while (arr[middle] != value && start <= end)
		{
			middle = (start + end) / 2;
			if (value < arr[middle])
			{
				end = middle - 1;
			} else
			{
				start = middle + 1;
			}
			if (arr[middle] == value)
			{
				System.out.println("The element is found at the index: " + middle);
				return middle;
			}
		}
		System.out.println("the element " + value + " not found");
		return -1;
	}

}
