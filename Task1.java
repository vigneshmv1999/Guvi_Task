package guvi.task8;
import java.util.Scanner;

public class Task1 {
	

	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the value of a: ");
	        int a = scanner.nextInt();
	        
	        System.out.print("Enter the value of b: ");
	        int b = scanner.nextInt();
	        
	        System.out.print("Enter the value of c: ");
	        int c = scanner.nextInt();
	        
	        System.out.print("Enter the value of d: ");
	        int d = scanner.nextInt();
	        
	        scanner.close();

	        int sumAB = a + b;
	        System.out.println(a+b);
	        
	        int sumCD = c + d;
	        System.out.println(c+d);

	        if (sumAB > sumCD) {
	            System.out.println("The sum of a and b is greater than the sum of c and d.");
	        }
	        else {
	        	 System.out.print("The sum of c and d is greater than the sum of a and b. ");
	        }
	    }
	}



