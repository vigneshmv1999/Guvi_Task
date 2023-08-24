package guvi.task8;

import java.util.Scanner;

public class Task10 {
	
	public static void main(String[] args) {
		
		int num;
		int count=0;
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		
		num=sc.nextInt();
		
		while(num!=0)
		{
			num=num/10; 
			count++;
			System.out.println("Num: "+ num);
			System.out.println("Count: "+count);
			
		}
		
		System.out.println("Number of Digits: "+ count );
		
		
	}

}
