package ballPractice;

/*
 	It is a game.A player has some N different types of boxes.All boxes may have different number of balls .
 	
 	Player choses two random numbers F and K . K should have been less than number of boxes . The game is that Varun wants 
 	to any K boxes out of N boxes such that total number of balls in these K selected boxes should be multiple of F.
 	
 	At the same time Varun wants that sum of the balls of the selectd boxes should be of minimum possible.
 	
 	Input:-
 	1) An array S={S1, S2, ...,Sn} of size N corresponding to the number of balls in N boxes 
 	2) F- value(of which multiple should be the sum)
 	3) K- value(number of boxes from which balls should be counted )
 	
 	Output:- 
 	 Minimum number if balls 
 
  */
public class BallCount 
{
	public static int sumCount(int[] s, int f, int k,int count)
	{
		
		int sum=0;
		for(int i=count;i<k;i++)
		{
			sum=sum+s[i];
		}
	
		return sum;
	}
	public int ballCount(int n,int f,int k)
	{
		
		int sum=0,remainder=1;
		int count=0;
		int[] s=new int[n];
		for(int i=0;i<n;i++)
		{
			s[i]=i+1;
		}
		for(;remainder!=0;)
		{
			sum=sumCount(s, f, k, count++);
			remainder=sum%f;
			System.out.println(sum);
		}
		return sum;
	}
	public static void main(String[] args) 
	{
		int n=5,f=2,k=3;
		
		System.out.println(new BallCount().ballCount(n, f, k));
		
	}

}
