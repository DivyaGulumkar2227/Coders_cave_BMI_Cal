package CodersCave;

import java.util.Scanner;

public class Program1
{
   public static void main(String[] args)
   {
	   Scanner nc	= new  Scanner(System.in);
	   System.out.println("Input weight in kilogram:");
	   double weight 	=nc.nextDouble();
	   System.out.println("Input height in meter:");
	   double height 	=nc.nextDouble();
	   double BMI 	=weight/(height*height);
	   System.out.println("The Body Mass Index is "+BMI +"kg/m2");
	   
   }
}
