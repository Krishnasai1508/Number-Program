import java.util.*;
class palindrome
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=s.nextInt();
		int reverse=0;
		int temp=n;
		while (n>0)
		{
			reverse=reverse*10+(n%10);
			n=n/10;
		}
		if (reverse==temp)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not-Palindrome");
		}
	}
}