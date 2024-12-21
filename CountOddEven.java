package Arrays_Logical_Questions.Day_02;

/* Count Odd and Even Numbers
   Given an array {1, 2, 3, 4, 5, 6}, 
   write a program to count how many elements are odd and how many are even.*/

import java.util.Scanner;

public class CountOddEven 
{
	public static int[] createArray()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter array size: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		System.out.print("Enter "+size+" elements in array: ");
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
			System.out.println("Array element at index " + i + ": " + arr[i]);
		}
		sc.close();
		return arr;
	}
	
	public static void countOddEven(int[] arr)
	{
		int evenCount = 0, oddCount = 0;
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] % 2 == 0)
			{
				evenCount++;
			}
			else
			{ 
				oddCount++;
			}
		}
		System.out.println("\nArray all even element count: "+ evenCount);
		System.out.println("Array all odd element count: "+ oddCount);
	}
	
	public static void main(String[] args) 
	{
		int[] arr1 = createArray();
		countOddEven(arr1);
	}
}
