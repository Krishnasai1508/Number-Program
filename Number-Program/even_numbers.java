import java.util.*;
class even_numbers
{
	public static void main(String[] args) throws Exception
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Starting Value");
		int start=s.nextInt();
		System.out.println("Enter the Ending Value");
		int end=s.nextInt();
		System.out.println("Processing....");
		Thread.sleep(1000);
		while (start<=end)
		{
			if (start%2==0)
			{
				System.out.println(start);
			}
			start++;
		}
		//for (int i=start;i<=end;i++)
		//{
			//if (i%2==0)
			//{
			//	System.out.println(i);
			//}
		//}
	}
}