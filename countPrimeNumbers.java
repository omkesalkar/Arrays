package Arrays_Logical_Questions.Day_02;
/* Write a program to count how many elements in an array
   {2, 3, 4, 5, 6, 7, 8, 9, 10} are prime numbers.
   Example: 2, 3, 5, and 7 are prime.*/

import java.util.Scanner;

public class countPrimeNumbers 
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
	
	public static void primeNumbers(int[] arr)
	{
		System.out.print("\nPrime numbers in array: ");
		for(int i=0; i<arr.length; i++)
		{
			int count = 0;
			for(int j=1; j<=arr.length; j++)
			{
				if(arr[i] % j == 0)
				{
					count++;
				}
			}
			if(count == 2)
			{
				System.out.print(arr[i]+" ");
			}
		}
	}
	
	public static void main(String[] args) 
	{
		int[] arr1 = createArray();
		primeNumbers(arr1);
	}
}
