class SwapProblem
{
	public boolean solution(int[] arr)
	{
		boolean unsorted = false;
		int unsortedIndex = -1;
		int toSwapIndex = -1;
		
		for(int i = 0; i < arr.length - 1; i++)
		{
			if(arr[i + 1] < arr[i])
			{
				unsorted = true;
				unsortedIndex = i;
				toSwapIndex = i + 1;
				break;
			}
		}
		if(unsorted == true)
		{
			for(int i = unsortedIndex + 1; i < arr.length - 1; i++)
			{
				if(arr[i + 1] < arr[i])
				{
					toSwapIndex = i + 1;
				}
			}
		}
		
		if(unsortedIndex != -1)
		{
			int temp = arr[unsortedIndex];
			arr[unsortedIndex] = arr[toSwapIndex];
			arr[toSwapIndex] = temp;
		}
		
		for(int i = 0; i < arr.length - 1; i++)
		{
			if(arr[i + 1] < arr[i])
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String args[])
	{
		SwapProblem swap = new SwapProblem();
		int[] arr = {3, 2, 1};
		boolean res = swap.solution(arr);
		System.out.println(res);
	}
}