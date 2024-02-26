import java.util.*;
class digit2
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=s.nextInt();
		int sum=0;
		for (int i=n;i>0;i=i/10)
		{
			sum+=i%10;
		}
		System.out.println("Sum of Digit is "+sum);
	}
}