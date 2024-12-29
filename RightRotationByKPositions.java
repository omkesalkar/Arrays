package Arrays_Logical_Questions.Day_06_Shifting;

/* Right Rotation by k Positions
   Write a program to perform a right rotation of the 
   array {1, 2, 3, 4, 5} by k = 2 positions.
   Output: {4, 5, 1, 2, 3}  */

import java.util.Scanner;

public class RightRotationByKPositions 
{
	public static void rightRotateKPosition(int[] arr, int k)
	{
		k = k % arr.length;
		
		while(k != 0)
		{
			int temp = arr[arr.length-1];
			for(int i=arr.length-1; i>0; i--)
			{
				arr[i] = arr[i-1];
			}
			arr[0] = temp;
			k--;
		}
		
		System.out.print("Array after right rotating: ");
		for(int x : arr)
		{
			System.out.print(x +" ");
		}
	}
	
	public static void main(String[] args) 
	{
		int[] arr = {1,2,3,4,5};
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter K value: ");
		int K = sc.nextInt();
		rightRotateKPosition(arr, K);
		sc.close();	
	}
}
