// it should be stated now that the board game will be based on a simple card combat system using dice to determine results

public class Dice {
	// CLASS FIELDS
	public static String getTarotCard(int category, int value) {
	        String card = "";
	        if(category == 1) {  // cursed destiny
	            card =  minorArcana("Cups", value);
	       		 }else if(category==2) { // average destiny
	          		  card = minorArcana("Wands", value);
	       			 }else if(category==3) { // villains destiny
	           			 card = minorArcana("Coins", value);
	       					 }else if(category==4) {  // heroes destiny
	           					 card = minorArcana("Swords", value);
	     							   }else {
	        							    card = majorArcana(value);
	       									 }
	      								  return card; 
										}

	private static String minorArcana(String deck, int value) {
		  String cardName = "";
	        if(value <= 2) {
	        	cardName = "Ace";
	        }   else if(value <= 4) {
	        	cardName = "Two";
		        }	else if(value <= 6) {
	        	cardName = "Three";
		        }	else if(value <= 8) {
	        	cardName = "Four";
		        }	else if(value <= 10) {
	        	cardName = "Five";
		        }	else if(value <= 12) {
	        	cardName = "Six";
		        }	else if(value <= 14) {
	        	cardName = "Seven";
		        }	else if(value <= 16) {
	        	cardName = "Eight";
		        }	else if(value <= 18) {
	        	cardName = "Nine";
		        }	else if(value <= 20) {
	        	cardName = "Ten";
		        }	else if(value <= 22) {
	        	cardName = "Page";     //Jack but cooler
		        }	else if(value <= 26) {
	        	cardName = "Knight";   
		        }	else if(value <= 28) {
	        	cardName = "king";
		        }	else {
	        	cardName = "Queebn";
		        }
		        return String.format("=== %s of %s ===%n", cardName, deck);
	 		   }
}
