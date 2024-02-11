
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

	public static List<String> cardInfoAndEffect() {
		List<Integer> cardDataRef = new ArrayList<Integer>(3);
		List<String> cardDataCollection = new ArrayList<String>();

		
		for (int major = MAJORMIN; major <= MAJORMAX; major++) { // major arcana selection
			cardDataRef.add(0, major);
			for (int minor = MINORMIN; minor <= MINORMAX; minor++) { // minor arcana selection
				cardDataRef.add(1, minor);
				for (int minorNum = MINORNUMMIN; minorNum <= MINORNUMMAX; minorNum++) { // minor arcana number selection
					cardDataRef.add(2, minorNum);
					
					StringBuilder sb = new StringBuilder();
					for (int i = cardDataRef.size() - 1; i >= 0; i--) {
					  int num = cardDataRef.get(i);
					  sb.append(num);
					}
					
					String dataString = sb.toString();
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

		StringBuilder sb = new StringBuilder();
		for (int i = cardData.size() - 1; i >= 0; i--) {
		  int num = cardData.get(i);
		  sb.append(num);
		}
		
		String dataCard = sb.toString();
		
		int indexOfMatchingCondition = code.indexOf(dataCard);
		return indexOfMatchingCondition;
	}

	public static void indexAndAffect(int indexOfCombos) {

		switch (indexOfCombos) {

		// Fool
		case 0: // cups 1
			// insert code here
		case 1: // cups 2
			// insert code here
		case 2: // cups 3
			// insert code here
		case 3: // cups 4
			// insert code here
		case 4: // cups 5
			// insert code here
		case 5: // cups 6
			// insert code here
		case 6: // cups 7
			// insert code here
		case 7: // cups 8
			// insert code here
		case 8: // cups 9
			// insert code here
		case 9: // cups 10
			// insert code here
		case 10: // cups 11
			// insert code here
		case 11: // cups 12
			// insert code here
		case 12: // cups 13
			// insert code here

		case 13: // swords 1
			// insert code here
		case 14: // swords 2
			// insert code here
		case 15: // swords 3
			// insert code here
		case 16: // swords 4
			// insert code here
		case 17: // swords 5
			// insert code here
		case 18: // swords 6
			// insert code here
		case 19: // swords 7
			// insert code here
		case 20: // swords 8
			// insert code here
		case 21: // swords 9
			// insert code here
		case 22: // swords 10
			// insert code here
		case 23: // swords 11
			// insert code here
		case 24: // swords 12
			// insert code here
		case 25: // swords 13
			// insert code here

		case 26: // coins 1
			// insert code here
		case 27: // coins 2
			// insert code here
		case 28: // coins 3
			// insert code here
		case 29: // coins 4
			// insert code here
		case 30: // coins 5
			// insert code here
		case 31: // coins 6
			// insert code here
		case 32: // coins 7
			// insert code here
		case 33: // coins 8
			// insert code here
		case 34: // coins 9
			// insert code here
		case 35: // coins 10
			// insert code here
		case 36: // coins 11
			// insert code here
		case 37: // coins 12
			// insert code here
		case 38: // coins 13
			// insert code here

		case 39: // wand 1
			// insert code here
		case 40: // wand 2
			// insert code here
		case 41: // wand 3
			// insert code here
		case 42: // wand 4
			// insert code here
		case 43: // wand 5
			// insert code here
		case 44: // wand 6
			// insert code here
		case 45: // wand 7
			// insert code here
		case 46: // wand 8
			// insert code here
		case 47: // wand 9
			// insert code here
		case 48: // wand 10
			// insert code here
		case 49: // wand 11
			// insert code here
		case 50: // wand 12
			// insert code here
		case 51: // wand 13
			// insert code here

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

		case 195: // wand 1
			// insert code here
		case 196: // wand 2
			// insert code here
		case 197: // wand 3
			// insert code here
		case 198: // wand 4
			// insert code here
		case 199: // wand 5
			// insert code here
		case 200: // wand 6
			// insert code here
		case 201: // wand 7
			// insert code here
		case 202: // wand 8
			// insert code here
		case 203: // wand 9
			// insert code here
		case 204: // wand 10
			// insert code here
		case 205: // wand 11
			// insert code here
		case 206: // wand 12
			// insert code here
		case 207: // wand 13
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

		case 247: // wand 1
			// insert code here
		case 248: // wand 2
			// insert code here
		case 249: // wand 3
			// insert code here
		case 250: // wand 4
			// insert code here
		case 251: // wand 5
			// insert code here
		case 252: // wand 6
			// insert code here
		case 253: // wand 7
			// insert code here
		case 254: // wand 8
			// insert code here
		case 255: // wand 9
			// insert code here
		case 256: // wand 10
			// insert code here
		case 257: // wand 11
			// insert code here
		case 258: // wand 12
			// insert code here
		case 259: // wand 13
			// insert code here

		// Heirophant
		case 260: // cups 1
			// insert code here
		case 261: // cups 2
			// insert code here
		case 262: // cups 3
			// insert code here
		case 263: // cups 4
			// insert code here
		case 264: // cups 5
			// insert code here
		case 265: // cups 6
			// insert code here
		case 266: // cups 7
			// insert code here
		case 267: // cups 8
			// insert code here
		case 268: // cups 9
			// insert code here
		case 269: // cups 10
			// insert code here
		case 270: // cups 11
			// insert code here
		case 271: // cups 12
			// insert code here
		case 272: // cups 13
			// insert code here

		case 273: // swords 1
			// insert code here
		case 274: // swords 2
			// insert code here
		case 275: // swords 3
			// insert code here
		case 276: // swords 4
			// insert code here
		case 277: // swords 5
			// insert code here
		case 278: // swords 6
			// insert code here
		case 279: // swords 7
			// insert code here
		case 280: // swords 8
			// insert code here
		case 281: // swords 9
			// insert code here
		case 282: // swords 10
			// insert code here
		case 283: // swords 11
			// insert code here
		case 284: // swords 12
			// insert code here
		case 285: // swords 13
			// insert code here

		case 286: // coins 1
			// insert code here
		case 287: // coins 2
			// insert code here
		case 288: // coins 3
			// insert code here
		case 289: // coins 4
			// insert code here
		case 290: // coins 5
			// insert code here
		case 291: // coins 6
			// insert code here
		case 292: // coins 7
			// insert code here
		case 293: // coins 8
			// insert code here
		case 294: // coins 9
			// insert code here
		case 295: // coins 10
			// insert code here
		case 296: // coins 11
			// insert code here
		case 297: // coins 12
			// insert code here
		case 298: // coins 13
			// insert code here

		case 299: // wand 1
			// insert code here
		case 300: // wand 2
			// insert code here
		case 301: // wand 3
			// insert code here
		case 302: // wand 4
			// insert code here
		case 303: // wand 5
			// insert code here
		case 304: // wand 6
			// insert code here
		case 305: // wand 7
			// insert code here
		case 306: // wand 8
			// insert code here
		case 307: // wand 9
			// insert code here
		case 308: // wand 10
			// insert code here
		case 309: // wand 11
			// insert code here
		case 310: // wand 12
			// insert code here
		case 311: // wand 13
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

		case 403: // wand 1
			// insert code here
		case 404: // wand 2
			// insert code here
		case 405: // wand 3
			// insert code here
		case 406: // wand 4
			// insert code here
		case 407: // wand 5
			// insert code here
		case 408: // wand 6
			// insert code here
		case 409: // wand 7
			// insert code here
		case 410: // wand 8
			// insert code here
		case 411: // wand 9
			// insert code here
		case 412: // wand 10
			// insert code here
		case 413: // wand 11
			// insert code here
		case 414: // wand 12
			// insert code here
		case 415: // wand 13
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
		case 468: // cups 1
			// insert code here
		case 469: // cups 2
			// insert code here
		case 470: // cups 3
			// insert code here
		case 471: // cups 4
			// insert code here
		case 472: // cups 5
			// insert code here
		case 473: // cups 6
			// insert code here
		case 474: // cups 7
			// insert code here
		case 475: // cups 8
			// insert code here
		case 476: // cups 9
			// insert code here
		case 477: // cups 10
			// insert code here
		case 478: // cups 11
			// insert code here
		case 479: // cups 12
			// insert code here
		case 480: // cups 13
			// insert code here

		case 481: // swords 1
			// insert code here
		case 482: // swords 2
			// insert code here
		case 483: // swords 3
			// insert code here
		case 484: // swords 4
			// insert code here
		case 485: // swords 5
			// insert code here
		case 486: // swords 6
			// insert code here
		case 487: // swords 7
			// insert code here
		case 488: // swords 8
			// insert code here
		case 489: // swords 9
			// insert code here
		case 490: // swords 10
			// insert code here
		case 491: // swords 11
			// insert code here
		case 492: // swords 12
			// insert code here
		case 493: // swords 13
			// insert code here

		case 494: // coins 1
			// insert code here
		case 495: // coins 2
			// insert code here
		case 496: // coins 3
			// insert code here
		case 497: // coins 4
			// insert code here
		case 498: // coins 5
			// insert code here
		case 499: // coins 6
			// insert code here
		case 500: // coins 7
			// insert code here
		case 501: // coins 8
			// insert code here
		case 502: // coins 9
			// insert code here
		case 503: // coins 10
			// insert code here
		case 504: // coins 11
			// insert code here
		case 505: // coins 12
			// insert code here
		case 506: // coins 13
			// insert code here

		case 507: // wand 1
			// insert code here
		case 508: // wand 2
			// insert code here
		case 509: // wand 3
			// insert code here
		case 510: // wand 4
			// insert code here
		case 511: // wand 5
			// insert code here
		case 512: // wand 6
			// insert code here
		case 513: // wand 7
			// insert code here
		case 514: // wand 8
			// insert code here
		case 515: // wand 9
			// insert code here
		case 516: // wand 10
			// insert code here
		case 517: // wand 11
			// insert code here
		case 518: // wand 12
			// insert code here
		case 519: // wand 13
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

		case 559: // wand 1
			// insert code here
		case 560: // wand 2
			// insert code here
		case 561: // wand 3
			// insert code here
		case 562: // wand 4
			// insert code here
		case 563: // wand 5
			// insert code here
		case 564: // wand 6
			// insert code here
		case 565: // wand 7
			// insert code here
		case 566: // wand 8
			// insert code here
		case 567: // wand 9
			// insert code here
		case 568: // wand 10
			// insert code here
		case 569: // wand 11
			// insert code here
		case 570: // wand 12
			// insert code here
		case 571: // wand 13
			// insert code here

		// Justice
		case 572: // cups 1
			// insert code here
		case 573: // cups 2
			// insert code here
		case 574: // cups 3
			// insert code here
		case 575: // cups 4
			// insert code here
		case 576: // cups 5
			// insert code here
		case 577: // cups 6
			// insert code here
		case 578: // cups 7
			// insert code here
		case 579: // cups 8
			// insert code here
		case 580: // cups 9
			// insert code here
		case 581: // cups 10
			// insert code here
		case 582: // cups 11
			// insert code here
		case 583: // cups 12
			// insert code here
		case 584: // cups 13
			// insert code here

		case 585: // swords 1
			// insert code here
		case 586: // swords 2
			// insert code here
		case 587: // swords 3
			// insert code here
		case 588: // swords 4
			// insert code here
		case 589: // swords 5
			// insert code here
		case 590: // swords 6
			// insert code here
		case 591: // swords 7
			// insert code here
		case 592: // swords 8
			// insert code here
		case 593: // swords 9
			// insert code here
		case 594: // swords 10
			// insert code here
		case 595: // swords 11
			// insert code here
		case 596: // swords 12
			// insert code here
		case 597: // swords 13
			// insert code here

		case 598: // coins 1
			// insert code here
		case 599: // coins 2
			// insert code here
		case 600: // coins 3
			// insert code here
		case 601: // coins 4
			// insert code here
		case 602: // coins 5
			// insert code here
		case 603: // coins 6
			// insert code here
		case 604: // coins 7
			// insert code here
		case 605: // coins 8
			// insert code here
		case 606: // coins 9
			// insert code here
		case 607: // coins 10
			// insert code here
		case 608: // coins 11
			// insert code here
		case 609: // coins 12
			// insert code here
		case 610: // coins 13
			// insert code here

		case 611: // wand 1
			// insert code here
		case 612: // wand 2
			// insert code here
		case 613: // wand 3
			// insert code here
		case 614: // wand 4
			// insert code here
		case 615: // wand 5
			// insert code here
		case 616: // wand 6
			// insert code here
		case 617: // wand 7
			// insert code here
		case 618: // wand 8
			// insert code here
		case 619: // wand 9
			// insert code here
		case 620: // wand 10
			// insert code here
		case 621: // wand 11
			// insert code here
		case 622: // wand 12
			// insert code here
		case 623: // wand 13
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

		case 689: // swords 1
			// insert code here
		case 690: // swords 2
			// insert code here
		case 691: // swords 3
			// insert code here
		case 692: // swords 4
			// insert code here
		case 693: // swords 5
			// insert code here
		case 694: // swords 6
			// insert code here
		case 695: // swords 7
			// insert code here
		case 696: // swords 8
			// insert code here
		case 697: // swords 9
			// insert code here
		case 698: // swords 10
			// insert code here
		case 699: // swords 11
			// insert code here
		case 700: // swords 12
			// insert code here
		case 701: // swords 13
			// insert code here

		case 702: // coins 1
			// insert code here
		case 703: // coins 2
			// insert code here
		case 704: // coins 3
			// insert code here
		case 705: // coins 4
			// insert code here
		case 706: // coins 5
			// insert code here
		case 707: // coins 6
			// insert code here
		case 708: // coins 7
			// insert code here
		case 709: // coins 8
			// insert code here
		case 710: // coins 9
			// insert code here
		case 711: // coins 10
			// insert code here
		case 712: // coins 11
			// insert code here
		case 713: // coins 12
			// insert code here
		case 714: // coins 13
			// insert code here

		case 715: // wand 1
			// insert code here
		case 716: // wand 2
			// insert code here
		case 717: // wand 3
			// insert code here
		case 718: // wand 4
			// insert code here
		case 719: // wand 5
			// insert code here
		case 720: // wand 6
			// insert code here
		case 721: // wand 7
			// insert code here
		case 722: // wand 8
			// insert code here
		case 723: // wand 9
			// insert code here
		case 724: // wand 10
			// insert code here
		case 725: // wand 11
			// insert code here
		case 726: // wand 12
			// insert code here
		case 727: // wand 13
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


	public static void main(String[] args) {

		List<String> storage = cardInfoAndEffect();
		
		for (String client : storage) {
			System.out.println(client);
		}
		
	}

}
