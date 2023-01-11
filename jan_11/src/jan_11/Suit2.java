package jan_11;

public enum Suit2 {
	SPADE("Spade"),
	HEART("Heart"),
	CLUBS("Clubs"),
	DIAMONDS("Diamonds");
	
	private String name;
	private Suit2(String name) {
		//미리 만들기 때문에 외부에서 건들면 안되서 public이 아니라 private이 와야 한다
		this.name = name;
	}
	public String getName() {
		return name;
	}
}
