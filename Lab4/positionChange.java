
import java.util.Arrays; 

public class positionChange<E>{

	private E[] array1;


	public positionChange(int Length){

		array1 = (E[]) new Object[Length]; 


	}


	public void swapElement(int i, int j){

		E value_tmp ;
		value_tmp = array1[i];

		array1[i] = array1[j];
		array1[j] = value_tmp;

	}

	public E[] getArray(){

		return array1;

	}

	public E getValue(int i){

		return array1[i];



	}


	public void updateArray(E elem, int j){

		if(j<array1.length){

			array1[j] = elem; 


		}
		else{

			throw new ArrayIndexOutOfBoundsException("this is my exception for the condition");
			
		}


	}
}