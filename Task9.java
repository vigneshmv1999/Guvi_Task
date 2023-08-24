package guvi.task8;
import java.util.Scanner;

public class Task9 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Age: ");
		int age;
		
		age=sc.nextInt();
		
		if(age>=60){
			System.out.println("The Person is Senior Citizen ");
		}
		
		else 
			
		{
			System.out.println("The Person is not a Senior Citizen ");
		}

	}

}
