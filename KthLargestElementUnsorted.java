package Arrays_Logical_Questions.Day_07_ArrayInterviewQuestion;

/*Implement a java program to find kth largest element in an unsorted array and print it. 
 * */
import java.util.Arrays;
import java.util.Scanner;

public class KthLargestElementUnsorted 
{
	public static int KthLargestUnsorted(int[] arr, int k)
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
		for(int i=max; i>=min; i--)
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
		int[] arr = {10, 3, 3, 5, 2, 8};
		System.out.println("Original array: "+ Arrays.toString(arr));
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Kth value: ");
		int k = sc.nextInt();
		
		int result = KthLargestUnsorted(arr, k);
		if(result > 0)
		{
			System.out.println("Kth Largest element: "+ result);
		}
		else
		{
			System.err.println("Invalid kth Value");
		}
		sc.close();

	}

}
