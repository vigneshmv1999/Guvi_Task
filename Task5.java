package guvi.task8;

import java.util.Scanner;


public class Task5 {
	
	public static void main(String[] args) {
		
		
		int num=1;
		int count=0;
		System.out.println("Enter Any Number: ");
		
	Scanner sc=new Scanner(System.in);
	
	num=sc.nextInt();
		if(num>1)
		{
			for(int i=1;i<=num;i++)
			{
				if(num%i==0) 
					count++;
			}
			if(count==2)
			{
				System.out.println("Prime Number");
			}
			else
			{
				System.out.println("Not a Prime Number");
			}
		}
			
			else
			{
				System.out.println("Not a Prime Number");
			}
		}
		
			
}