package jan_11;

public class TestPlayingCard2 {
	public static void main(String[] args) {
		PlayingCard2 card1 = new PlayingCard2(Suit2.SPADE, 13);
		System.out.println("card : " + card1.getSuit().getName() + "-" + card1.getRank());

	}

	
}

