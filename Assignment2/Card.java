
/*************************************************************************************/
// Card.java 
//
// implements a simple French-suited card game. Ranks go from 2 to 14, the highest  
// 4 cards being the Jack, Queen, King and Ace (Ace being the higest card)
// The game contains 4 suits: clovers, diamonds, spades and hearts. 
//
//*************************************************************************************/


public class Card{
	

	private static String[] suits = {'clovers', 'diamonds', 'spades', 'hearts'};
	private static String[] ranks = {'2', '3', '4', '5', '6', '7', '8', '9', '10', 'Jack', 'Queen', 'King', 'Ace' }; 


	public String cardSuit;
	public String cardrank;

	// constructor 

	public Card(string suit, String rank){

		cardSuit = suit;
		cardRank = rank; 

	}

	// Accessor Methods


	public String getRank(){

		return cardRank;

	}

	public String getSuit(){

		return cardSuit;

	}

	public String whichCard(){

		return cardRank + 'of' + suits

	}

	// used to compare the cards 

	public boolean isStrongerThan(Card c){

		/* returns True if the current card is stronger than c */

		int value_c = Integer.parseInt(c.cardRank);  
		int myValue = Integer.parseInt(cardRank);  

		switch (c.carRank){

		case 'Jack':
			value_c = 11;
			break;
		case 'Queen':
			value_c = 12;
			break;
		case 'King':
			value_c = 13;
			break; 
		case 'Ace':
			value_c = 14;
			break;
		}
		switch (this.carRank){
		case 'Jack':
			myValue  = 11;
			break;
		case 'Queen':
			myValue = 12;
			break;
		case 'King':
			myValue = 13;
			break; 
		case 'Ace':
			myValue = 14;
			break;
		}



		return myValue>value_c ;





	}


	public boolean isEqual(Card c){

		int value_c = Integer.parseInt(c.cardRank);  
		int myValue = Integer.parseInt(cardRank);  


		switch (c.carRank){

		case 'Jack':
			value_c = 11;
			break;
		case 'Queen':
			value_c = 12;
			break;
		case 'King':
			value_c = 13;
			break; 
		case 'Ace':
			value_c = 14;
			break;
		}
		switch (this.carRank){
		case 'Jack':
			myValue  = 11;
			break;
		case 'Queen':
			myValue = 12;
			break;
		case 'King':
			myValue = 13;
			break; 
		case 'Ace':
			myValue = 14;
			break;
		}


		return myValue == value_c ;

	}






}