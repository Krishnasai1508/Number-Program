import java.util.*;
class Arm_Strong
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=s.nextInt();
		int count=0,temp=n,last=0,product=1,sum=0;
		while (n>0)
		{
			n=n/10;
			count++;
		}
		n=temp;
		while (n>0)
		{
			last=n%10;
			for (int i=1;i<=count;i++)
			{
				product=product*last;
			}
			sum=sum+product;
			n=n/10;
			product=1;
		}
		if (sum==temp)
		{
			System.out.println("Arm Strong Number");
		}
		else
		{
			System.out.println("Not-Arm Strong Number");
		}
	}
}