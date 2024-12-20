package Logical_Que.Dec_19;

import java.util.Scanner;

public class Display_ArrayFirstAndLastDigit_Sum 
{
	public static int[] createArray()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		System.out.print("Enter "+ size +" elements in an array: ");
		for(int i=0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
			System.out.println("Array element "+ i +" index value: "+ arr[i]);
		}
		sc.close();
		return arr;
	}
	
	public static void printSum(int[] arr)
	{
		int firstDigit = arr[0];  
		int lastDigit = arr[arr.length - 1];
		
		if (arr.length == 0)
		{
            System.out.println("Array is empty. No elements to calculate.");
            System.exit(0);
        }
		else 
		{
			System.out.println("\nSum of first and last element: "+ (firstDigit + lastDigit));	
		}
	}

	public static void main(String[] args) 
	{
		int[] result = createArray();
		printSum(result);
		
	}
}
