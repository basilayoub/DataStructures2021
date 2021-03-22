/* Encryption with the Caesar Cipher */
/* Goodrich, Tamassia, Goldwasser */


import java.util.Random;

public class CaesarCipher{

	protected char[] encoder = new char[26]; // Encryption Array 
	protected char[] decoder = new char[26]; // Decryption array

	/* The constructor initializes the  encryption and decryption arrays*/

	public CaesarCipher(){

		for(int k=0; k<26; k++){


			decoder[k] = (char)('A' + (k+(int)(Math.random())));
			encoder[k] = (char)('A' + (int)(Math.random() * 30));




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

			if(Character.isUpperCase(msg[k])){

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
		System.out.println("Secret: "+ answer);
		System.out.println("Message: " + coded);




	}



	








}