package Entities;

import java.util.ArrayList;

public class Game {
	
	private int id;
	private String name;
	private double price;
	private ArrayList<Campaign> campaigns;
	
	public Game() {
		
	}

	public Game(int id, String name, double price, ArrayList<Campaign> campaigns) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.campaigns = campaigns;
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public ArrayList<Campaign> getCampaigns() {
		return campaigns;
	}

	public void setCampaigns(ArrayList<Campaign> campaigns) {
		this.campaigns = campaigns;
	}
	
}
