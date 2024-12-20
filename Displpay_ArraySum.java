package Logical_Que.Dec_19;

import java.util.Scanner;

public class Displpay_ArraySum 
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
	
	public static void sumAll(int[] arr)
	{
		int sum = 0;
		for(int i=0; i < arr.length; i++)
		{
			sum = sum + arr[i];
		}
		System.out.print("\nSum of all arrays are: "+ sum);
	}
	
	public static void main(String[] args) 
	{
		int[] result = createArray();
		sumAll(result);
	}
}
