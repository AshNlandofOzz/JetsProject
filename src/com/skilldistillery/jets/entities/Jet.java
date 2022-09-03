package com.skilldistillery.jets.entities;

public abstract class Jet {
	private String model;
	private double speed;
	private int range;
	private long price;

	
	public void fly(Jet j) {
		System.out.println(j.toString());
		System.out.println("The amount of flight time in hours is: " + calculateRange(j));
	}
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public Jet(String model, double speed, int range, long price) {
		
}


	public String toString() {
		return "Jet [model=" + model + ", speed=" + speed + ", range=" + range + ", price=" + price + "]";
	}
	
	public double calculateRange (Jet j) {
		double totalRange = this.range / this.speed;
		return totalRange;
		
	}
	

	
}
