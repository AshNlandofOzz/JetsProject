package com.skilldistillery.jets.entities;

public class Recon extends Jet implements Collecting{
	private String sensors;
	

	


	

	public String getSensors() {
		return sensors;
	}

	public void setSensors(String sensors) {
		this.sensors = sensors;
	}

	public Recon(String model, double speed, double range, double price, String sensors) {
		super(model, speed, range, price);
		this.sensors = sensors;
		
	}
	
	@Override
	public void Scanning() {
		System.out.println("Topographical imagery being collected");
		
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