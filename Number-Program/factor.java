import java.util.Scanner;
class factor
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=s.nextInt();
		for (int i=1;i<=n;i++)
		{
			if (n%i==0)
			{
				System.out.println("Factors of Number "+n+"is"+i);
			}
		}
	}
}