Count.java
//Digital Sum
import java.util.Scanner;
class DigitalEvenSum 
{
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter The Number");
		int given=s.nextInt();//1681
		int temp=given;
		int sum=0,store=0;
		while (given>0) 
		{
		    store=given%10;
			if(store%2==0)
			{
				sum=sum+store;
			
			}
			given=given/10;
		}
		System.out.println("The Digital Even Sum of Given Number "+temp+" is : "+sum); 
	}
}