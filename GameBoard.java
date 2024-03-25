import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Image;

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

public class GameBoard extends JFrame{

	// shapes
	private static final int MainScreenWidth = 1920;
	private static final int MainScreenLength = 1080;
	private static final int TurnIndicatorRadius = 300;
	private static final int CardWidth = 140;
	private static final int CardLength = 240;
	private static final int ArcanaDescWidth = 180;
	private static final int ArcanaDescLength = 240;
	private static final int ArcanaRollWidthAndHeight = 170;
	private static final int HpBarWidth = 200;
	private static final int HpBarLength = 40;

	// texts where texts are needed
	private JLabel player1HPIndicator;
	private JLabel player2HPIndicator;
	private JLabel minorArcanaDescription;
	private JLabel currentPlayerTurn;
	private int currentPlayer;

	// jraphics cards
	private JPanel contentPane;
	private JPanel cards;
	private JPanel turnIndicator;

	private JPanel minorArcanaFull;
	private JPanel minorArcanaRoll;

	private JPanel currentPlayerHand;
	private JPanel otherPlayerHand;
	private JPanel currentPlayerHP;
	private JPanel otherPlayerHP;

	public GameBoard() {
		// TODO Auto-generated constructor stub
		this.currentPlayer = 1;
		this.setTitle("All Shall Be Revealed");
		this.contentPane = new JPanel();
		this.contentPane.setSize(MainScreenWidth, MainScreenLength);
		Font bigText = new Font("Monospaced", Font.BOLD, 24);

		// turn indicators
		this.turnIndicator = new JPanel();
		this.currentPlayerTurn = new JLabel();
		this.currentPlayerTurn.setText("\n"
				+ "\n"
				+ "Player " + this.currentPlayer + "'s Turn!"
						+ "\n"
						+ "\n");
		this.currentPlayerTurn.setFont(bigText);
		this.turnIndicator.setSize(TurnIndicatorRadius, TurnIndicatorRadius);
		this.turnIndicator.setBackground(Color.gray);
		this.turnIndicator.add(currentPlayerTurn, BorderLayout.CENTER);
		this.contentPane.add(turnIndicator, BorderLayout.CENTER);
		
		this.setContentPane(this.contentPane);
		this.setSize(MainScreenWidth, MainScreenLength);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);

	}

	public static void main(String[] args) {
		GameBoard app = new GameBoard();
	}

}
