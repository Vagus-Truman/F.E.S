/* EECS1720 - Assignment 1

Creators: Kenneth Hu and Dev Chhetri
Student #: 220282380
Date: 2/7/2024

 */

// it should be stated now that the board game will be based on a simple card combat system using dice to determine results
// the game is going to be based on Persona

import java.util.Random;
import java.util.Scanner;

public class Game {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String whoseTurn = "> Player " + Player.playerCount() + "'s turn";
		
		// enemy's HP and status
		if (Player.statusEffected() == false) {
			String enemyStatus = "> Enemy HP: " + Player.enemyHealthCount() + " | " + Player.inflictedStatus();
		} else {
			String enemyStatus = "> Enemy HP: " + Player.enemyHealthCount();
		}
		
		// player's HP and status
		if (Player.statusEffected() == false) {
			String enemyStatus = "> Your HP: " + Player.healthCount() + " | " + Player.inflictedStatus();
		} else {
			String enemyStatus = "> Your HP: " + Player.healthCount();
		}
		
		// player's cards
		int[] cardsForPlayer = {Player.cardCounter()};
		
		for (int i = 0; i < Player.cardCounter(); i++) {
			int backFacingCards = random(13);
			cardsForPlayer[i] = Cards.majorArcana(backFacingCards);
		}
		
		//selecting card
		System.out.println("> Selected Card: ");
		String userInputCard = in.next();
		
		int choiceCard = Integer.parseInt(userInputCard);
		
		for (int i = 0; i < Player.cardCounter(); i++) {
			if (choiceCard == cardsForPlayer[i]) {
				System.out.println(Cards.majorArcanaReadings(cardsForPlayer[i]));
			}
		}
		
		System.out.println("Play Card? Type Y is yes, type N if no and choose another");
		String userInput = in.next();		
		
		if (userInput.toUpperCase().matches("Y")) {
			//rolling arcana effect
			
		} else if (userInput.toUpperCase().matches("N")) {
			
		}
		
		
	}
	
}
