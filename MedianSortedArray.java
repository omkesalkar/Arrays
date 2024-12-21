package Arrays_Logical_Questions.Day_02;

import java.util.Scanner;

public class MedianSortedArray 
{
	public static int[] createArray()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		System.out.print("Enter "+ size +" elements in array: ");
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
			System.out.println("Array element at index "+ i +" : "+ arr[i]);
		}
		sc.close();
		return arr;
	}
	
	public static void printMedian(int[] arr)
	{
		double median = 0;
		for(int x : arr)
		{
			if(x % 2 == 0)   //even median calculate
			{
				median = ( arr[arr.length/2-1] + arr[arr.length / 2] ) / 2.0;
			}
			else
			{
				median = arr[arr.length / 2];  //odd median calculate
			}
		}
		System.out.println("Median is: "+ median);
	}
	
	public static void main(String[] args) 
	{
		int[] arr1 = createArray();
		printMedian(arr1);
	}
}
