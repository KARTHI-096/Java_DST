package dynamic_programing;

import java.util.Arrays;

public class Bank_teller {

    public static int minCoins(int[] coins, int rup) {
    	if(rup == 0) return 0;
    	
    	int res = Integer.MAX_VALUE;
    	
    	for(int coin:coins)
    	{
    		if(coin <= rup)
    		{
    			int subres = minCoins(coins, rup-coin);
    			if(subres != Integer.MAX_VALUE)
    			{
    				res = Math.min(res, subres+1);
    			}
    		}
    	}
    	return res;
    }
    
    //With memory utilization ----> below code
   
    public static int mincoin(int[] coins, int rup,int[] dp)
    {
    	if(rup == 0) return 0;
    	if(dp[rup] != -1) return dp[rup];
    	int res = Integer.MAX_VALUE;
    	
    	for(int coin:coins)
    	{
    		if(coin <= rup)
    		{
    			int subres = mincoin(coins, rup-coin,dp);
    			if(subres != Integer.MAX_VALUE)
    			{
    				res = Math.min(res, subres+1);
    			}
    		}
    	}
    	dp[rup] = res;
    	return dp[rup];
    }

    public static void main(String[] args) {
        int[] coins = {9, 6, 5, 1};
        int target = 56;
        int[] dp = new int[target+1]; 
        Arrays.fill(dp, -1);
        int result = minCoins(coins, target);
        //int result1 = mincoin(coins,target,dp);        
         System.out.println("Minimum coins required: " + result);
        //System.out.println("Minimum coins required: " + result1);
        
}
}
