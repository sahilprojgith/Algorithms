package search;

public class LinearSearch
{
	public void linearSearch(int arr[], int value)
	{
		for (int i = 0; i < arr.length; i++)
		{
			if (value == arr[i])
			{
				System.out.println("Value : " + value + " found at index " + i);
			}
		}
	}
}
