/* EECS1720 - Assignment 1

Creators: Kenneth Hu and Dev Chhetri
Student #: 220282380
Date: 3/1/2024

 */

// it should be stated now that the board game will be based on a simple card combat system using dice to determine results
// the game is going to be based on Persona

import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Game {

	public static int currentPlayer = 0;
	public static boolean p1TurnOver = Player1.turnIsOver;
	public static boolean p2TurnOver = Player2.turnIsOver;
	public static boolean validCardSelected = false;
	public static boolean stunLocked = false;

	public static void playerSwitch() {
		if (p1TurnOver == true && currentPlayer == 1) {
			currentPlayer = 2;
		} else if (p2TurnOver == true && currentPlayer == 2) {
			currentPlayer = 1;
		}
	}

	public static void main(String[] args) {

		/*
		 * Format Intented > Player [Insert 1 or 2]'s Turn
		 * 
		 * > Enemy HP: [insert HP count] [If status is inflicted, say so] > Your HP:
		 * [insert HP count] [If status is inflicted, say so] > Your Cards: Example.
		 * [I][II][III][IV][VII][X][XIII][XI] (basically, their Roman numerals instead
		 * of their Arabic numbers like 1, 2, 3, 4, 5)
		 * 
		 * > Selected Card:[awaiting valid input in format of either roman numeral or
		 * Arabic number] > Card Info: [Lore Dump] > Play Card? Type Y is yes, type N if
		 * no and choose another. > Minor Arcana Roll: [Suit]
		 * 
		 * > Effect Has Taken Place > Next Turn
		 */

		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		PrintStream output = System.out;
		Random shufflingDeck = new Random();
		currentPlayer = 1;

		String enemyStatus = "";
		String playerStatus = "";

		// player 1's turn
		if (currentPlayer == 1 && !stunLocked) {
			output.println("> Player " + currentPlayer + "'s turn");

			// Player2 HP and status
			if (Player2.statusEffected == true) {
				enemyStatus = "> Enemy HP: " + Player2.healthCount + " | " + Player2.inflictedStatus;
			} else {
				enemyStatus = "> Enemy HP: " + Player2.healthCount;
			}
			output.println(enemyStatus);

			// Player1 HP and status
			if (Player1.statusEffected == true) {
				playerStatus = "> Your HP: " + Player1.healthCount + " | " + Player1.inflictedStatus;
			} else {
				playerStatus = "> Your HP: " + Player1.healthCount;
			}
			output.println(playerStatus);

			// player's cards
			List<String> cardsForPlayerWord = new ArrayList<String>(Player1.cardCount);
			List<Integer> cardsForPlayerNumber = new ArrayList<Integer>(Player1.cardCount);
			for (int i = 0; i < Player1.cardCount; i++) {
				int backFacingCards = shufflingDeck.nextInt(13);
				cardsForPlayerWord.add(Cards.majorArcanaReadings(backFacingCards));
				cardsForPlayerNumber.add(backFacingCards);
				output.println(">> Major Arcana Number: " + cardsForPlayerNumber.get(i));
				new Cardbacks(backFacingCards);
			}

			// output.println("Card Word List: " + cardsForPlayerWord);
			output.println("Card Number List: " + cardsForPlayerNumber);
			int choiceCard = 0;
			int indexOfSelectedCard = 0;

			// selecting card
			while (!p1TurnOver) {
				while (!validCardSelected) {
					if (!validCardSelected) {
						output.println("> Select a valid card");
					}
					choiceCard = in.nextInt();

					for (int i = 0; i < Player1.cardCount; i++) {
						if (choiceCard == cardsForPlayerNumber.get(i)) {
							indexOfSelectedCard = cardsForPlayerNumber.get(i);
							String resultingLoreDrop = cardsForPlayerWord.get(i);
							output.println(resultingLoreDrop);
							validCardSelected = true;
						}
					}

				}

				// rolling arcana effect
				int minorSuit = Dice.rollDiceSuit();

				// output.println("Minor number " + minorSuit);

				switch (minorSuit) {

				case 1:
					output.println("Major Number: " + choiceCard + " | " + "Minor Suit: Cups");
					break;
				case 2:
					output.println("Major Number: " + choiceCard + " | " + "Minor Suit: Swords");
					break;
				case 3:
					output.println("Major Number: " + choiceCard + " | " + "Minor Suit: Coins");
					break;
				case 4:
					output.println("Major Number: " + choiceCard + " | " + "Minor Suit: Wands");
					break;

				}

				int indexofCombo = Player1.cardMatchAndIndex(choiceCard, minorSuit);
				Player1.indexAndAffect(indexofCombo);

				p1TurnOver = true;
				output.println();
				playerSwitch();

			}
		}

		// affect player 1 turn
		if (currentPlayer == 1 && stunLocked) {
			output.println("> Player " + currentPlayer + "'s turn");

			// Player2 HP and status
			if (Player2.statusEffected == true) {
				enemyStatus = "> Enemy HP: " + Player2.healthCount + " | " + Player2.inflictedStatus;
			} else {
				enemyStatus = "> Enemy HP: " + Player2.healthCount;
			}
			output.println(enemyStatus);

			// Player1 HP and status
			if (Player1.statusEffected == true) {
				playerStatus = "> Your HP: " + Player1.healthCount + " | " + Player1.inflictedStatus;
			} else {
				playerStatus = "> Your HP: " + Player1.healthCount;
			}
			output.println(playerStatus);

			output.println("Shock/Stunned is active. Turn is skipped");
			p1TurnOver = true;
			playerSwitch();
		}

		// player 2's turn
		if (currentPlayer == 1 && !stunLocked) {
			output.println("> Player " + currentPlayer + "'s turn");

			// Player1 HP and status
			if (Player1.statusEffected == true) {
				enemyStatus = "> Enemy HP: " + Player1.healthCount + " | " + Player1.inflictedStatus;
			} else {
				enemyStatus = "> Enemy HP: " + Player1.healthCount;
			}
			output.println(enemyStatus);

			// Player2 HP and status
			if (Player2.statusEffected == true) {
				playerStatus = "> Your HP: " + Player2.healthCount + " | " + Player2.inflictedStatus;
			} else {
				playerStatus = "> Your HP: " + Player2.healthCount;
			}
			output.println(playerStatus);

			// player's cards
			List<String> cardsForPlayerWord = new ArrayList<String>(Player2.cardCount);
			List<Integer> cardsForPlayerNumber = new ArrayList<Integer>(Player2.cardCount);
			for (int i = 0; i < Player1.cardCount; i++) {
				int backFacingCards = shufflingDeck.nextInt(13);
				cardsForPlayerWord.add(Cards.majorArcanaReadings(backFacingCards));
				cardsForPlayerNumber.add(backFacingCards);
				output.println(">> Major Arcana Number: " + cardsForPlayerNumber.get(i));
				new Cardbacks(backFacingCards);
			}

			// output.println("Card Word List: " + cardsForPlayerWord);
			output.println("Card Number List: " + cardsForPlayerNumber);
			int choiceCard = 0;
			int indexOfSelectedCard = 0;

			// selecting card
			while (!p1TurnOver) {
				while (!validCardSelected) {
					if (!validCardSelected) {
						output.println("> Select a valid card");
					}
					choiceCard = in.nextInt();

					for (int i = 0; i < Player2.cardCount; i++) {
						if (choiceCard == cardsForPlayerNumber.get(i)) {
							indexOfSelectedCard = cardsForPlayerNumber.get(i);
							String resultingLoreDrop = cardsForPlayerWord.get(i);
							output.println(resultingLoreDrop);
							validCardSelected = true;
						}
					}

				}

				// rolling arcana effect
				int minorSuit = Dice.rollDiceSuit();

				// output.println("Minor number " + minorSuit);

				switch (minorSuit) {
				case 1:
					output.println("Major Number: " + choiceCard + " | " + "Minor Suit: Cups");
					break;
				case 2:
					output.println("Major Number: " + choiceCard + " | " + "Minor Suit: Swords");
					break;
				case 3:
					output.println("Major Number: " + choiceCard + " | " + "Minor Suit: Coins");
					break;
				case 4:
					output.println("Major Number: " + choiceCard + " | " + "Minor Suit: Wands");
					break;
				}

				int indexofCombo = Player2.cardMatchAndIndex(choiceCard, minorSuit);
				Player2.indexAndAffect(indexofCombo);

				p2TurnOver = true;
				output.println();
				playerSwitch();

			}
		}

		// affect player 2 turn
		if (currentPlayer == 2 && stunLocked) {
			output.println("> Player " + currentPlayer + "'s turn");

			// Player1 HP and status
			if (Player1.statusEffected == true) {
				enemyStatus = "> Enemy HP: " + Player1.healthCount + " | " + Player1.inflictedStatus;
			} else {
				enemyStatus = "> Enemy HP: " + Player1.healthCount;
			}
			output.println(enemyStatus);

			// Player2 HP and status
			if (Player2.statusEffected == true) {
				playerStatus = "> Your HP: " + Player2.healthCount + " | " + Player2.inflictedStatus;
			} else {
				playerStatus = "> Your HP: " + Player2.healthCount;
			}
			output.println(playerStatus);

			output.println("Shock/Stunned is active. Turn is skipped");
			p2TurnOver = true;
			playerSwitch();
		}

		// endgame scenario
		if (Player1.healthCount == 0) {
			output.println("Player 1 is defeated. Player 2 wins!");
			System.exit(0);

		}
		if (Player2.healthCount == 0) {
			output.println("Player 2 is defeated. Player 1 wins!");
			System.exit(0);

		}
	}
}
