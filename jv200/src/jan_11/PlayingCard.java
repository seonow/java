package jan_11;

public class PlayingCard {
	private Suit suit;
	private int rank;
	
	public PlayingCard(Suit suit, int rank) {
		this.suit = suit;
		this.rank = rank;
	}
	
	
	public Suit getSuit() {
		return this.suit;
	}
	
	public int getRank() {
		return this.rank;
	}
	
	public String getSuitName() {
		String name="";
		switch(suit) {
			case SPADE:
				name = "spade";
				break;
			case HEART:
				name = "heart";
				break;
			case CLUBS:
				name = "clubs";
				break;
			case DIAMONDS:
				name = "diamond";
				break;
			default:
				break;
			}
		return name;
	}
}
