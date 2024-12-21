package Arrays_Logical_Questions.Day_02;

/*Count and Print Distinct Elements.
Write a program to count the number of distinct/unique/non repeated elements in an array 
{1, 2, 2, 3, 4, 4, 5} and print those unique elements.*/

import java.util.Scanner;

public class DistinctElementOfArray 
{
	public static int[] createArray()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter array size: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		System.out.print("Enter "+ size +" elements: ");
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		sc.close();
		return arr;
	}
	
	public static void printDistinctElement(int[] arr)
	{
		System.out.print("\nDistinct/Unique/Non-Repeated element in an array: ");
		for(int i=0; i<arr.length; i++)
		{
			int count = 0;
			for(int j=1; j<arr.length; j++)
			{
				if(arr[i] == arr[j])
				{
					count++;
				}
			}
			if(count >= 2)
			{
				System.out.print(arr[i]+ " ");
			}
		}
	}
	
	public static void main(String[] args) 
	{
		int[] arr1 = createArray();
		printDistinctElement(arr1);
	}

}
