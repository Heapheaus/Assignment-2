import java.util.Scanner;
import java.util.Arrays;
public class Assignment2 {

	public static void main(String[] args) {
		/* Part1
		 */
		System.out.println("The Equation 1/2 is equal to:" + 1/2);
		System.out.println("The Equation 1%2 is equal to:" + 1%2);
		System.out.println("The Equation 1.0/2 is equal to:" + (1.0/2));
		System.out.println("The Equation 5+7/2 is equal to:" + (5+7)/2);
		System.out.println("The Equation \"Beat\" +' ' + \"Army\" is equal to:" + "Beat" +' ' + "Army");
		System.out.println("The Equation 6+13 / 5 - 35 % 3 is equal to:" + (6+13/5-35%3));
		System.out.println("The Equation 3.5 * (5/4) is equal to:" + (3.5*(5/4)));
		System.out.println("The Equation (3.5 * 5)/4 is equal to:" + ((3.5 * 5)/4));
		
		/*Part 2
		 * 
		 * INT variables
		 * INPUT variables
		 * INT variable changes
		 * DISPLAY new int information
		 */
		System.out.println("Enter five integers to be used to calculate Sum, Average, Min, Max,and Median,");
		int[] Numberarray = new int[5];
		Scanner userinput=new Scanner(System.in);

		int min=999999999;
		int max=-999999999;
		int sum=0;
		for(int i=0;i<5;i++){
			Scanner keyboard = new Scanner(System.in);
			Numberarray[i]=keyboard.nextInt();
		    sum=sum+Numberarray[i];
			if (Numberarray[i]>max)
			{
				max=Numberarray[i];
			}
		    if (Numberarray[i]<min)
			{
				min=Numberarray[i];
			}
	
		}
		Arrays.sort(Numberarray);
		System.out.println("The Sum is:" +sum);
		System.out.println("The Average is:" +(sum/5));
		System.out.println("The Min is:" +min);
		System.out.println("The Max is:" +max);
		System.out.println("The Median is:" +Numberarray[2]);
	
	}
}