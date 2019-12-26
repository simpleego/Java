import java.util.ArrayList;
import java.util.Collections;

// �ҽ��� �Է��ϰ� Ctrl+Shift+O�� ������ �ʿ��� ������ �����Ѵ�. 

class Card {
	String suit;
	String number;

	public Card(String suit, String number) {
		this.suit = suit;
		this.number = number;
	}

	public String toString() {
		return "(" + suit + " " + number + ")";
	}
}

class Deck {
	ArrayList<Card> deck = new ArrayList<Card>();
	String[] suit = { "CLUB", "DIAMOND", "HEART", "SPADE" };
	String[] number = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q",
			"K", "A" };

	// ī�带 �����Ͽ� ���� �ִ´�.
	public Deck() {
		// 52���� ī�带 ������ �մ� ���� �����.
		for (int i = 0; i < suit.length; i++)
			for (int j = 0; j < number.length; j++)
				deck.add(new Card(suit[i], number[j]));
	}

	// ī�带 ���´�.
	public void shuffle() {
		Collections.shuffle(deck);

	}

	// ���� ó������ ī�带 �����Ͽ��� ��ȯ�Ѵ�.
	public Card deal() {
		return deck.remove(0);
	}

}

class Player {
	ArrayList<Card> list = new ArrayList<Card>();

	public void getCard(Card card) {
		list.add(card);
	}

	public void showCards() {
		System.out.println(list);
	}
}

public class CardGame {
	public static void main(String[] args) {
		Deck deck = new Deck();
		deck.shuffle();
		Player p1 = new Player();
		Player p2 = new Player();
		p1.getCard(deck.deal());
		p2.getCard(deck.deal());
		p1.showCards();
		p2.showCards();
	}
}