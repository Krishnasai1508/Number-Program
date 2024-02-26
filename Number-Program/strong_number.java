import java.util.*;
class strong_number
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=s.nextInt();
		int temp=n;
		int factorial=1;
		int sum=0;
		int last=0;
		while (n>0)
		{
			factorial=1;
			last=n%10;
			for (int i=last;i>=2;i--)
			{
				factorial=factorial*i;
			}
			sum=sum+factorial;
			n=n/10;
		}
		if (sum==temp)
		{
			System.out.println("Strong Number");
		}
		else
		{
			System.out.println("Not-Strong Number");
		}
	}
}