package com.springcore.Interfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean,DisposableBean {
	
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

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("init() start");
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("destory() start");
	}
	
	
}
