import java.util.*;
class  xylem
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter thr Number");
		int n=s.nextInt();
		int first_last=0;
		int last=n%10;
		int sum=0;
		for (int i=n;i>0;i=i/10)
		{
			sum+=i%10;
		}
		while (n>9)
		{
			n=n/10;
		}
		first_last=n+last;
		int k=sum-first_last;
		if (k==first_last)
		{
			System.out.println("Given Number is Xylem");
		}
		else
		{
			System.out.println("Given Number is Not-Xylem");
		}
	}
}