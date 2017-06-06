package sortingPack;

public class InsertionSortClass 
{
	public static void main(String[] args) 
	{
		int[] arr={5,1,6,2,4,3};
		int i,j,key;
		
		System.out.println("Before Sorting");
		for(int k=0;k<arr.length;k++)
		{
			System.out.println(arr[k]);
		}
		// logic for insertion sort
		for(i=1;i<6;i++)
		{
			key=arr[i];
			j=i-1;
			while(j>=0 && key<arr[j])
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
		//----------------------------------
		System.out.println("After sorting");
		for(Integer f:arr)
		{
			System.out.println(f);
		}
		
	}

}
