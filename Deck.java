import java.util.Random

public class Deck{
	
	/* Implements a Deck of cards */


	myList<Card> myDeck;
	myDeck = new myList<>();


	public Deck(){

		/************************************************************/
		/* constructor, returns empty deck 
		/************************************************************/
	}

	public void Shuffle(){

		/************************************************************/
		/* complete
		/* should shuffle the deck randomly         
		/************************************************************/

		for (i = 0; i < myDeck.numElem(); i++) {
			
			Card c1 = myDeck.remove(i);
			int newSpot = (int) (Math.random() * myDeck.numElem());

			myDeck.insert(newSpot, c1);


		}
	}


	public void initFullDeck(){

		/************************************************************/
		/* complete 
		/* Should initialize a deck with the 52 cards of a regular  
		/************************************************************/

		for (i = 0; i < 52; i++) {
			
			Card c1 = new Card(Card.suits[i % 4], Card.ranks[i % 13]);

			myDeck.addLast(c1);

		}


	}


	public int numCards(){

		/************************************************************/
		/* complete 
		/* should return the number of cards in the deck
		/************************************************************/
		return myDeck.numElem();

	}


	public boolean isEmpty{

		/************************************************************/
		/* complete 
		/* should return true if the deck is empty
		/************************************************************/

		return myDeck.isEmpty();

	}







}
