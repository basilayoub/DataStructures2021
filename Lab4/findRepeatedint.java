
import java.util.Scanner;


public class findRepeatedint{



	public static void main(String[] args){


		int array_size = 0;

		Scanner input = new Scanner(System.in);

		System.out.println("Provide number of entries in array");

		array_size = input.nextInt();

		System.out.println("Provide array elements");

		int[] array =  new int[array_size];

		for(int i=0; i<array_size; i++){

			array[i] = input.nextInt();


		}

		// find duplicate entries in the array

		System.out.println("Looking for duplicate entries");


		for(int i=0; i<array_size; i++){

			int varTest = array[i];

			for(int j=i+1; j<array_size; j++){

				if(array[i] == array[j]){

					String s2 = "Duplicated entry found and equal to" + array[i];

					System.out.println(s2);


				}

			}

		}

	}


}