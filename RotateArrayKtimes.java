package Arrays_Logical_Questions.Day_05_MergingArray;
//K time left rotation / anti clockwise rotation.

public class RotateArrayKtimes
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
			arr[arr.length - 1] = temp;
			k--;
			
			System.out.print("After rotating: ");
			for(int x : arr)
			{
				System.out.print(x + " ");
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args)
	{
		int[] arr = {1,2,3,4,5};
		int k = 3;
		rotateKtimes(arr, k);
	}

}
