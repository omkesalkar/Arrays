package Logical_Que.Dec_19;

import java.util.Scanner;

public class Display_AverageArrayFind
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		int sum = 0;
		int avg = 0;
		int n = arr.length;

		System.out.print("Enter "+size+" elements in array: ");
		for(int i=0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
			System.out.println("Array "+ i +" index element value is: "+ arr[i]);
			
			sum = sum + arr[i];
			avg = (sum / n);
		}
		System.out.println("Average of array is: "+avg);
		sc.close();
	}
}
