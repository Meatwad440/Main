/*		Week 4 lab assignment
		Author Nick HUtson
*/

import java.util.Random;

public class Card {

	private String suit;
	private String face;

	//Generation of 5 cards
	
	public Card(String suit, String face) {
		this.suit = suit;
		this.face = face;
	}

	public String getSuit() {
		return suit;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}

	public String getFace() {
		return face;
	}

	public void setFaceValue(String face) {
		this.face = face;
	}

	public String toString() {
		return "Card{" + "suit='" + suit + '\'' + ", faceValue=" + face + '}';
	}

	//card values
	
	public static void main(String[] args) {

		String[] suits = { "Spade", "Club", "Heart", "Diamond" };
		String[] faceValues = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

	//Selection of random card
		
		Random random = new Random();
		for (int i = 1; i <= 5; i++) {
			Card card = new Card(suits[random.nextInt(suits.length)], faceValues[random.nextInt(faceValues.length)]);
			System.out.println(card);
		}
	}
}
