package sums;
import java.util.Scanner;
public class Paint_cost {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		float sum1 = 0;
		
		for(int i = 0;i < a;i++)
		{
			float c = sc.nextFloat();
			sum1 += c*18;
			
		}
		for(int i = 0;i < b;i++)
		{
			float c = sc.nextFloat();
			sum1 += c*12; 
		}
		String d = String.format("%.1f" ,sum1);
		System.out.println("Total estimated Cost: "+ d +" INR");
		sc.close();
	}
}
