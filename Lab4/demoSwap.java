public class demoSwap{
	


	public static void main(String[] args){


		positionChange <String> MyArray;
		MyArray = new positionChange(10);

		MyArray.updateArray("hi", 1);
		MyArray.updateArray("goodbye", 3);

		MyArray.swapElement(1, 3);

		String value1 = MyArray.getValue(1);
		String value3 = MyArray.getValue(3);

		System.out.println(value1);

		System.out.println(value3);
		

		


	}

}
