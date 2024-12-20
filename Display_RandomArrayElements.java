package Logical_Que.Dec_19;

import java.util.Scanner;

public class Display_RandomArrayElements
{
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size (1-100): ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		for(int i=0; i<=arr.length; i++)
		{
			int randomNumer = (int) (Math.random() * arr.length);
			System.out.println("Array "+ i +" index element are: "+ randomNumer);
		}
		sc.close();
	}
}
