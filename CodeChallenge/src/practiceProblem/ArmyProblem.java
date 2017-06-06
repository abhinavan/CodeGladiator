package practiceProblem;

public class ArmyProblem 
{
	public static void main(String[] args) 
	{
		String firstRow="abcd";
		String rowToBeChecked="bcda";
		char[] a=firstRow.toCharArray();
		char[] b=rowToBeChecked.toCharArray();
		int status=1; // 0 for not from circular group and 1 for in same group
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(b[i]!=a[j])
				{
					System.out.println(b[i]+" is not same as "+a[j]);
				}
				else
				{
					System.out.println("same");
					status=1;
					break;
				}
			}
			
		}
	}

}
