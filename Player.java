
// it should be stated now that the board game will be based on a simple card combat system using dice to determine results
import java.util.*;

public class Player {

	// CLASS FIELDS
	private static final int baseHealth = 100;
	private static final int handLimit = 8;
	private static final int startingCOunt = 5;
	public int healthCount = baseHealth;
	public int cardCount = startingCOunt;

	private static final int MAJORMIN = 0;
	private static final int MAJORMAX = 13;
	private static final int MINORMIN = 1;
	private static final int MINORMAX = 4;
	private static final int MINORNUMMIN = 1;
	private static final int MINORNUMMAX = 13;

	public static int playerCount() {
		
		int currentPlayer = 0;	
		//if game start, start with player 1. if turn is done, switch players, and again and again
		
		return currentPlayer;
	}
	public static List<String> cardInfoAndEffect() {
		List<Integer> cardDataRef = new ArrayList<Integer>(3);
		List<String> cardDataCollection = new ArrayList<String>();

		
		for (int major = MAJORMIN; major <= MAJORMAX; major++) { // major arcana selection
			cardDataRef.add(0, major);
			for (int minor = MINORMIN; minor <= MINORMAX; minor++) { // minor arcana selection
				cardDataRef.add(1, minor);
				for (int minorNum = MINORNUMMIN; minorNum <= MINORNUMMAX; minorNum++) { // minor arcana number selection
					cardDataRef.add(2, minorNum);
					
					StringBuilder drawnCard = new StringBuilder(); // creates a string out of the given numbers
					for (int i = cardDataRef.size() - 1; i >= 0; i--) {
					  int num = cardDataRef.get(i); 
					  drawnCard.append(num);
					}
					
					// assuming all goes well, the format of the card should be {mjArcn, mrArcn, mrArcnNum}
					String dataString = drawnCard.toString(); 
					cardDataCollection.add(dataString);
	
				}
			}
		}
			
		return cardDataCollection;
	}

	public static int cardMatchAndIndex(int majorArcana, int minorArcana, int minorArcanaNumber, List<String> code) {
		List<Integer> cardData = new ArrayList<Integer>(3);
		cardData.add(majorArcana);
		cardData.add(minorArcana);
		cardData.add(minorArcanaNumber);

		StringBuilder selectedCard = new StringBuilder();
		
		for (int i = cardData.size() - 1; i >= 0; i--) {
		  int num = cardData.get(i);
		  selectedCard.append(num);
		}
		
		String dataCard = selectedCard.toString();
		
		int indexOfMatchingCondition = code.indexOf(dataCard);
		return indexOfMatchingCondition;
	}

	public static void indexAndAffect(int indexOfCombos) {

		switch (indexOfCombos) {

	// Fool
		case 0, 1, 2, 3, 4, 5: // cups 1, 2, 3, 4, 5, 6
			user.healthCount = (int) Math.round(currentHp * 1.5);
		case 6: // cups 7
			//nothing happens
		case 7, 8, 9, 10, 11, 12: // cups 8, 9, 10, 11, 12, 13
			user.healthCount += 50;

		case 13, 14, 15, 16, 17, 18: // swords 1, 2, 3, 4, 5, 6
			SwordEffects.applyEffect(diceValue, opponent);
		case 19: // swords 7
			// nothing
		case 20, 21, 22, 23, 24, 25: // swords 8, 9, 10, 11, 12, 13
			SwordEffects.applyEffect(diceValue, opponent);

		case 26, 27, 28, 29, 30, 31: // coins 1, 2, 3, 4, 5, 6
		drawCard(player, deck);
		case 32: // coins 7
			//nothing
		case 33, 34, 35, 36, 37, 38: // coins 8, 9, 10, 11, 12, 13
		drawCard(player, deck);

		case 39, 40, 41, 42, 43, 44: // wand 1, 2, 3, 4, 5, 6
		int damage = (int) (enemy.healthCount * 0.5); // 50% of enemy's current health
		enemy.healthCount -= damage;
		case 45: // wand 7
			// nothing
		case 46, 47, 48, 49, 50, 51: // wand 8, 9, 10, 11, 12, 13
		enemy.healthCount -= 50; // 50 points of damage
		// Magician
		case 52: // cups 1
			// insert code here
		case 53: // cups 2
			// insert code here
		case 54: // cups 3
			// insert code here
		case 55: // cups 4
			// insert code here
		case 56: // cups 5
			// insert code here
		case 57: // cups 6
			// insert code here
		case 58: // cups 7
			// insert code here
		case 59: // cups 8
			// insert code here
		case 60: // cups 9
			// insert code here
		case 61: // cups 10
			// insert code here
		case 62: // cups 11
			// insert code here
		case 63: // cups 12
			// insert code here
		case 64: // cups 13
			// insert code here

		case 65: // swords 1
			// insert code here
		case 66: // swords 2
			// insert code here
		case 67: // swords 3
			// insert code here
		case 68: // swords 4
			// insert code here
		case 69: // swords 5
			// insert code here
		case 70: // swords 6
			// insert code here
		case 71: // swords 7
			// insert code here
		case 72: // swords 8
			// insert code here
		case 73: // swords 9
			// insert code here
		case 74: // swords 10
			// insert code here
		case 75: // swords 11
			// insert code here
		case 76: // swords 12
			// insert code here
		case 77: // swords 13
			// insert code here

		case 78: // coins 1
			// insert code here
		case 79: // coins 2
			// insert code here
		case 80: // coins 3
			// insert code here
		case 81: // coins 4
			// insert code here
		case 82: // coins 5
			// insert code here
		case 83: // coins 6
			// insert code here
		case 84: // coins 7
			// insert code here
		case 85: // coins 8
			// insert code here
		case 86: // coins 9
			// insert code here
		case 87: // coins 10
			// insert code here
		case 88: // coins 11
			// insert code here
		case 89: // coins 12
			// insert code here
		case 90: // coins 13
			// insert code here

		case 91: // wand 1
			// insert code here
		case 92: // wand 2
			// insert code here
		case 93: // wand 3
			// insert code here
		case 94: // wand 4
			// insert code here
		case 95: // wand 5
			// insert code here
		case 96: // wand 6
			// insert code here
		case 97: // wand 7
			// insert code here
		case 98: // wand 8
			// insert code here
		case 99: // wand 9
			// insert code here
		case 100: // wand 10
			// insert code here
		case 101: // wand 11
			// insert code here
		case 102: // wand 12
			// insert code here
		case 103: // wand 13
			// insert code here
			
			
		// High Priestess
		case 104: // cups 1
			// insert code here
		case 105: // cups 2
			// insert code here
		case 106: // cups 3
			// insert code here
		case 107: // cups 4
			// insert code here
		case 108: // cups 5
			// insert code here
		case 109: // cups 6
			// insert code here
		case 110: // cups 7
			// insert code here
		case 111: // cups 8
			// insert code here
		case 112: // cups 9
			// insert code here
		case 113: // cups 10
			// insert code here
		case 114: // cups 11
			// insert code here
		case 115: // cups 12
			// insert code here
		case 116: // cups 13
			// insert code here

		case 117: // swords 1
			// insert code here
		case 118: // swords 2
			// insert code here
		case 119: // swords 3
			// insert code here
		case 120: // swords 4
			// insert code here
		case 121: // swords 5
			// insert code here
		case 122: // swords 6
			// insert code here
		case 123: // swords 7
			// insert code here
		case 124: // swords 8
			// insert code here
		case 125: // swords 9
			// insert code here
		case 126: // swords 10
			// insert code here
		case 127: // swords 11
			// insert code here
		case 128: // swords 12
			// insert code here
		case 129: // swords 13
			// insert code here

		case 130: // coins 1
			// insert code here
		case 131: // coins 2
			// insert code here
		case 132: // coins 3
			// insert code here
		case 133: // coins 4
			// insert code here
		case 134: // coins 5
			// insert code here
		case 135: // coins 6
			// insert code here
		case 136: // coins 7
			// insert code here
		case 137: // coins 8
			// insert code here
		case 138: // coins 9
			// insert code here
		case 139: // coins 10
			// insert code here
		case 140: // coins 11
			// insert code here
		case 141: // coins 12
			// insert code here
		case 142: // coins 13
			// insert code here

		case 143: // wand 1
			// insert code here
		case 144: // wand 2
			// insert code here
		case 145: // wand 3
			// insert code here
		case 146: // wand 4
			// insert code here
		case 147: // wand 5
			// insert code here
		case 148: // wand 6
			// insert code here
		case 149: // wand 7
			// insert code here
		case 150: // wand 8
			// insert code here
		case 151: // wand 9
			// insert code here
		case 152: // wand 10
			// insert code here
		case 153: // wand 11
			// insert code here
		case 154: // wand 12
			// insert code here
		case 155: // wand 13
			// insert code here

		// empress
		case 156: // cups 1
			// insert code here
		case 157: // cups 2
			// insert code here
		case 158: // cups 3
			// insert code here
		case 159: // cups 4
			// insert code here
		case 160: // cups 5
			// insert code here
		case 161: // cups 6
			// insert code here
		case 162: // cups 7
			// insert code here
		case 163: // cups 8
			// insert code here
		case 164: // cups 9
			// insert code here
		case 165: // cups 10
			// insert code here
		case 166: // cups 11
			// insert code here
		case 167: // cups 12
			// insert code here
		case 168: // cups 13
			// insert code here

		case 169: // swords 1
			// insert code here
		case 170: // swords 2
			// insert code here
		case 171: // swords 3
			// insert code here
		case 172: // swords 4
			// insert code here
		case 173: // swords 5
			// insert code here
		case 174: // swords 6
			// insert code here
		case 175: // swords 7
			// insert code here
		case 176: // swords 8
			// insert code here
		case 177: // swords 9
			// insert code here
		case 178: // swords 10
			// insert code here
		case 179: // swords 11
			// insert code here
		case 180: // swords 12
			// insert code here
		case 181: // swords 13
			// insert code here

		case 182: // coins 1
			// insert code here
		case 183: // coins 2
			// insert code here
		case 184: // coins 3
			// insert code here
		case 185: // coins 4
			// insert code here
		case 186: // coins 5
			// insert code here
		case 187: // coins 6
			// insert code here
		case 188: // coins 7
			// insert code here
		case 189: // coins 8
			// insert code here
		case 190: // coins 9
			// insert code here
		case 191: // coins 10
			// insert code here
		case 192: // coins 11
			// insert code here
		case 193: // coins 12
			// insert code here
		case 194: // coins 13
			// insert code here

		case 195, 197, 199, 201, 203, 205, 207: // wand 1, 3, 5, 7, 9, 11, 13
			// insert code here
		case 196, 198, 200, 202, 204, 206: // wand 2, 4, 6, 8, 10, 12
			// insert code here
			
		// Emperor
		case 208: // cups 1
			// insert code here
		case 209: // cups 2
			// insert code here
		case 210: // cups 3
			// insert code here
		case 211: // cups 4
			// insert code here
		case 212: // cups 5
			// insert code here
		case 213: // cups 6
			// insert code here
		case 214: // cups 7
			// insert code here
		case 215: // cups 8
			// insert code here
		case 216: // cups 9
			// insert code here
		case 217: // cups 10
			// insert code here
		case 218: // cups 11
			// insert code here
		case 219: // cups 12
			// insert code here
		case 220: // cups 13
			// insert code here

		case 221: // swords 1
			// insert code here
		case 222: // swords 2
			// insert code here
		case 223: // swords 3
			// insert code here
		case 224: // swords 4
			// insert code here
		case 225: // swords 5
			// insert code here
		case 226: // swords 6
			// insert code here
		case 227: // swords 7
			// insert code here
		case 228: // swords 8
			// insert code here
		case 229: // swords 9
			// insert code here
		case 230: // swords 10
			// insert code here
		case 231: // swords 11
			// insert code here
		case 232: // swords 12
			// insert code here
		case 233: // swords 13
			// insert code here

		case 234: // coins 1
			// insert code here
		case 235: // coins 2
			// insert code here
		case 236: // coins 3
			// insert code here
		case 237: // coins 4
			// insert code here
		case 238: // coins 5
			// insert code here
		case 239: // coins 6
			// insert code here
		case 240: // coins 7
			// insert code here
		case 241: // coins 8
			// insert code here
		case 242: // coins 9
			// insert code here
		case 243: // coins 10
			// insert code here
		case 244: // coins 11
			// insert code here
		case 245: // coins 12
			// insert code here
		case 246: // coins 13
			// insert code here

		case 247, 249, 251, 253, 255, 257, 259: // wand 1, 3, 5, 7, 9, 11, 13
			// insert code here
		case 248, 250, 252, 254, 256, 258: // wand 2, 4, 6, 8, 10, 12
			// insert code here

		// Heirophant
		case 260, 262, 264, 266, 268, 270, 272: // cups 1, 3, 5, 7, 9, 11, 13
			// insert code here
		case 261, 263, 265, 267, 269, 271: // cups 2, 4, 6, 8, 10, 12
			// insert code here

		case 273, 275, 277, 279, 281, 283, 285: // swords 1, 3, 5, 7, 9, 11, 13
			// insert code here
		case 274, 276, 278, 280, 282, 284: // swords 2, 4, 6, 8, 10, 12
			// insert code here

		case 286, 288, 290, 292, 294, 296, 298: // coins 1, 3, 5, 7, 9, 11, 13
			// insert code here
		case 287, 289, 291, 293, 295, 297: // coins 2, 4, 6, 8, 10, 12
			// insert code here

		case 299, 301, 303, 305, 307, 309, 311: // wand 1, 3, 5, 7, 9, 11, 13
			// insert code here
		case 300, 302, 304, 306, 308, 310: // wand 2, 4, 6, 8, 10, 12
			// insert code here
			
		// Lovers
		case 312: // cups 1
			// insert code here
		case 313: // cups 2
			// insert code here
		case 314: // cups 3
			// insert code here
		case 315: // cups 4
			// insert code here
		case 316: // cups 5
			// insert code here
		case 317: // cups 6
			// insert code here
		case 318: // cups 7
			// insert code here
		case 319: // cups 8
			// insert code here
		case 320: // cups 9
			// insert code here
		case 321: // cups 10
			// insert code here
		case 322: // cups 11
			// insert code here
		case 323: // cups 12
			// insert code here
		case 324: // cups 13
			// insert code here

		case 325: // swords 1
			// insert code here
		case 326: // swords 2
			// insert code here
		case 327: // swords 3
			// insert code here
		case 328: // swords 4
			// insert code here
		case 329: // swords 5
			// insert code here
		case 330: // swords 6
			// insert code here
		case 331: // swords 7
			// insert code here
		case 332: // swords 8
			// insert code here
		case 333: // swords 9
			// insert code here
		case 334: // swords 10
			// insert code here
		case 335: // swords 11
			// insert code here
		case 336: // swords 12
			// insert code here
		case 337: // swords 13
			// insert code here

		case 338: // coins 1
			// insert code here
		case 339: // coins 2
			// insert code here
		case 340: // coins 3
			// insert code here
		case 341: // coins 4
			// insert code here
		case 342: // coins 5
			// insert code here
		case 343: // coins 6
			// insert code here
		case 344: // coins 7
			// insert code here
		case 345: // coins 8
			// insert code here
		case 346: // coins 9
			// insert code here
		case 347: // coins 10
			// insert code here
		case 348: // coins 11
			// insert code here
		case 349: // coins 12
			// insert code here
		case 350: // coins 13
			// insert code here

		case 351: // wand 1
			// insert code here
		case 352: // wand 2
			// insert code here
		case 353: // wand 3
			// insert code here
		case 354: // wand 4
			// insert code here
		case 355: // wand 5
			// insert code here
		case 356: // wand 6
			// insert code here
		case 357: // wand 7
			// insert code here
		case 358: // wand 8
			// insert code here
		case 359: // wand 9
			// insert code here
		case 360: // wand 10
			// insert code here
		case 361: // wand 11
			// insert code here
		case 362: // wand 12
			// insert code here
		case 363: // wand 13
			// insert code here

		// Chariot
		case 364: // cups 1
			// insert code here
		case 365: // cups 2
			// insert code here
		case 366: // cups 3
			// insert code here
		case 367: // cups 4
			// insert code here
		case 368: // cups 5
			// insert code here
		case 369: // cups 6
			// insert code here
		case 370: // cups 7
			// insert code here
		case 371: // cups 8
			// insert code here
		case 372: // cups 9
			// insert code here
		case 373: // cups 10
			// insert code here
		case 374: // cups 11
			// insert code here
		case 375: // cups 12
			// insert code here
		case 376: // cups 13
			// insert code here

		case 377: // swords 1
			// insert code here
		case 378: // swords 2
			// insert code here
		case 379: // swords 3
			// insert code here
		case 380: // swords 4
			// insert code here
		case 381: // swords 5
			// insert code here
		case 382: // swords 6
			// insert code here
		case 383: // swords 7
			// insert code here
		case 384: // swords 8
			// insert code here
		case 385: // swords 9
			// insert code here
		case 386: // swords 10
			// insert code here
		case 387: // swords 11
			// insert code here
		case 388: // swords 12
			// insert code here
		case 389: // swords 13
			// insert code here

		case 390: // coins 1
			// insert code here
		case 391: // coins 2
			// insert code here
		case 392: // coins 3
			// insert code here
		case 393: // coins 4
			// insert code here
		case 394: // coins 5
			// insert code here
		case 395: // coins 6
			// insert code here
		case 396: // coins 7
			// insert code here
		case 397: // coins 8
			// insert code here
		case 398: // coins 9
			// insert code here
		case 399: // coins 10
			// insert code here
		case 400: // coins 11
			// insert code here
		case 401: // coins 12
			// insert code here
		case 402: // coins 13
			// insert code here

		case 403, 405, 407, 409, 411, 413, 415: // wand 1, 3, 5, 7, 9, 11, 13
			// insert code here
		case 404, 406, 408, 410, 412, 414: // wand 2, 4, 6, 8, 10, 12
			// insert code here
		
		// Strength
		case 416: // cups 1
			// insert code here
		case 417: // cups 2
			// insert code here
		case 418: // cups 3
			// insert code here
		case 419: // cups 4
			// insert code here
		case 420: // cups 5
			// insert code here
		case 421: // cups 6
			// insert code here
		case 422: // cups 7
			// insert code here
		case 423: // cups 8
			// insert code here
		case 424: // cups 9
			// insert code here
		case 425: // cups 10
			// insert code here
		case 426: // cups 11
			// insert code here
		case 427: // cups 12
			// insert code here
		case 428: // cups 13
			// insert code here

		case 429: // swords 1
			// insert code here
		case 430: // swords 2
			// insert code here
		case 431: // swords 3
			// insert code here
		case 432: // swords 4
			// insert code here
		case 433: // swords 5
			// insert code here
		case 434: // swords 6
			// insert code here
		case 435: // swords 7
			// insert code here
		case 436: // swords 8
			// insert code here
		case 437: // swords 9
			// insert code here
		case 438: // swords 10
			// insert code here
		case 439: // swords 11
			// insert code here
		case 440: // swords 12
			// insert code here
		case 441: // swords 13
			// insert code here

		case 442: // coins 1
			// insert code here
		case 443: // coins 2
			// insert code here
		case 444: // coins 3
			// insert code here
		case 445: // coins 4
			// insert code here
		case 446: // coins 5
			// insert code here
		case 447: // coins 6
			// insert code here
		case 448: // coins 7
			// insert code here
		case 449: // coins 8
			// insert code here
		case 450: // coins 9
			// insert code here
		case 451: // coins 10
			// insert code here
		case 452: // coins 11
			// insert code here
		case 453: // coins 12
			// insert code here
		case 454: // coins 13
			// insert code here

		case 455: // wand 1
			// insert code here
		case 456: // wand 2
			// insert code here
		case 457: // wand 3
			// insert code here
		case 458: // wand 4
			// insert code here
		case 459: // wand 5
			// insert code here
		case 460: // wand 6
			// insert code here
		case 461: // wand 7
			// insert code here
		case 462: // wand 8
			// insert code here
		case 463: // wand 9
			// insert code here
		case 464: // wand 10
			// insert code here
		case 465: // wand 11
			// insert code here
		case 466: // wand 12
			// insert code here
		case 467: // wand 13
			// insert code here

		// Hermit
		case 468, 469, 470, 471, 472, 473: // cups 1, 2, 3, 4, 5, 6
			// insert code here
		case 474: // cups 7
			// insert code here
		case 475, 476, 477, 478, 479, 480: // cups 8, 9, 10, 11, 12, 13
			// insert code here

		case 481, 482, 483, 484, 485, 486: // swords 1, 2, 3, 4, 5, 6
			// insert code here
		case 487: // swords 7
			// insert code here
		case 488, 489, 490, 491, 492, 493: // swords 8, 9, 10, 11, 12, 13
			// insert code here
		
		case 494, 495, 496, 497, 498, 499: // coins 1, 2, 3, 4, 5, 6
			// insert code here
		case 500: // coins 7
			// insert code here
		case 501, 502, 503, 504, 505, 506: // coins 8, 9, 10, 11, 12, 13
			// insert code here

		case 507, 508, 509, 510, 511, 512: // wand 1, 2, 3, 4, 5, 6
			// insert code here
		case 513: // wand 7
			// insert code here
		case 514, 515, 516, 517, 518, 519: // wand 8, 9, 10, 11, 12, 13
			// insert code here
		
		// Fortune
		case 520: // cups 1
			// insert code here
		case 521: // cups 2
			// insert code here
		case 522: // cups 3
			// insert code here
		case 523: // cups 4
			// insert code here
		case 524: // cups 5
			// insert code here
		case 525: // cups 6
			// insert code here
		case 526: // cups 7
			// insert code here
		case 527: // cups 8
			// insert code here
		case 528: // cups 9
			// insert code here
		case 529: // cups 10
			// insert code here
		case 530: // cups 11
			// insert code here
		case 531: // cups 12
			// insert code here
		case 532: // cups 13
			// insert code here

		case 533: // swords 1
			// insert code here
		case 534: // swords 2
			// insert code here
		case 535: // swords 3
			// insert code here
		case 536: // swords 4
			// insert code here
		case 537: // swords 5
			// insert code here
		case 538: // swords 6
			// insert code here
		case 539: // swords 7
			// insert code here
		case 540: // swords 8
			// insert code here
		case 541: // swords 9
			// insert code here
		case 542: // swords 10
			// insert code here
		case 543: // swords 11
			// insert code here
		case 544: // swords 12
			// insert code here
		case 545: // swords 13
			// insert code here

		case 546: // coins 1
			// insert code here
		case 547: // coins 2
			// insert code here
		case 548: // coins 3
			// insert code here
		case 549: // coins 4
			// insert code here
		case 550: // coins 5
			// insert code here
		case 551: // coins 6
			// insert code here
		case 552: // coins 7
			// insert code here
		case 553: // coins 8
			// insert code here
		case 554: // coins 9
			// insert code here
		case 555: // coins 10
			// insert code here
		case 556: // coins 11
			// insert code here
		case 557: // coins 12
			// insert code here
		case 558: // coins 13
			// insert code here

		case 559, 561, 563, 565, 567, 569, 571: // wand 1, 3, 5, 7, 9, 11, 13
			// insert code here
		case 560, 562, 564, 566, 568, 570: // wand 2, 4, 6, 8, 10, 12
			// insert code here

		// Justice
		case 572, 573, 574, 575, 576, 577, 578: // cups 1, 2, 3, 4, 5, 6, 7
			// insert code here
		case 579, 580, 581, 582, 583, 584: // cups 8, 9, 10, 11, 12, 13
			// insert code here

		case 585, 586, 587, 588, 589, 590, 591: // swords 1, 2, 3, 4, 5, 6, 7
			// insert code here
		case 592, 593, 594, 595, 596, 597: // swords 8, 9, 10, 11, 12, 13
			// insert code here

		case 598, 599, 600, 601, 602, 603, 604: // coins 1, 2, 3, 4, 5, 6, 7
			// insert code here
		case 605, 606, 607, 608, 609, 610: // coins 8, 9, 10, 11, 12, 13
			// insert code here

		case 611, 612, 613, 614, 615, 616, 617: // wand 1, 2, 3, 4, 5, 6, 7
			// insert code here
		case 618, 619, 620, 621, 622, 623: // wand 8, 9, 10, 11, 12, 13
			// insert code here
			
		// Hanged Man
		case 624: // cups 1
			// insert code here
		case 625: // cups 2
			// insert code here
		case 626: // cups 3
			// insert code here
		case 627: // cups 4
			// insert code here
		case 628: // cups 5
			// insert code here
		case 629: // cups 6
			// insert code here
		case 630: // cups 7
			// insert code here
		case 631: // cups 8
			// insert code here
		case 632: // cups 9
			// insert code here
		case 633: // cups 10
			// insert code here
		case 634: // cups 11
			// insert code here
		case 635: // cups 12
			// insert code here
		case 636: // cups 13
			// insert code here

		case 637: // swords 1
			// insert code here
		case 638: // swords 2
			// insert code here
		case 639: // swords 3
			// insert code here
		case 640: // swords 4
			// insert code here
		case 641: // swords 5
			// insert code here
		case 642: // swords 6
			// insert code here
		case 643: // swords 7
			// insert code here
		case 644: // swords 8
			// insert code here
		case 645: // swords 9
			// insert code here
		case 646: // swords 10
			// insert code here
		case 647: // swords 11
			// insert code here
		case 648: // swords 12
			// insert code here
		case 649: // swords 13
			// insert code here

		case 650: // coins 1
			// insert code here
		case 651: // coins 2
			// insert code here
		case 652: // coins 3
			// insert code here
		case 653: // coins 4
			// insert code here
		case 654: // coins 5
			// insert code here
		case 655: // coins 6
			// insert code here
		case 656: // coins 7
			// insert code here
		case 657: // coins 8
			// insert code here
		case 658: // coins 9
			// insert code here
		case 659: // coins 10
			// insert code here
		case 660: // coins 11
			// insert code here
		case 661: // coins 12
			// insert code here
		case 662: // coins 13
			// insert code here

		case 663: // wand 1
			// insert code here
		case 664: // wand 2
			// insert code here
		case 665: // wand 3
			// insert code here
		case 666: // wand 4
			// insert code here
		case 667: // wand 5
			// insert code here
		case 668: // wand 6
			// insert code here
		case 669: // wand 7
			// insert code here
		case 670: // wand 8
			// insert code here
		case 671: // wand 9
			// insert code here
		case 672: // wand 10
			// insert code here
		case 673: // wand 11
			// insert code here
		case 674: // wand 12
			// insert code here
		case 675: // wand 13
			// insert code here

		// Death
		case 676: // cups 1
			// insert code here
		case 677: // cups 2
			// insert code here
		case 678: // cups 3
			// insert code here
		case 679: // cups 4
			// insert code here
		case 680: // cups 5
			// insert code here
		case 681: // cups 6
			// insert code here
		case 682: // cups 7
			// insert code here
		case 683: // cups 8
			// insert code here
		case 684: // cups 9
			// insert code here
		case 685: // cups 10
			// insert code here
		case 686: // cups 11
			// insert code here
		case 687: // cups 12
			// insert code here
		case 688: // cups 13
			// insert code here

		case 689, 690, 691, 692, 693, 694: // swords 1, 2, 3, 4, 5, 6
			// insert code here
		case 695: // swords 7
			// insert code here
		case 696, 697, 698, 699, 700, 701: // swords 8, 9, 10, 11, 12, 13
			// insert code here

		case 702, 703, 704, 705, 706, 707: // coins 1, 2, 3, 4, 5, 6
			// insert code here
		case 708: // coins 7
			// insert code here
		case 709, 710, 711, 712, 713, 714: // coins 8, 9, 10, 11, 12, 13
			// insert code here

		case 715, 716, 717, 718, 719, 720: // wand 1, 2, 3, 4, 5, 6
			// insert code here
		case 721: // wand 7
			// insert code here
		case 722, 723, 724, 725, 726, 727: // wand 8, 9, 10, 11, 12, 13
			// insert code here
			
		}
	}
	
	public static int cardCounter(int startingCount, int handLimit) {
		
		int cardCount = startingCount;
		
		if (cardCount > handLimit) {
			cardCount = handLimit;
		}
		
		return cardCount;
	}
	
	public static int healthCounter (int baseHealth) {
		
		int currentHealth = baseHealth;
		
		return currentHealth;
	}


	public static void main(String[] args) {

		List<String> storage = cardInfoAndEffect();
		
		for (String client : storage) {
			System.out.println(client);
		}
		
	}

}
