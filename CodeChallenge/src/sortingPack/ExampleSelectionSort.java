package sortingPack;

public class ExampleSelectionSort
{
	public static int[] sort(int[] arr)
	{
		
		for(int i=0;i<(arr.length)-1;i++)
		{
			int min_index=i;
			for(int j=i+1;j<(arr.length)-1;j++)
			{
				if(arr[j]<arr[min_index])
				{
					
					int temp=arr[min_index];
					arr[min_index]=arr[i];
					arr[i]=temp;
					min_index=j;
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		return null;
	}
	public static void main(String[] args) 
	{
		int[] arr={64,25,12,22,11};
		sort(arr);
		
	}

}
