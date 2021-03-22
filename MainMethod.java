import Card;
import Deck;
import MyList;
import ListInterface;
import java.util.Scanner;
import java.util.List;
import java.util.LinkedList;
import java.util.Collections;
import java.util.Random;

public class MainMethod{

	public static void main(String[] args) {

		static boolean play = true;

		while(play){
			Scanner input = new Scanner(System.in);
			System.out.println("Start game [y]/[n]: ");

		    String gameDecision = input.nextLine(); 

		    if(gameDecision.equals("y")){

		    	LinkedList<Deck> p1 = new LinkedList<Deck>;
		    	LinkedList<Deck> p1 = new LinkedList<Deck>;

		    	if(p1.isEmpty()){
		    		System.out.println("Player 2 wins");
		    	}
		    	if(p2.isEmpty()){
		    		System.out.println("Player 2 wins");
		    	}

		    }
		    else if (gameDecision.equals("n")){
		    	System.out.println("Goodbye!");
		    }
		    else{
		    	System.out.println("Please enter either y of n!");;
		    }
		}

		

	}


}

