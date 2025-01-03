package Arrays_Logical_Questions.Day_07_ArrayInterviewQuestion;

/*Implement a java program to find kth smallest element in an
  unsorted array and print it. 
*/

public class FindKthSmallestUnsortedArray 
{
	public static int kthSmallestElement(int[] arr, int k)
	{
		int min = arr[0], max = arr[0];
		
		for(int x : arr)
		{
			if(min > x)
				min = x;
	
			if(max < x)
				max = x;
		}
		
		int count = 0;
		for(int i=min; i<=max; i++)
		{
			for(int j=0; j<arr.length; j++)
			{
				if(i == arr[j])
				{
					count++;
					break;
				}
			}
			if(count == k)
			{
				return i;
			}
		}
		return -1;
		
	}

	public static void main(String[] args) 
	{
		int[] arr =  {7, 8, 3, 2, 4, 5};
		int k = 1;
		int index = kthSmallestElement(arr, k);
		if(index > 0)
		{
			System.out.println("Kth smallest element: "+  index);
		}
		else
		{
			System.err.println("Kth smallest element not found.");
		}
	}

}
