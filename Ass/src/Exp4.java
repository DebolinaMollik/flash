import java.util.Scanner;

public class Exp4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int x, y, z;
	        Scanner num = new Scanner(System.in);
	        System.out.print("Enter the first number:");
	        x = num.nextInt();
	        System.out.print("Enter the second number:");
	        y = num.nextInt();
	        System.out.print("Enter the third number:");
	        z = num.nextInt();
	        if(x > y && x > z)
	        {
	            System.out.println("Largest number is:"+x);
	        }
	        else if(y > z)
	        {
	            System.out.println("Largest number is:"+y);
	        }
	        else
	        {
	            System.out.println("Largest number is:"+z);
	        }
	        }
	}

