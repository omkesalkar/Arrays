package Logical_Que.Dec_19;

import java.util.Scanner;

public class Display_RetriveIndexValue 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Array size: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		System.out.print("Enter "+ size +" elements: ");
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
			System.out.print("Array "+i+" index element value are: ");
			System.out.println(arr[i]);		
		}
		
		System.out.print("\nEnter a index number between (0 to "+(size-1)+") to check that index array element value: ");
		int checkIndex = sc.nextInt();
		for(int i=0; i<arr.length; i++)
		{
			if(i == checkIndex)
			{
				System.out.println("Value of index "+checkIndex+" is: "+ arr[i]);	
				break;
			}
		}
		sc.close();
	}
}
