package Arrays_Logical_Questions.Day_07_ArrayInterviewQuestion;

/*Implement a java program to find kth smallest element in an sorted array and print it.*/

import java.util.Arrays;
import java.util.Scanner;

public class KthSmallestElementSorted 
{
	public static int KthSmallest(int[] arr, int k)
	{
		Arrays.sort(arr);
		int count = 0;
		
		if(k == 1)
		{
			return arr[0];
		}
		
		for(int i=0; i<arr.length-1; i++)
		{
			if(arr[i] != arr[i+1])
			{
				count++;
			}
			
			if(count == k)
			{
				return arr[i+1];
			}
		}
		return -1;
	}

	public static void main(String[] args) 
	{
		int[] arr = {10, 9, 3, 5, 2, 8};
		System.out.println("Original array: "+ Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("Sorted array: "+ Arrays.toString(arr));

	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Kth value: ");
		int k = sc.nextInt();
		
		int result = KthSmallest(arr, k);
		if(result > 0)
		{
			System.out.println("Kth smallest element: "+ result);
		}
		else
		{
			System.err.println("Invalid kth Value");
		}
		sc.close();
	}
}