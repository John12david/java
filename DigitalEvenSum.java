//Digitalevensum
import java.util.Scanner;
class DigitalEvenSum
{
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("Enter the Number");
		int given=s.nextInt();
		int store=0;
		int sum=0;
		while(given>0)
		{
			store=given%10;
			if (store%2==0)
			{
				sum=sum+store;
			}
			given=given/10;
		}
            System.out.println("The digital even sum is :"+sum);
	}
}