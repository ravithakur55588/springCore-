package com.springcore.LifeCycle;

public class Samosa {
	
	private int sprice;

	public int getSprice() {
		return sprice;
	}

	public void setSprice(int sprice) {
		this.sprice = sprice;
	}

	public Samosa() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Samosa(int sprice) {
		super();
		this.sprice = sprice;
	}

	@Override
	public String toString() {
		return "Samaosa [sprice=" + sprice + "]";
	}
	
	
}
