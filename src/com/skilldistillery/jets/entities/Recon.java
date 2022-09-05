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
		// This was not utilized during this exercise but the Application menu could 
		// be expanded so the user can utilize other scanners from their aircraft 	
	}

	@Override
	public void Relaying() {
		// See above note, same principle applies.		
	}



}