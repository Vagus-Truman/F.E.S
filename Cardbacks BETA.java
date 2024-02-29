
// This should produce a window the card the player has chosen
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Font;

public class Cardbacks extends JPanel {

	public Cardbacks() {
		JFrame frame = new JFrame("Tarot Card");
		frame.setSize(450, 750);
		frame.add(new Drawing());
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		new Cardbacks();
	}

	@SuppressWarnings("serial")
	class Drawing extends JComponent {
		public void paint(Graphics g) {
			Graphics2D g2 = (Graphics2D) g;
			Font desiredFontNumber = new Font("Times New Roman", Font.BOLD, 96);
			Font desiredFontTitle = new Font("Times New Roman", Font.PLAIN, 48);

			/*
			g2.setColor(Color.BLACK);
			g2.fillRect(10, 10, 410, 690);
			g2.setColor(Color.WHITE);
			g2.fillRect(25, 25, 380, 660);
			*/

			//fool
			/*
			g2.setFont(desiredFontNumber);
			g2.drawString("Ø", 175, 350);
			g2.setFont(desiredFontTitle);
			g2.drawString("The Fool", 130, 425);
			 */
			
			//magician
			/*
			g2.setFont(desiredFontNumber);
			g2.drawString("I", 200, 350);
			g2.setFont(desiredFontTitle);
			g2.drawString("The Magician", 90, 425);
			 */
			
			//high priestess
			/*
			g2.setFont(desiredFontNumber);
			g2.drawString("II", 190, 350);
			g2.setFont(desiredFontTitle);
			g2.drawString("The High Priestess", 45, 425);
			 */
			
			//empress
			/*
			g2.setFont(desiredFontNumber);
			g2.drawString("III", 160, 350);
			g2.setFont(desiredFontTitle);
			g2.drawString("The Empress", 100, 425);
			 */
			
			//emperor
			/*
			g2.setFont(desiredFontNumber);
			g2.drawString("IV", 170, 350);
			g2.setFont(desiredFontTitle);
			g2.drawString("The Emperor", 100, 425);
			 */
			
			
			//heirophant
			/*
			g2.setFont(desiredFontNumber);
			g2.drawString("V", 190, 350);
			g2.setFont(desiredFontTitle);
			g2.drawString("The Heirophant", 70, 425);
			 */
			
			
			//lovers
			/*
			g2.setFont(desiredFontNumber);
			g2.drawString("VI", 170, 350);
			g2.setFont(desiredFontTitle);
			g2.drawString("The Lovers", 120, 425);
			 */
			
			//chariot
			/*
			g2.setFont(desiredFontNumber);
			g2.drawString("VII", 150, 350);
			g2.setFont(desiredFontTitle);
			g2.drawString("The Chariot", 110, 425);
			 */
			
			//strength
			/*
			g2.setFont(desiredFontNumber);
			g2.drawString("VIII", 135, 350);
			g2.setFont(desiredFontTitle);
			g2.drawString("Strength", 150, 425);
			 */
			
			//hermit
			/*
			g2.setFont(desiredFontNumber);
			g2.drawString("IX", 165, 350);
			g2.setFont(desiredFontTitle);
			g2.drawString("The Hermit", 110, 425);
			 */
			
			//fortune
			/*
			g2.setFont(desiredFontNumber);
			g2.drawString("X", 185, 350);
			g2.setFont(desiredFontTitle);
			g2.drawString("Wheel Of Fortune", 55, 425);
			 */
			
			//justice
			/*
			g2.setFont(desiredFontNumber);
			g2.drawString("XI", 165, 350);
			g2.setFont(desiredFontTitle);
			g2.drawString("Justice", 150, 425);
			 */
			
			//hanged man
			/*
			g2.setFont(desiredFontNumber);
			g2.drawString("XII", 145, 350);
			g2.setFont(desiredFontTitle);
			g2.drawString("The Hanged Man", 50, 425);
			 */
			
			//death
			/*
			g2.setFont(desiredFontNumber);
			g2.drawString("XIII", 130, 350);
			g2.setFont(desiredFontTitle);
			g2.drawString("Death", 160, 425);
			 */
		} 
	}
}
