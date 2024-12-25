package Arrays_Logical_Questions.Day_03_ArrayBInarySearch;

/* Counting and replacing the duplicate with a special character/or 
   less than min number /less than max number. */

public class FindArrayFrequency01
{
	public static void replacingFrequency(int[] arr)
	{
		for(int i=0; i<arr.length; i++)
		{
			int count = 1;
			
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i] == arr[j] && arr[i] != '*')
				{
					count++;
					arr[j] = '*';
				}
			}
			if(arr[i] != '*')
			{
				System.out.println(arr[i]+ " present "+ count +" times");
			}
		}
	}
	
	public static void main(String[] args) 
	{
		int[] arr = {3,2,6,4,9,7,8,9,4,2,1,2,5,9};
		replacingFrequency(arr);
	}
}
