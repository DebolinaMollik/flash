import java.util.Scanner;

public class Exp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner rectangle=new Scanner (System.in);
		System.out.println("Enter the length1:");
		System.out.println("Enter the width1:");
		float length1=rectangle.nextFloat();
		float width1=rectangle.nextFloat();
		float arearesult=length1*width1;
		System.out.println(arearesult);
		Scanner perimeter=new Scanner(System.in);
		System.out.println("Enter the length:");
		System.out.println("Enter the width:");
		float length=perimeter.nextFloat();
		float width=perimeter.nextFloat();
		float result=2*(length+width);
		System.out.println(result);


	}

}
