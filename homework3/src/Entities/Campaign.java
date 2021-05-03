package Entities;

public class Campaign {
	
	private int id;
	private String name;
	private int discount;
	private Game game;
	
	public Campaign() {
		
	}

	public Campaign(int id, String name, int discount, Game game) {
		super();
		this.id = id;
		this.name = name;
		this.discount = discount;
		this.game = game;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

}
