import java.util.Scanner;
class factorial_process
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=s.nextInt();
		int factorial=1;
		for (int i=2;i<=n;i++)
		{
			factorial*=i;
			System.out.println("Factorial of "+n+" Number is "+factorial);
		}
	}
}