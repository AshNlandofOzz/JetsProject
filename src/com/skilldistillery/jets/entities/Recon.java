package com.skilldistillery.jets.entities;

public class Recon extends Jet implements Collecting{
	private String sensors;
	

	
	public Recon(String model, double speed, int range, long price, String sensors) {
		super(model, speed, range, price);
		this.sensors = sensors;
		
	}
	
	@Override
	public void Scanning() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Processing() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Relaying() {
		// TODO Auto-generated method stub
		
	}



}