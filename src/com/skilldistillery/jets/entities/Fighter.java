package com.skilldistillery.jets.entities;

public class Fighter extends Jet implements BattleReady {


	
	private String weaponsLoadOut;

	public Fighter(String model, double speed, double range, double price, String weaponsLoadOut) {
		super(model, speed, range, price);
		this.weaponsLoadOut = weaponsLoadOut;
	}

	public String getWeaponsLoadOut() {
		return weaponsLoadOut;
	}

	public void setWeaponsLoadOut(String weaponsLoadOut) {
		this.weaponsLoadOut = weaponsLoadOut;
	}

	@Override
	public void readyForChase() {
		System.out.println("Coming to fullspeed and tracking target.");	
	} //This was not used in this exercise but menu in application could 
	//be expanded to use this when fighter are in flight

	@Override
	public void weaponryTargeted() {
		System.out.println("Locked on to target with loadout.");	
	}
	

}
