package dataSturcturePack;

public class ArrayOperationClass 
{
	public int[] deleteItem(int[] arr,int key)
	{
		int position=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==key)
			{
				position=i;
				break;
			}
			
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=position;j<arr.length-1;j++)
			{
				arr[j]=arr[j+1];
			}
		}
		
		return arr;
	}
	public static void main(String[] args) 
	{
		int[] arr={1,2,3,4,5,6};
		int key=4;
		int[] result=new ArrayOperationClass().deleteItem(arr, key);
		for(int i=0;i<result.length;i++)
		{
			System.out.println(result[i]);
		}
	}

}
