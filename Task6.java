package guvi.task8;
import java.util.Scanner;

public class Task6 {
	
	public static void main(String[] args) {
		
		
		int num=10;
		long fact=1;
		System.out.println("Enter the Number: ");
		
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		
		for(int i=1; i<=num ;i++)
			
		{
			fact=fact*i;
		}
		
		System.err.println("The Sum of factorial is : " + fact);
		
		
		
	}

}
