import java.util.*;
class prime_in_range
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Starting Number");
		int start=s.nextInt();
		System.out.println("Enter thr Ending Number");
		int end=s.nextInt();
		String res="Prime";
		for (int i=start;i<=end;i++)
		{
			if (i==0 || i==1)
			{
				System.out.println("Neither Prime Nor Composite");
			}
			else
			{
				int j=0;
				for (j=2;j<i;j++)
				{
					if (i%j==0)
					{
						res="Not-Prime";
						break;
					}
				}
				System.out.println(res+j);
			}
		}
	}
}