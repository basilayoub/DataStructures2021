/* Encryption with the Caesar Cipher */
/* Goodrich, Tamassia, Goldwasser */


import java.util.Random;
import java.util.ArrayList;


public class CaesarCipher{

	protected char[] encoder = new char[26]; // Encryption Array 
	protected char[] decoder = new char[26]; // Decryption array

	/* The constructor initializes the  encryption and decryption arrays*/

	public CaesarCipher(){

		

		int randNum =(int)(Math.random() * 5);

		System.out.println(randNum);


		for(int k=0; k < 26; k++){

			

			encoder[k] = (char)('A' + (k + randNum));
			decoder[k] = (char)('A' + ((k - randNum + 26 ) % 26));

			





			if (encoder[k] == '['){
				encoder[k] = '#';
			}
			else if (encoder[k] == '^'){
				encoder[k] = '$';
			}
			else if (encoder[k] == '\\'){
				encoder[k] = '&';
			}
			else if (encoder[k] == ']'){
				encoder[k] = '=';
			}

			if (decoder[k] == '['){
				decoder[k] = '#';
			}
			else if (decoder[k] == '^'){
				decoder[k] = '$';
			}
			else if (decoder[k] == '\\'){
				decoder[k] = '&';
			}
			else if (decoder[k] == ']'){
				decoder[k] = '=';
			}

		}
	}

	public String encrypt(String message){

		/*return String representing the encrypted message */
		return transform(message, encoder);

	}


	public String decrypt(String secret){

		return transform(secret, decoder); 

	}

	private String transform(String original, char[] code){

		char[] msg = original.toCharArray();
		for(int k=0; k< msg.length; k++){

			if((Character.isUpperCase(msg[k]))){
				

				int j = msg[k] - 'A';
				msg[k] = code[j];

			}
			
			
			

		}

		return new String(msg);



	}

		

	public static void main(String[] args){
		/*main method for testing the Caesar Cipher*/


		CaesarCipher cipher = new CaesarCipher();
		System.out.println("Encryption code = "+ new String(cipher.encoder));
		System.out.println("Decryption code = "+ new String(cipher.decoder));
		String message = "THE EAGLE IS IN PLAY; MEET AT JOE'S";
		String coded = cipher.encrypt(message);
		String answer = cipher.decrypt(coded);
		System.out.println("Secret: "+ coded);
		System.out.println("Message: " + answer);




	}



	








}
