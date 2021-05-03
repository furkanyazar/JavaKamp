package Entities;

import java.util.ArrayList;

public class Order {
	
	private int id;
	private Gamer gamer;
	private ArrayList<Game> games;
	
	public Order() {
		
	}

	public Order(int id, Gamer gamer, ArrayList<Game> games) {
		super();
		this.id = id;
		this.gamer = gamer;
		this.games = games;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Gamer getGamer() {
		return gamer;
	}

	public void setGamer(Gamer gamer) {
		this.gamer = gamer;
	}

	public ArrayList<Game> getGames() {
		return games;
	}

	public void setGames(ArrayList<Game> games) {
		this.games = games;
	}

}
