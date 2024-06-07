package com.springcore.LifeCycle;

public class Pepsi {
	
	private double pprice;

	public double getPprice() {
		return pprice;
	}

	public void setPprice(double pprice) {
		this.pprice = pprice;
	}

	public Pepsi() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pepsi(double pprice) {
		super();
		this.pprice = pprice;
	}

	@Override
	public String toString() {
		return "Pepsi [pprice=" + pprice + "]";
	}
	
	
}
