package PokerCards;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Poker extends JFrame {
	JPanel jp = new JPanel();
	JPanel jp2 = new JPanel();
	
	public Poker() {
		setTitle("Card Randomizer");
		setSize(1500,800);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		jp.setBackground(Color.GREEN);
		add(jp);
	}
	
	public static void main(String[] args) {
		Poker p = new Poker();
	}
}
