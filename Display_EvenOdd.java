package Logical_Que.Dec_19;

import java.util.Scanner;

public class Display_EvenOdd 
{
	public static int[] createArray()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		System.out.print("Enter "+size+" elements in array: ");
		for(int i=0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
			System.out.println("Array "+ i +" index element value is: "+ arr[i]);
		}
		sc.close();
		return arr;
	}
	
	public static void isEven(int[] arr)
	{
		System.out.print("\nEven elements are: ");
		for(int i=0; i < arr.length; i++)
		{
			if(arr[i] % 2 == 0)
			{
				int even = arr[i];
				System.out.print(even+ " ");
			}
		}
	}
	
	public static void isOdd(int[] arr)
	{
		System.out.print("\nOdd elements are: ");
		for(int i=0; i < arr.length; i++)
		{
			if(arr[i] % 2 != 0)
			{
				int odd = arr[i];
				System.out.print(odd+" ");
			}
		}
	}
	
	
	public static void main(String[] args)
	{
		int result[] = createArray();
		isEven(result);
		isOdd(result);
	}

}
