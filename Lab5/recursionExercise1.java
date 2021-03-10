

import java.io.*; 
import java.util.Scanner;
import java.lang.Math; 


public class recursionExercise1{
	

	public static double valueSeries (int n){

		/* Solution for exercise 1.1. */


		double lastTerm;

		lastTerm = ((double)n)/(n+1);
		
		if(n-1>0){
		return lastTerm + valueSeries(n-1);
		}
		else{

			return 0;
		}

	}



	public static double log2(double argument) 
    { 
  
        double result = (double)(Math.log(argument) / Math.log(2)); 
  
        return result; 
    } 
  

	// }


	public static int LogarithmIntegerPart(double Log_argument){

		/* solution for exercise 1.4. */

		if((((double)Log_argument)/2)>=1){
			
			return LogarithmIntegerPart(((double)Log_argument)/2) + 1;

		}else{ }

		return 0;

	}


	public static String revert(int my_number){

		/* solution for exercise 1.10 */


		int next_number = (int) Math.floor((float)my_number/10);
		int remainder;

		if (next_number > 0){
			remainder = my_number%(next_number*10);
			}
			else{
			
			remainder = my_number;

			}

		if(next_number>0){

			
			
			return  "" + remainder + revert( next_number) ;


		}else{			

			return remainder + "";

		}





	}





	public static void main(String[] args){



		// Uncomment for Exercise 1.1.


		// int numTerms = 0;
		// Scanner input = new Scanner(System.in);
		// System.out.print("enter a number of terms: ");
		// numTerms = input.nextInt();

		// System .out.println("number of terms is :" + numTerms);

		// System.out.println("Computing sum of i/(i+1)...");


		// double finalValue;

		// finalValue = valueSeries(numTerms);
		// System.out.println("Value of the series is :" + finalValue);



		// Uncomment for Exercise 1.4


		// double my_argument = 0;
		// Scanner input = new Scanner(System.in);
		// System.out.print("enter an argument for log_2: ");
		// my_argument = input.nextInt();

		// System.out.println("value to be approximated is log_2(" + my_argument + ")");

		// System.out.println("Computing integer value of log_2(" + my_argument + ")");


		// int my_integerPart;

		// my_integerPart = LogarithmIntegerPart(my_argument);
		// System.out.println("integer part is :" + my_integerPart);
		// System.out.println("true value of log is :" + log2(my_argument));


		// Exercise 1.10


		int my_number = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("enter a number: ");
		my_number = input.nextInt();

		System.out.println("number to be reflected is :" + my_number);

		int revertedNumber = 0;

		String my_reflectedNumber = revert(my_number);
		System.out.println("reverted number is :" + my_reflectedNumber);




	}





}