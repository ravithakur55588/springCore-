package com.springcore.Interfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Samosa implements InitializingBean,DisposableBean {
	
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

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("init start()");
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("destory start()");
	}
	
	
}
