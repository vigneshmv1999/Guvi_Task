package guvi.task8;

public class Task4 {
	
	
	    public static void main(String[] args) {
	        int num1 = 5;
	        int num2 = 10;

	        System.out.println("Before swapping: num1 = " + num1 + ", num2 = " + num2);

	        // Swapping logic using a temporary variable
	        /*int temp = num1;
	        num1 = num2;
	        num2 = temp;*/
	        
	        num1=num1+num2; //15
	        num2=num1-num2; //15-10 5
	        num1=num1-num2; //15-5 10

	        System.out.println("After swapping: num1 = " + num1 + ", num2 = " + num2);
	    }
	}

	
	


