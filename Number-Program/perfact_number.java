import java.util.Scanner;
class perfact_number
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=s.nextInt();
		int sum=0;
		for (int i=1;i<n;i++)
		{
			if (n%i==0)
			{
				System.out.println("Prefact Number of "+n+" is "+i);
				sum +=i;
			}
		}
		if (sum==n)
		{
			System.out.println(sum+" is a Perfact Nember");
		}
		else
		{
			System.out.println(sum+" is not a Perfact Number");
		}
	}
}