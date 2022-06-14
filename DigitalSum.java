import java.util.Scanner;
class DigitalSum
{
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("Enter the number");
		int given=s.nextInt();//1234
		int sum=0,store=0;
		while (given>0)
		{
			store=given%10;//4
			sum=sum+store;//0+4=4
			given=given/10;

		}
		System.out.println("The Digital Sum of the Given number is "+sum);
	}
}