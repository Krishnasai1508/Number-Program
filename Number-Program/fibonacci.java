import java.util.*;
class fibonacci
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=s.nextInt();
		int first=0;
		int second=1;
		int third;
		System.out.println(first);
		System.out.println(second);
		for (int i=3;i<=n;i++)
		{
			third=first+second;
			System.out.println(third);
			first=second;
			second=third;
		}
	}
}