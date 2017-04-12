import java.io.*;
import java.util.*;

public class Quicksort3 
{
	static int partition(int arr[], int low, int high)
	{
		int pivot = arr[high];
		int i = (low-1);
		for(int j = low; j < high; j++)
		{
			if(arr[j] <= pivot)
			{
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;
		printArr(arr);
		return i+1;
	}
	
	static void qSort(int arr[], int low, int high)
	{
		if (low < high)
		{
			int pi = partition(arr, low, high);
			qSort(arr, low, pi-1);
			qSort(arr, pi+1, high);
		}
	}
	
	static void printArr(int[] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++)
        {
            nums[i] = in.nextInt();
        }
        qSort(nums, 0, nums.length-1);
    }
}