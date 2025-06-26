package dynamic_programing;

public class jump2 {
	
public static void jp(int[] dp)
{
	int[] s = new int[dp.length]; 
	for(int i = 1;i < dp.length;i++)
	{
		s[i] = dp.length;
	}
	
	s[0] = 0;
	
	if(dp[0] == 0) 
	{
		System.out.println("-1");
		return;
	}
	
	for(int i = 0; i < dp.length;i++)
	{
		if(dp[i]!= dp.length)
		{
		for(int j = 1; i + j < dp.length  && j <= dp[i];j++)
		{
			s[i+j] = Math.min(s[i]+1, s[i+j]);
		}
		}
	}
	
	System.out.println(s[dp.length-1]);
}

public static void main(String[] args)
{
	int[] a = {3,0,1,2,4,5};
	jp(a);
}
}
