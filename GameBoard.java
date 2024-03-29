import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicButtonListener;
import javax.swing.BorderFactory;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings({ "unused", "serial" })
public class GameBoard extends JFrame {

	// left side data
	private static final int HpBarWidth = 260;
	private static final int HpBarLength = 40;
	private static final int TurnIndicatorWidth = 290;
	private static final int TurnIndicatorHeight = 300;
	private static final int indicatorHealthBarWidth = 310;
	private static final int indicatorHealthBarHeight = 410;

	private JPanel indicatorHealthBar;
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
	
	private JPanel minorArcanaFull;
	private JButton minorArcanaRoll;
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
		this.contentPane.setSize(screenSize);
		this.contentPane.setLayout(null);
		Font smallText = new Font("Monospaced", Font.PLAIN, 14);
		Font bigText = new Font("Monospaced", Font.PLAIN, 20);
		Font biggerText = new Font("Monospaced", Font.BOLD, 28);

		// Left Panel
		this.paneLeftSide = new JPanel();
		this.paneLeftSide.setBounds(25, (screenSize.height - indicatorHealthBarSize.height) / 2,
				indicatorHealthBarSize.width, indicatorHealthBarSize.height);
		this.indicatorHealthBar = new JPanel();
		this.indicatorHealthBar.setLayout(null);
		this.indicatorHealthBar.setPreferredSize(indicatorHealthBarSize);
		this.indicatorHealthBar.setBackground(Color.DARK_GRAY);

		// player 1 health
		this.player1HPCount = new JLabel();
		this.player1HPCount.setText("P1 | " + Player1.healthCount + " / 100");
		this.player1HPCount.setFont(bigText);
		this.player1HPCount.setForeground(Color.WHITE);
		this.player1HPIndicator = new JPanel();
		this.player1HPIndicator.setBounds(25, 5, healthBarSize.width, healthBarSize.height);
		this.player1HPIndicator.setBackground(Color.BLUE);
		this.player1HPIndicator.add(player1HPCount);
		this.indicatorHealthBar.add(player1HPIndicator);

		// turn indicators
		this.currentPlayerTurn = new JLabel();
		this.currentPlayerTurn.setText("<html><br/><br/><br/>Player " + this.currentPlayer + "'s Turn!<html>");
		this.currentPlayerTurn.setFont(biggerText);
		this.turnIndicator = new JPanel();
		this.turnIndicator.add(currentPlayerTurn);
		this.turnIndicator.setBackground(Color.GRAY);
		this.turnIndicator.setBounds(10, (indicatorHealthBarSize.height - turnIndicatorUprightSize.height) / 2 - 3,
				turnIndicatorUprightSize.width, turnIndicatorUprightSize.height);
		this.indicatorHealthBar.add(turnIndicator);

		// player 2 health
		this.player2HPCount = new JLabel();
		this.player2HPCount.setText("P2 | " + Player2.healthCount + " / 100");
		this.player2HPCount.setFont(bigText);
		this.player2HPCount.setForeground(Color.WHITE);
		this.player2HPIndicator = new JPanel();
		this.player2HPIndicator.setBounds(25, (indicatorHealthBarSize.height + turnIndicatorUprightSize.height) / 2 + 5,
				healthBarSize.width, healthBarSize.height);
		this.player2HPIndicator.setBackground(Color.RED);
		this.player2HPIndicator.add(player2HPCount);
		this.indicatorHealthBar.add(player2HPIndicator);

		this.paneLeftSide.add(indicatorHealthBar);

		// Beyond Left Panel
		this.paneCenterBeyondLeft = new JPanel();
		this.paneCenterBeyondLeft.setLayout(null);
		this.paneCenterBeyondLeft.setBackground(Color.GRAY);
		this.paneCenterBeyondLeft.setBounds(indicatorHealthBarSize.width + 35, 15,
				(screenSize.width - 65 - indicatorHealthBarSize.width), screenSize.height - 70);

		// choosing between each minor arcana
		this.minorArcanaRoll = new JButton();
		this.minorArcanaRoll.setText("Cast Die");
		this.minorArcanaRoll.setFont(biggerText);
		this.minorArcanaRoll.setBounds(15, (paneCenterBeyondLeft.getHeight() - ArcanaRollWidthAndHeight) / 2 - 15,
				ArcanaRollWidthAndHeight, ArcanaRollWidthAndHeight);
		this.paneCenterBeyondLeft.add(minorArcanaRoll);

		// showing the result of the minor arcana roll
		this.minorArcanaRollResultText = new JLabel();
		this.minorArcanaRollResultText.setForeground(Color.WHITE);
		this.minorArcanaRollResultText.setFont(smallText);
		int minorSuit = 1;

		if (minorSuit == 1) {
			this.minorArcanaRollResultText.setText("> Minor Suit: Cups");
		} else if (minorSuit == 2) {
			this.minorArcanaRollResultText.setText("> Minor Suit: Swords");
		} else if (minorSuit == 3) {
			this.minorArcanaRollResultText.setText("> Minor Suit: Coins");
		} else if (minorSuit == 4) {
			this.minorArcanaRollResultText.setText("> Minor Suit: Wands");
		}

		this.minorArcanaRollResult = new JPanel();
		this.minorArcanaRollResult.setBackground(Color.BLACK);
		this.minorArcanaRollResult.setBounds(15, (paneCenterBeyondLeft.getHeight()) / 2 + 80, ArcanaRollWidthAndHeight,
				40);
		this.minorArcanaRollResult.add(minorArcanaRollResultText);
		this.paneCenterBeyondLeft.add(minorArcanaRollResult);

		// showing potential status effects
		this.potentialFXDesc = new JLabel();
		this.potentialFXDesc.setForeground(Color.WHITE);
		this.potentialFXDesc.setFont(smallText);
		this.potentialFXDesc.setText(
				"<html> >isStunned | " + Effect.isStunned
				+ "<br/> >isBurning | " + Effect.isBurning
				+ "<br/> >isShocked | " + Effect.isShocked + "<html>");
		
		this.potentialFX = new JPanel();
		this.potentialFX.setBackground(Color.BLACK);
		this.potentialFX.setBounds(15, (paneCenterBeyondLeft.getHeight()) / 2 + 140, ArcanaRollWidthAndHeight,
				80);
		this.potentialFX.add(potentialFXDesc);
		this.paneCenterBeyondLeft.add(potentialFX);
		
		// description of each cards' effects
		this.minorArcanaDescription = new JLabel();
		this.minorArcanaDescription.setFont(bigText);
		this.minorArcanaDescription.setText(Cards.majorArcanaReadings(0));
		this.minorArcanaFull = new JPanel();
		this.minorArcanaFull.setBounds((minorArcanaRoll.getWidth() + 30), 15, ArcanaDescWidth, ArcanaDescLength);
		this.minorArcanaFull.setBackground(Color.WHITE);
		this.minorArcanaFull.add(minorArcanaDescription);
		this.paneCenterBeyondLeft.add(minorArcanaFull);

		// cards
		this.card1 = new JButton();
		this.card1.setText("CARD I");
		this.card1.setBounds((minorArcanaRoll.getWidth() + 45), (paneCenterBeyondLeft.getHeight() - 15 - CardLength),
				CardWidth, CardLength);
		this.paneCenterBeyondLeft.add(card1);
		this.card2 = new JButton();
		this.card2.setText("CARD II");
		this.card2.setBounds((minorArcanaRoll.getWidth() + 45) + (10 + CardWidth), (paneCenterBeyondLeft.getHeight() - 15 - CardLength),
				CardWidth, CardLength);
		this.paneCenterBeyondLeft.add(card2);
		this.card3 = new JButton();
		this.card3.setText("CARD III");
		this.card3.setBounds((minorArcanaRoll.getWidth() + 45) + (10 + CardWidth) * 2, (paneCenterBeyondLeft.getHeight() - 15 - CardLength),
				CardWidth, CardLength);
		this.paneCenterBeyondLeft.add(card3);
		this.card4 = new JButton();
		this.card4.setText("CARD IV");
		this.card4.setBounds((minorArcanaRoll.getWidth() + 45) + (10 + CardWidth) * 3, (paneCenterBeyondLeft.getHeight() - 15 - CardLength),
				CardWidth, CardLength);
		this.paneCenterBeyondLeft.add(card4);
		this.card5 = new JButton();
		this.card5.setText("CARD V");
		this.card5.setBounds((minorArcanaRoll.getWidth() + 45) + (10 + CardWidth) * 4, (paneCenterBeyondLeft.getHeight() - 15 - CardLength),
				CardWidth, CardLength);
		this.paneCenterBeyondLeft.add(card5);

		// showing the resulting effect
		this.resultingFXDesc = new JLabel();
		this.resultingFXDesc.setForeground(Color.RED);
		this.resultingFXDesc.setFont(biggerText);
		this.resultingFXDesc.setText("T B D");
		this.resultingFX = new JPanel();
		this.resultingFX.setBounds((minorArcanaRoll.getWidth() + 30), 30 + minorArcanaFull.getHeight(), ArcanaDescWidth, ArcanaDescLength + 130);
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

	}

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		GameBoard app = new GameBoard();
	}
}
