package jan_11;

public class TestPlayingCard {
	public static void main(String[] args) {
		PlayingCard card = new PlayingCard(Suit.SPADE, 13);
		System.out.println("card : " + card.getSuitName() + "-" + card.getRank());
	}
//	PlayingCard card2 = new PlayingCard(47,2);
	
}

