import java.util.Scanner;

public class Calculator
{
	//Addition
	public static double add(double a,double b) {
	return a+b;
}
	//Subtraction
		public static double subtract(double a,double b) {
		return a-b;
		}
	//Addition
		public static double multiply(double a,double b) {
		return a*b;
		}
		//Addition
		public static double divide(double a,double b) {
		if(b==0)
		{
		  System.out.println("Error: Cannot divide by zero.");
		  return 0;
		}
		return a/b;
		
		}
		public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			
			System.out.println("welcome to java console calculator");
			
			while(true)
			{
				System.out.println("\nchoose an operation:");
				System.out.println("1. Add");
				System.out.println("1. Subtract");
				System.out.println("1. Multiuply");
				System.out.println("1. Divide");
				System.out.println("5. Exit");
				
				System.out.println("Enter your choice(1-5): ");
				int choice = sc.nextInt();
				
				if(choice == 5)
				{
					System.out.println("Existing calculator");
					break;
				}
				
				System.out.println("Enter first number");
				double num1 = sc.nextDouble();
				System.out.println("Enter second number");
				double num2 = sc.nextDouble();
				
				double result = 0;
				
				switch(choice)
				{
				case 1:
					result = add(num1, num2);
					System.out.println("Result: " +result);
				    break;
				case 2:
					result = subtract(num1, num2);
					System.out.println("Result: " +result);
				    break;
				case 3:
					result = multiply(num1, num2);
					System.out.println("Result: " +result);
				    break;
				case 4:
					result = divide(num1, num2);
					System.out.println("Result: " +result);
				    break;
				 default:
				    	System.out.println("Invalid choice");
					
				}	
			}
			sc.close();
		}
}