package Arrays_Logical_Questions.Day_05_MergingArray;
//Element shift to right

public class ElementShiftToRight 
{
	public static void rightShift(int[] arr)
	{
		int temp = arr[arr.length-1];
		
		for(int i=arr.length-1; i>0; i--)
		{
			arr[i] = arr[i-1];
		}
		arr[0] = temp;
		
		System.out.print("After right shifted: ");
		for(int x : arr)
		{
			System.out.print(x +" ");
		}
	}
	
	public static void main(String[] args) 
	{
		int[] arr = {1, 2, 3, 4, 5};
		rightShift(arr);
	}

}
