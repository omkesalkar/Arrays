package Arrays_Logical_Questions.Day_05_MergingArray;
// In Bubble sort finding biggest element last
public class BubbleSorting 
{
	public static void bubbleSort(int[] arr)
	{
		for(int i=0; i<arr.length-1; i++)
		{
			for(int j=0; j<arr.length-i-1; j++)
			{
				if(arr[j] > arr[j+1])
				{
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.print("After Bubble Sorting: ");
		for(int x : arr)
		{
			System.out.print(x +" ");
		}
	}
	
	public static void main(String[] args) 
	{
		int[] arr = {8, 6, 1, 2, 3};
		bubbleSort(arr);
    }

}
