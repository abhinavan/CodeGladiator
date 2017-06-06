package practiceProblem;

public class CityAttackProblem 
{
	public int add()
	{
		try
		{
			int a=10/0;
			return 1;
			
		}
		catch(Exception e)
		{
			return 2;
		}
		finally 
		{
			return 3;	
		}

	}
	public static void main(String[] args) 
	{
				System.out.println(new CityAttackProblem().add());
	}

}
