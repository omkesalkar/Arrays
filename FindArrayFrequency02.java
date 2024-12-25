package Arrays_Logical_Questions.Day_03_ArrayBInarySearch;

//Without replacing the duplicate by using another new array.

public class FindArrayFrequency02 
{
	public static void frequencyOfElement(int[] arr)
	{
		boolean[] bool = new boolean[arr.length];
		
		for(int i=0; i<arr.length; i++)
		{
			int count = 1;
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i] == arr[j] && bool[i] != true)
				{
					count++;
					bool[j] = true;
				}
			}
			if(bool[i] != true)
			{
				System.out.println(arr[i]+ " present "+ count +" times");
			}
		}
	}

	public static void main(String[] args) 
	{
		int[] arr = {1,2,3,2,4,3,5,4,6,5};
		frequencyOfElement(arr);
	}

}
