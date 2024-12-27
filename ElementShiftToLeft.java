package Arrays_Logical_Questions.Day_05_MergingArray;
//Shifting element to left side

public class ElementShiftToLeft 
{
	public static void leftShift(int[] arr)
	{
		int temp = arr[0];
		for(int i=0; i<arr.length-1; i++)
		{
			arr[i] = arr[i+1];
		}
		arr[arr.length-1] = temp;
		
		System.out.print("After left shifting: ");
		for(int x : arr)
		{
			System.out.print(x +" ");
		}
	}
	
	public static void main(String[] args) 
	{
		int[] arr = {1,2,3,4,5};
		leftShift(arr);
	}

}
