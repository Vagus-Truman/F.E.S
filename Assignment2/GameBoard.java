import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Timer;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.event.ActionEvent;

public class GameBoard extends JFrame {

	private List<String> majorArcanaCards;

	public static boolean p1TurnOver = Player1.turnIsOver;
	public static boolean p2TurnOver = Player2.turnIsOver;
	public static boolean validCardSelected = false;
	public static boolean stunLockedP1 = Player1.statusEffected;
	public static boolean stunLockedP2 = Player2.statusEffected;
	public static boolean isThereAWinner = false;
	private String effectOfCards;

	// left side data
	private static final int HpBarWidth = 260;
	private static final int HpBarLength = 40;
	private static final int TurnIndicatorWidth = 290;
	private static final int TurnIndicatorHeight = 300;
	private static final int indicatorHealthBarWidth = 310;
	private static final int indicatorHealthBarHeight = 410;

	private int currentPlayer;

	private JPanel turnIndicator;
	private JLabel currentPlayerTurn;

	private JPanel player1HPIndicator;
	private JLabel player1HPCount;
	private JPanel player2HPIndicator;
	private JLabel player2HPCount;

	// beyond left side data
	private static final int CardWidth = 175;
	private static final int CardLength = 300;
	private static final int ArcanaDescWidth = 945;
	private static final int ArcanaDescLength = 200;
	private static final int ArcanaRollWidthAndHeight = 170;

	private JLabel minorArcanaDescription;
	private JButton card1;
	private JButton card2;
	private JButton card3;
	private JButton card4;
	private JButton card5;
	private ImageIcon cardBack;

	private JPanel minorArcanaFull;
	private JButton minorArcanaRoll;
	private ImageIcon dicePic;
	private JPanel minorArcanaRollResult;
	private JLabel minorArcanaRollResultText;

	private JPanel potentialFX;
	private JLabel potentialFXDesc;

	private JPanel resultingFX;
	private JLabel resultingFXDesc;

	// main things
	private JPanel contentPane;
	private JPanel paneLeftSide;
	private JPanel paneCenterBeyondLeft;

	public GameBoard() {
		this.setTitle("All Shall Be Revealed");

		this.currentPlayer = Game.currentPlayer;
		Dimension screenSize = new Dimension(1536, 960);
		Dimension arcanaCardSize = new Dimension(CardWidth, CardLength);
		Dimension healthBarSize = new Dimension(HpBarWidth, HpBarLength);
		Dimension turnIndicatorUprightSize = new Dimension(TurnIndicatorWidth, TurnIndicatorHeight);
		Dimension indicatorHealthBarSize = new Dimension(indicatorHealthBarWidth, indicatorHealthBarHeight);

		System.out.println("ScreenSize Width = " + screenSize.width);
		System.out.println("ScreenSize Height = " + screenSize.height);

		this.contentPane = new JPanel();
		this.contentPane.setBackground(Color.BLACK);
		this.contentPane.setSize(screenSize);
		this.contentPane.setLayout(null);
		Font smallText = new Font("Monospaced", Font.PLAIN, 14);
		Font bigText = new Font("Monospaced", Font.BOLD, 20);
		Font biggerText = new Font("Monospaced", Font.BOLD, 28);
		this.effectOfCards = new String("All Shall Be Revealed");

		// Left Panel
		this.paneLeftSide = new JPanel();
		this.paneLeftSide.setBounds(25, (screenSize.height - indicatorHealthBarSize.height) / 2,
				indicatorHealthBarSize.width, indicatorHealthBarSize.height);
		this.paneLeftSide.setBackground(Color.DARK_GRAY);

		// player 1 health
		this.player1HPCount = new JLabel();
		this.player1HPCount.setText("P1 | " + Player1.getHealthCount() + " / 100");
		this.player1HPCount.setFont(bigText);
		this.player1HPCount.setForeground(Color.WHITE);
		this.player1HPIndicator = new JPanel();
		this.player1HPIndicator.setBounds(25, 5, healthBarSize.width, healthBarSize.height);
		this.player1HPIndicator.setBackground(Color.BLUE);
		this.player1HPIndicator.add(player1HPCount);
		this.paneLeftSide.add(player1HPIndicator);

		// turn indicators
		this.currentPlayerTurn = new JLabel();
		this.currentPlayerTurn.setText("<html><br/><br/><br/>Player " + this.currentPlayer + "'s Turn!<html>");
		this.currentPlayerTurn.setFont(biggerText);
		this.currentPlayerTurn.setForeground(Color.WHITE);
		this.turnIndicator = new JPanel();
		this.turnIndicator.add(currentPlayerTurn);
		this.turnIndicator.setBackground(Color.GRAY);
		this.turnIndicator.setBounds(10, (indicatorHealthBarSize.height - turnIndicatorUprightSize.height) / 2 - 3,
				turnIndicatorUprightSize.width, turnIndicatorUprightSize.height);
		this.paneLeftSide.add(turnIndicator);

		// player 2 health
		this.player2HPCount = new JLabel();
		this.player2HPCount.setText("P2 | " + Player2.getHealthCount() + " / 100");
		this.player2HPCount.setFont(bigText);
		this.player2HPCount.setForeground(Color.WHITE);
		this.player2HPIndicator = new JPanel();
		this.player2HPIndicator.setBounds(25, (indicatorHealthBarSize.height + turnIndicatorUprightSize.height) / 2 + 5,
				healthBarSize.width, healthBarSize.height);
		this.player2HPIndicator.setBackground(Color.RED);
		this.player2HPIndicator.add(player2HPCount);
		this.paneLeftSide.add(player2HPIndicator);

		// Beyond Left Panel
		this.paneCenterBeyondLeft = new JPanel();
		this.paneCenterBeyondLeft.setLayout(null);
		this.paneCenterBeyondLeft.setBackground(Color.DARK_GRAY);
		this.paneCenterBeyondLeft.setBounds(indicatorHealthBarSize.width + 35, 15,
				(screenSize.width - 65 - indicatorHealthBarSize.width), screenSize.height - 70);

		// choosing between each minor arcana
		this.dicePic = new ImageIcon("icons/dice.png");
		this.minorArcanaRoll = new JButton(this.dicePic);
		this.minorArcanaRoll.setBounds(15, (paneCenterBeyondLeft.getHeight() - ArcanaRollWidthAndHeight) / 2 - 15,
				ArcanaRollWidthAndHeight, ArcanaRollWidthAndHeight);
		this.paneCenterBeyondLeft.add(minorArcanaRoll);

		// showing the result of the minor arcana roll
		this.minorArcanaRollResultText = new JLabel();
		this.minorArcanaRollResultText.setForeground(Color.CYAN);
		this.minorArcanaRollResultText.setFont(smallText);

		minorArcanaRoll.addActionListener(e -> {

			givePlayerTimeToRead(5);
			int minorSuit = Dice.rollDiceSuit();
			System.out.println("Minor Suit: " + minorSuit);

			if (minorSuit == 1) {
				this.minorArcanaRollResultText.setText("> Result: Cups");
			} else if (minorSuit == 2) {
				this.minorArcanaRollResultText.setText("> Result: Swords");
			} else if (minorSuit == 3) {
				this.minorArcanaRollResultText.setText("> Result: Coins");
			} else if (minorSuit == 4) {
				this.minorArcanaRollResultText.setText("> Result: Wands");
			} else {
				this.minorArcanaRollResultText.setText("> Result: ");
			}

			int selectedCardIndex = majorArcanaCards.indexOf(minorArcanaDescription.getText());
			int overallIndex = selectedCardIndex * 4 + (minorSuit - 1);

			if (currentPlayer == 1) {

				if (stunLockedP1) {

					System.out.println(">> Player " + currentPlayer + "'s turn");

					if (Player2.statusEffected) {
						System.out.println("> Enemy HP: " + Player2.getHealthCount() + " | " + Player2.inflictedStatus);
					} else {
						System.out.println("> Enemy HP: " + Player2.getHealthCount());
					}

					if (Player1.statusEffected) {
						System.out.println("> Your HP: " + Player1.getHealthCount() + " | " + Player1.inflictedStatus);
					} else {
						System.out.println("> Your HP: " + Player1.getHealthCount());
					}

					System.out.println("Shock/Stunned is active. Turn is skipped");

					p1TurnOver = true;

					switchPlayer();

					p1TurnOver = false;

					return;
				}

				Player1.indexAndAffect(overallIndex);
			} else {

				if (stunLockedP2) {

					System.out.println(">> Player " + currentPlayer + "'s turn");

					if (Player1.statusEffected) {
						System.out.println("> Enemy HP: " + Player1.getHealthCount() + " | " + Player1.inflictedStatus);
					} else {
						System.out.println("> Enemy HP: " + Player1.getHealthCount());
					}
					if (Player2.statusEffected) {
						System.out.println("> Your HP: " + Player2.getHealthCount() + " | " + Player2.inflictedStatus);
					} else {
						System.out.println("> Your HP: " + Player2.getHealthCount());
					}

					System.out.println("Shock/Stunned is active. Turn is skipped");

					p2TurnOver = true;
					switchPlayer();

					p2TurnOver = false;

					return;
				}

				Player2.indexAndAffect(overallIndex);
			}

			updateHealthCount();

			this.card1.setIcon(this.cardBack);
			this.card2.setIcon(this.cardBack);
			this.card3.setIcon(this.cardBack);
			this.card4.setIcon(this.cardBack);
			this.card5.setIcon(this.cardBack);

			ifOneLoses();

			this.minorArcanaRollResult = new JPanel();
			this.minorArcanaRollResult.setBackground(Color.BLACK);
			this.minorArcanaRollResult.setBounds(this.minorArcanaRoll.getX(),
					this.minorArcanaRoll.getY() + this.minorArcanaRoll.getHeight() + 20, ArcanaRollWidthAndHeight, 40);
			this.minorArcanaRollResult.add(minorArcanaRollResultText);
			this.paneCenterBeyondLeft.add(minorArcanaRollResult);
		});

		this.potentialFXDesc = new JLabel();
		this.potentialFXDesc.setForeground(Color.CYAN);
		this.potentialFXDesc.setFont(smallText);
		this.potentialFXDesc.setText("<html> >isStunned | " + Effect.isStunned + "<br/> >isBurning | "
				+ Effect.isBurning + "<br/> >isShocked | " + Effect.isShocked + "<html>");

		this.potentialFX = new JPanel();
		this.potentialFX.setBackground(Color.BLACK);
		this.potentialFX.setBounds(15, (paneCenterBeyondLeft.getHeight()) / 2 + 140, ArcanaRollWidthAndHeight, 80);
		this.potentialFX.add(potentialFXDesc);
		this.paneCenterBeyondLeft.add(potentialFX);

		this.minorArcanaDescription = new JLabel();
		this.minorArcanaDescription.setForeground(Color.CYAN);
		this.minorArcanaDescription.setFont(bigText);
		this.minorArcanaDescription.setText("<html><br><br><br>ALL SHALL BE REVEALED<html>");
		this.minorArcanaFull = new JPanel();
		this.minorArcanaFull.setBounds((minorArcanaRoll.getWidth() + 30), 15, ArcanaDescWidth, ArcanaDescLength);
		this.minorArcanaFull.setBackground(Color.BLACK);
		this.minorArcanaFull.add(minorArcanaDescription);
		this.paneCenterBeyondLeft.add(minorArcanaFull);

		// creating the cards
		Random shufflingDeck = new Random();
		int cardVictim1 = shufflingDeck.nextInt(13);
		int cardVictim2 = shufflingDeck.nextInt(13);
		int cardVictim3 = shufflingDeck.nextInt(13);
		int cardVictim4 = shufflingDeck.nextInt(13);
		int cardVictim5 = shufflingDeck.nextInt(13);

		this.cardBack = new ImageIcon("icons/arcana.png");

		this.card1 = new JButton(this.cardBack);
		// this.card1.setText(cardNameMatch(cardVictim2));
		this.card1.setBounds((minorArcanaRoll.getWidth() + 45), (paneCenterBeyondLeft.getHeight() - 15 - CardLength),
				CardWidth, CardLength);
		this.paneCenterBeyondLeft.add(card1);
		card1.addActionListener(e -> {
			displaySelectedCardDescription(cardVictim1);
		});

		this.card2 = new JButton(this.cardBack);
		// this.card2.setText(cardNameMatch(cardVictim2));
		this.card2.setBounds((minorArcanaRoll.getWidth() + 45) + (10 + CardWidth),
				(paneCenterBeyondLeft.getHeight() - 15 - CardLength), CardWidth, CardLength);
		this.paneCenterBeyondLeft.add(card2);
		card2.addActionListener(e -> {
			displaySelectedCardDescription(cardVictim2);
		});

		this.card3 = new JButton(this.cardBack);
		// this.card3.setText(cardNameMatch(cardVictim3));
		this.card3.setBounds((minorArcanaRoll.getWidth() + 45) + (10 + CardWidth) * 2,
				(paneCenterBeyondLeft.getHeight() - 15 - CardLength), CardWidth, CardLength);
		this.paneCenterBeyondLeft.add(card3);
		card3.addActionListener(e -> {
			displaySelectedCardDescription(cardVictim3);
		});

		this.card4 = new JButton(this.cardBack);
		// this.card4.setText(cardNameMatch(cardVictim4));
		this.card4.setBounds((minorArcanaRoll.getWidth() + 45) + (10 + CardWidth) * 3,
				(paneCenterBeyondLeft.getHeight() - 15 - CardLength), CardWidth, CardLength);
		this.paneCenterBeyondLeft.add(card4);
		card4.addActionListener(e -> {
			displaySelectedCardDescription(cardVictim4);
		});

		this.card5 = new JButton(this.cardBack);
		// this.card5.setText(cardNameMatch(cardVictim5));
		this.card5.setBounds((minorArcanaRoll.getWidth() + 45) + (10 + CardWidth) * 4,
				(paneCenterBeyondLeft.getHeight() - 15 - CardLength), CardWidth, CardLength);
		this.paneCenterBeyondLeft.add(card5);
		card5.addActionListener(e -> {
			displaySelectedCardDescription(cardVictim5);
		});

		// p1
		card1.addActionListener(e -> {
			givePlayerTimeToRead(1);
			applyCardEffect(cardVictim1);
			Player1.healthRegulator(Player1.getHealthCount());
			this.effectOfCards = cardFX(cardVictim1);
			cardNumIconChange(cardVictim1, e);
		});
		card2.addActionListener(e -> {
			givePlayerTimeToRead(1);
			applyCardEffect(cardVictim2);
			Player1.healthRegulator(Player1.getHealthCount());
			this.effectOfCards = cardFX(cardVictim2);
			cardNumIconChange(cardVictim2, e);
		});
		card3.addActionListener(e -> {
			givePlayerTimeToRead(1);
			applyCardEffect(cardVictim3);
			Player1.healthRegulator(Player1.getHealthCount());
			this.effectOfCards = cardFX(cardVictim3);
			cardNumIconChange(cardVictim3, e);
		});
		card4.addActionListener(e -> {
			givePlayerTimeToRead(1);
			applyCardEffect(cardVictim4);
			Player1.healthRegulator(Player1.getHealthCount());
			this.effectOfCards = cardFX(cardVictim4);
			cardNumIconChange(cardVictim4, e);
		});
		card5.addActionListener(e -> {
			givePlayerTimeToRead(1);
			applyCardEffect(cardVictim5);
			Player1.healthRegulator(Player1.getHealthCount());
			this.effectOfCards = cardFX(cardVictim5);
			cardNumIconChange(cardVictim5, e);
		});

		// p2
		card1.addActionListener(e -> {
			givePlayerTimeToRead(1);
			applyCardEffect(cardVictim1);
			Player2.healthRegulator(Player2.getHealthCount());
			this.effectOfCards = cardFX(cardVictim1);
			cardNumIconChange(cardVictim1, e);
		});
		card2.addActionListener(e -> {
			givePlayerTimeToRead(1);
			applyCardEffect(cardVictim2);
			Player2.healthRegulator(Player2.getHealthCount());
			this.effectOfCards = cardFX(cardVictim2);
			cardNumIconChange(cardVictim2, e);
		});
		card3.addActionListener(e -> {
			givePlayerTimeToRead(1);
			applyCardEffect(cardVictim3);
			Player2.healthRegulator(Player2.getHealthCount());
			this.effectOfCards = cardFX(cardVictim3);
			cardNumIconChange(cardVictim3, e);
		});
		card4.addActionListener(e -> {
			givePlayerTimeToRead(1);
			applyCardEffect(cardVictim4);
			Player2.healthRegulator(Player2.getHealthCount());
			this.effectOfCards = cardFX(cardVictim4);
			cardNumIconChange(cardVictim4, e);
		});
		card5.addActionListener(e -> {
			givePlayerTimeToRead(1);
			applyCardEffect(cardVictim5);
			Player2.healthRegulator(Player2.getHealthCount());
			this.effectOfCards = cardFX(cardVictim5);
			cardNumIconChange(cardVictim5, e);
		});

		currentPlayer = 1;
		updateTurnIndicator();
		minorArcanaRoll.addActionListener(e -> {
			System.out.println("Player " + currentPlayer + " rolled for a minor arcana.");
			switchPlayer();
			updateTurnIndicator();
		});

		this.resultingFXDesc = new JLabel();
		this.resultingFXDesc.setForeground(Color.RED);
		this.resultingFXDesc.setFont(biggerText);

		this.resultingFXDesc.setText("<html><br><br><br><br>" + this.effectOfCards + "<html>");

		this.resultingFX = new JPanel();
		this.resultingFX.setBounds((minorArcanaRoll.getWidth() + 30), 30 + minorArcanaFull.getHeight(), ArcanaDescWidth,
				ArcanaDescLength + 130);
		this.resultingFX.setBackground(Color.BLACK);
		this.resultingFX.add(resultingFXDesc);
		this.paneCenterBeyondLeft.add(resultingFX);

		// main thing
		this.contentPane.add(paneLeftSide);
		this.contentPane.add(paneCenterBeyondLeft);

		this.setContentPane(contentPane);
		this.setSize(screenSize.width, screenSize.height);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);

		majorArcanaCards = new ArrayList<>();

		for (int i = 0; i < 13; i++) {
			majorArcanaCards.add(Cards.majorArcanaReadings(i));
		}

	}

	private void cardNumIconChange(int cardNum, ActionEvent e) {

		switch (cardNum) {

		case 0:
			ImageIcon arcanaRevealed0 = new ImageIcon("icons/fool.png");
			buttonFinder(arcanaRevealed0, e);
			break;
		case 1:
			ImageIcon arcanaRevealed1 = new ImageIcon("icons/magician.png");
			buttonFinder(arcanaRevealed1, e);
			break;
		case 2:
			ImageIcon arcanaRevealed2 = new ImageIcon("icons/high_priestess.png");
			buttonFinder(arcanaRevealed2, e);
			break;
		case 3:
			ImageIcon arcanaRevealed3 = new ImageIcon("icons/empress.png");
			buttonFinder(arcanaRevealed3, e);
			break;
		case 4:
			ImageIcon arcanaRevealed4 = new ImageIcon("icons/emperor.png");
			buttonFinder(arcanaRevealed4, e);
			break;
		case 5:
			ImageIcon arcanaRevealed5 = new ImageIcon("icons/heirophant.png");
			buttonFinder(arcanaRevealed5, e);
			break;
		case 6:
			ImageIcon arcanaRevealed6 = new ImageIcon("icons/lovers.png");
			buttonFinder(arcanaRevealed6, e);
			break;
		case 7:
			ImageIcon arcanaRevealed7 = new ImageIcon("icons/chariot.png");
			buttonFinder(arcanaRevealed7, e);
			break;
		case 8:
			ImageIcon arcanaRevealed8 = new ImageIcon("icons/strength.png");
			buttonFinder(arcanaRevealed8, e);
			break;
		case 9:
			ImageIcon arcanaRevealed9 = new ImageIcon("icons/hermit.png");
			buttonFinder(arcanaRevealed9, e);
			break;
		case 10:
			ImageIcon arcanaRevealed10 = new ImageIcon("icons/fortune.png");
			buttonFinder(arcanaRevealed10, e);
			break;
		case 11:
			ImageIcon arcanaRevealed11 = new ImageIcon("icons/justice.png");
			buttonFinder(arcanaRevealed11, e);
			break;
		case 12:
			ImageIcon arcanaRevealed12 = new ImageIcon("icons/hanged_man.png");
			buttonFinder(arcanaRevealed12, e);
			break;
		case 13:
			ImageIcon arcanaRevealed13 = new ImageIcon("icons/death.png");
			buttonFinder(arcanaRevealed13, e);
			break;

		}
	}

	private void buttonFinder(ImageIcon arcanaRevealed, ActionEvent e) {
		if (e.getSource() == card1) {
			this.card1.setIcon(arcanaRevealed);
		} else if (e.getSource() != card1) {
			this.card1.setIcon(this.cardBack);
		}

		if (e.getSource() == card2) {
			this.card2.setIcon(arcanaRevealed);
		} else if (e.getSource() != card2) {
			this.card2.setIcon(this.cardBack);
		}

		if (e.getSource() == card3) {
			this.card3.setIcon(arcanaRevealed);
		} else if (e.getSource() != card3) {
			this.card3.setIcon(this.cardBack);
		}

		if (e.getSource() == card4) {
			this.card4.setIcon(arcanaRevealed);
		} else if (e.getSource() != card4) {
			this.card4.setIcon(this.cardBack);
		}

		if (e.getSource() == card5) {
			this.card5.setIcon(arcanaRevealed);
		} else if (e.getSource() != card5) {
			this.card5.setIcon(this.cardBack);
		}
	}

	private void displayCardsOnSlots() {
		if (majorArcanaCards.size() >= 5) {
			minorArcanaDescription.setText("<html>" + majorArcanaCards.get(0) + "<br>" + majorArcanaCards.get(1)
					+ "<br>" + majorArcanaCards.get(2) + "<br>" + majorArcanaCards.get(3) + "<br>"
					+ majorArcanaCards.get(4) + "<html>");
		}
	}

	private void displaySelectedCardDescription(int index) {
		if (majorArcanaCards.size() > index) {
			minorArcanaDescription.setText(majorArcanaCards.get(index));
		}
	}

	private void shuffleCards() {
		Collections.shuffle(majorArcanaCards);
	}

	private void switchPlayer() {
		currentPlayer = (currentPlayer == 1) ? 2 : 1;
		minorArcanaDescription.setText("<html><br><br><br>ALL SHALL BE REVEALED<html>");
		updateTurnIndicator();
		shuffleCards();
	}

	private void updateTurnIndicator() {
		currentPlayerTurn
				.setText("<html><br/><br/><br/>Player " + currentPlayer + "'s Turn!<br/><br/><br/><br/><br/><html>");
	}

	private void applyCardEffect(int cardIndex) {

		int majorArcana = cardIndex / 13;
		int minorArcana = cardIndex % 4 + 1;
		int indexOfCombos = Player1.cardMatchAndIndex(majorArcana, minorArcana);

		Player1.indexAndAffect(indexOfCombos);

	}

	private void applyCardEffectP2(int cardIndex) {

		int majorArcana = cardIndex / 13;
		int minorArcana = cardIndex % 4 + 1;
		int indexOfCombos = Player2.cardMatchAndIndex(majorArcana, minorArcana);

		Player2.indexAndAffect(indexOfCombos);

	}

	private void updateHealthCount() {
		player1HPCount.setText("P1 | " + Player1.getHealthCount() + " / 100");
		player2HPCount.setText("P2 | " + Player2.getHealthCount() + " / 100");
	}

	private void ifOneLoses() {
		if (Player1.getHealthCount() <= 0) {
			resultingFXDesc.setText("PLAYER 2 WINS");
			minorArcanaDescription.setText("PLAYER 2 WINS");
			givePlayerTimeToRead(10);

			card1.setEnabled(false);
			card2.setEnabled(false);
			card3.setEnabled(false);
			card4.setEnabled(false);
			card5.setEnabled(false);
			minorArcanaRoll.setEnabled(false);

		}
		if (Player2.getHealthCount() <= 0) {
			resultingFXDesc.setText("PLAYER 1 WINS");
			minorArcanaDescription.setText("PLAYER 1 WINS");
			givePlayerTimeToRead(10);

			card1.setEnabled(false);
			card2.setEnabled(false);
			card3.setEnabled(false);
			card4.setEnabled(false);
			card5.setEnabled(false);
			minorArcanaRoll.setEnabled(false);
		}
	}

	public void givePlayerTimeToRead(int delay) {
		delay *= 100;
		try {
			Thread.sleep(delay);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		;
	}

	public String cardFX(int cardIndex) {
		int majorArcana = cardIndex / 13;
		int minorArcana = cardIndex % 4 + 1;
		int indexOfCombos = Player1.cardMatchAndIndex(majorArcana, minorArcana);
		String crdFX = "";

		switch (indexOfCombos) {

		// Fool
		case 0:
			crdFX = "Player is refilled to 0.5 of total HP";
			break;
		case 1:
			crdFX = "Opponent has 0.5 of current HP removed";
			break;
		case 2:
			crdFX = "Opponent has same amount of HP as player removed";
			break;
		case 3:
			crdFX = "Opponent has 0.5 of total HP removed";
			break;

		// Magician
		case 4:
			crdFX = "Deals psychic damage of 20 with stun";
			break;
		case 5:
			crdFX = "Deals lightning damage of 20 with shocked";
			break;
		case 6:
			crdFX = "Deals wind damage of 20";
			break;
		case 7:
			crdFX = "Deals fire damage of 20 with burned";
			break;

		// High Priestess
		case 8:
			crdFX = "Delivers healing of 10 HP";
			break;
		case 9:
			crdFX = "Deals wind damage of 10";
			break;
		case 10:
			crdFX = "Deals fire damage of 10 with burned";
			break;
		case 11:
			crdFX = "Deals psychic damage of 10 with stunned";
			break;

		// Empress
		case 12:
			crdFX = "Delivers HP of 25";
			break;
		case 13:
			crdFX = "Deals damage of 50";
			break;

		case 14:
			crdFX = "Deals psychic damage of 50 with stunned";
			break;

		case 15:
			crdFX = "Opponent has same amount of HP as player";
			break;

		// Emperor
		case 16:
			crdFX = "Delivers HP of 25";
			break;
		case 17:
			crdFX = "Deals base damage of 25";
			break;

		case 18:
			crdFX = "Deals base fire damage of 25 with burned";
			break;

		case 19:
			crdFX = "Delivers HP equal to current HP";
			break;

		// Heirophant
		case 20:
			crdFX = "Delivers HP of 1.5 times current HP";
			break;
		case 21:
			crdFX = "Deals damage of 1.5 times current HP";
			break;

		case 22:
			crdFX = "Deals fire damage of 1.5 times current HP with burned";
			break;

		case 23:
			crdFX = "Deals electric damage of 1.5 times current HP with shocked";
			break;

		// Lovers
		case 24:
			crdFX = "Delivers HP of 26";
			break;
		case 25:
			crdFX = "Deals damage of 39";
			break;

		case 26:
			crdFX = "Deals psychic damage of 39 with stunned";
			break;

		case 27:
			crdFX = "Fully heals player's HP";
			break;

		// Chariot
		case 28:
			crdFX = "Delivers HP of 7";
			break;
		case 29:
			crdFX = "Deals damage of 7";
			break;

		case 30:
			crdFX = "Deals psychic damage of 39 with stunned";
			break;

		case 31:
			crdFX = "Fully heals player's HP";
			break;

		// Strength
		case 32:
			crdFX = "Delivers HP of 26";
			break;
		case 33:
			crdFX = "Deals wind damage of 26";
			break;
		case 34:
			crdFX = "Deals damage of 26";
			break;
		case 35:
			crdFX = "Deals electric damage of 26 with shocked";
			break;

		// Hermit
		case 36:
			crdFX = "Delivers HP of 50";
			break;

		case 37:
			crdFX = "Deals damage of 50";
			break;

		case 38:
			crdFX = "Deals electric damage of 50 with shocked";
			break;

		case 39:
			crdFX = "Deals wind damage of 50";
			break;

		// Wheel Of Fortune
		case 40:
			crdFX = "Delivers 1.5 times current HP";
			break;

		case 41:
			crdFX = "Deals 2 times current HP worth of damage";
			break;
		case 42:
			crdFX = "Deals 1.5 times current HP worth of fire damage with burned";
			break;
		case 43:
			crdFX = "Delivers 1.5 times enemy's current HP";
			break;

		// Justice
		case 44:
			crdFX = "Delivers 1.5 times current HP";
			break;
		case 45:
			crdFX = "Deals 1.5 times current HP worth of damage";
			break;
		case 46:
			crdFX = "Deals 2 times current HP worth of psychic damage with stunned";
			break;
		case 47:
			crdFX = "Deals 2 times current HP worth of fire damage with burned";
			break;

		// Hanged Man
		case 48:
			crdFX = "Delivers HP 2 times current HP";
			break;

		case 49:
			crdFX = "Deals 1.5 times current HP worth of fire damage with burned";
			break;

		case 50:
			crdFX = "Deals 1.5 times current HP worth of electric damage with shocked";
			break;

		case 51:
			crdFX = "Deals 1.5 times current HP worth of psychic damage with stunned";
			break;

		// Death
		case 52:
			crdFX = "Sets current health to 99";
			break;

		case 53:
			crdFX = "Sets enemy's HP to 0.5 of your current HP";
			break;

		case 54:
			crdFX = "Sets both player's HP to 1";
			break;

		case 55:
			crdFX = "Sets current HP to 0.5 of current HP";
			break;

		}
		return crdFX;
	}

	public static void main(String[] args) {
		GameBoard app = new GameBoard();
	}
}
