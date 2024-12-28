package Arrays_Logical_Questions.Day_06_Shifting;

import java.util.Scanner;

public class RotateAllElementAnticlockWiseKtimes 
{
	public static void rotateKtimes(int[] arr, int k)
	{
		k = k % arr.length;
		while(k != 0)
		{
			int temp = arr[0];
			for(int i=0; i<arr.length-1; i++)
			{
				arr[i] = arr[i+1];
			}
			arr[arr.length-1] = temp;
			k--;
		
		}
		System.out.print("Array after rotating times : ");
		for(int x : arr)
		{
			System.out.print( x +" ");
		}
	}
	
	public static void main(String[] args) 
	{
		int[] arr = {1,2,3,4,5};
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter K value: ");
		int K = sc.nextInt();
		rotateKtimes(arr, K);
	}

}
