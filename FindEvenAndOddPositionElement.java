package Arrays_Logical_Questions.Day_02;

public class FindEvenAndOddPositionElement 
{
	public static void evenOddPositionIndex(int[] a)
	{
		System.out.println("\nElements present in even/odd indexes.");
		for(int i=0; i<a.length; i++)
		{
			if(i % 2 == 0)
			{
				System.out.println(a[i] +" is present at even index "+ i);
			} 
			else if(i % 2 != 0)
			{
				System.out.println(a[i] +" is present at Odd index "+ i );
			}
			else
			{
				System.err.println("No Index found.");
			}
		}
	}
	
	public static void main(String[] args)
	{
		int[] arr = {1, 4, 3, 5, 2, 6, 5};
		
		System.out.print("Created Array is: ");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] +" ");
		}
		
		evenOddPositionIndex(arr);
		
	}
}