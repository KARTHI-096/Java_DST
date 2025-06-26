package tree_data_structures;
import java.util.Scanner;

public class Recursion1 {
	
	public static int print1(int a)
	{
		if (a > 10)
		{
			return a;
		}
		System.out.print(a + " ");
		return print1(++a);
	}
	
	public static int fibbo(int a)
	{
		if(a <= 1)
		{
			return a;
		}
		
		return fibbo(a-1) + fibbo(a-2);
	}
	
	public static int sum1(int a)
	{
		if(a == 1)
		{
			return a;
		}
		return a+sum1(--a);
	}
	
	public static int fact(int a)
	{
		if(a == 1)
		{
			return a;
		}
		return a*fact(--a);
	}
	
	public static void main(String[] args)
	{
		print1(1);		
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int n = sc.nextInt();
		System.out.println("Sum upto " + n + " : " + sum1(n));
		System.out.println("Factorial of " + n + ": " + fact(n));
		System.out.println("nth Fibbonacci Number: " + fibbo(n));
		
		sc.close();
		
		
		
	}
	
}
