package dynamic_programing;

public class dynamic {
	
	public static int feb(int[] dp,int n)
	{
		if(n <= 1) return n;
		
		if(dp[n]!= -1) return dp[n];
		
		dp[n] = feb(dp,n-1) + feb(dp,n-2);
		
		return dp[n];
	}
	
	public static void main(String[] args)
	{
		int n = 5;
		int[] dp = new int[n+1];
		for(int i = 0;i < n+1;i++)
		{
			dp[i] = -1;
		}
	//dp[0] = 0;
	//dp[1] = 1;
	System.out.println(feb(dp,n));
	for(int i = 0;i < n+1;i++)
	{
		System.out.println(dp[i]);
	}
	}
		
}
