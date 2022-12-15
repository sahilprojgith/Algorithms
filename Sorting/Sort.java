package Sorting;

public class Sort
{
	public void BubbleSort(int[] array)// Time Complexity : O(n^2)
	{
		int tmp;
		int n = array.length;
		for (int i = 0; i < n - 1; i++)// Passes
		{
			for (int j = 0; j < n - i - 1; j++)// Internal Comparison
			{
				if (array[j] > array[j + 1])
				{
					tmp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = tmp;
				}
			}
		}
		for (int i : array)
		{
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public void SelectionSort(int[] array)// Time Complexity : O(n^2)
	{
		int tmp;
		int n = array.length;
		for (int i = 0; i < n - 1; i++)
		{
			int location = i;
			for (int j = i + 1; j < n; j++)
			{
				if (array[location] > array[j])
				{
					location = j;
				}
			}
			tmp = array[i];
			array[i] = array[location];
			array[location] = tmp;
		}
		for (int i : array)
		{
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public void InsertionSort(int[] array)// Time Complexity : O(n^2)
	{
		int tmp;
		int n = array.length;
		for (int i = 1; i < n - 1; i++)
		{
			tmp = array[i];
			int j = i - 1;
			while (array[i] < array[j] && j >= 0)
			{
				tmp = array[i];
				array[i] = array[j];
				array[j] = tmp;
			}
		}
		for (int i : array)
		{
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public void swap(int[] arr, int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public int partition(int[] arr, int low, int high)
	{
		int pivot = arr[high];
		int i = (low - 1);

		for (int j = low; j <= high - 1; j++)
		{
			if (arr[j] < pivot)
			{
				i++;
				swap(arr, i, j);
			}
		}
		swap(arr, i + 1, high);
		return (i + 1);
	}

	public int[] QuickSort(int[] arr, int low, int high)
	{
		if (low < high)
		{
			int pi = partition(arr, low, high);
			QuickSort(arr, low, pi - 1);
			QuickSort(arr, pi + 1, high);
		}
		return arr;
	}

	public void merge(int arr[], int l, int m, int r)
	{
		int n1 = m - l + 1;
		int n2 = r - m;

		int L[] = new int[n1];
		int R[] = new int[n2];

		for (int i = 0; i < n1; ++i)
		{
			L[i] = arr[l + i];
		}

		for (int j = 0; j < n2; ++j)
		{
			R[j] = arr[m + 1 + j];
		}

		int i = 0, j = 0;
		int k = l;
		while (i < n1 && j < n2)
		{
			if (L[i] <= R[j])
			{
				arr[k] = L[i];
				i++;
			} else
			{
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		while (i < n1)
		{
			arr[k] = L[i];
			i++;
			k++;
		}

		while (j < n2)
		{
			arr[k] = R[j];
			j++;
			k++;
		}
	}

	public int[] MergeSort(int arr[], int l, int r)
	{
		if (l < r)
		{
			int m = l + (r - l) / 2;

			MergeSort(arr, l, m);
			MergeSort(arr, m + 1, r);
			merge(arr, l, m, r);
		}
		return arr;
	}
}
