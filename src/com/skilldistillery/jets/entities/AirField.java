package com.skilldistillery.jets.entities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.skilldistillery.jets.entities.Jet;

public class AirField {
	private List<Jet> myAirfield = new ArrayList<>();

	public AirField() {

	}

	public List<Jet> getAirfield() {
		return myAirfield;
	}

	public void setAirfield(List<Jet> airfield) {
		this.myAirfield = airfield;
	}

	public void addJet(Jet j) {
		myAirfield.add(j);
	}

	public void readFromFile() {
		try {
			FileReader fr = new FileReader("jets.txt");
			BufferedReader br = new BufferedReader(fr);
			String line;
			while ((line = br.readLine()) != null) {
				String[] splitLine = line.split(",");
				Jet thisJet = null;
				if (splitLine[0].equalsIgnoreCase("Fighter")) {
					thisJet = new Fighter(splitLine[1], Double.parseDouble(splitLine[2]),
							Double.parseDouble(splitLine[3]), Double.parseDouble(splitLine[4]), splitLine[5]);
				}
				else if (splitLine[0].equalsIgnoreCase("Recon")) {
					thisJet = new Recon(splitLine[1], Double.parseDouble(splitLine[2]),
							Double.parseDouble(splitLine[3]), Double.parseDouble(splitLine[4]), splitLine[5]);
				}
				else if (splitLine[0].equalsIgnoreCase("Troop Transport")) {
					thisJet = new TroopTransport(splitLine[1], Double.parseDouble(splitLine[2]),
							Double.parseDouble(splitLine[3]), Double.parseDouble(splitLine[4]));
				}
				myAirfield.add(thisJet);
				System.out.println(thisJet); //
			}
			br.close();
		} catch (FileNotFoundException e) {
			System.err.println("Invalid filename: " + e.getMessage());
			return;
		} catch (IOException e) {
			System.err.println("Problem while reading names.txt " + " : " + e.getMessage());
			return;
		}
	}
	
	public void addJetByUser() {
		Scanner scan = new Scanner(System.in);
		//System.out.println("Please input type of aircraft: TYPE IN Fighter, Troop Transport, or Recon.");
		//String userInType = scan.nextLine();
		System.out.print("Model: ");
		String userInModel = scan.nextLine();
		System.out.print("Speed: ");
		double userInSpeed = scan.nextDouble();
		scan.nextLine();
		System.out.print("Range: ");
		double userInRange = scan.nextDouble();
		scan.nextLine();
		System.out.print("Price: ");
		double userInPrice = scan.nextDouble();
		scan.nextLine();
		System.out.println("Please input type of aircraft by selecting from the menu below: ");
		System.out.println("-----------------------------------");
		System.out.println("|1. Fighter                       |");
		System.out.println("|2. Recon                         |");
		System.out.println("|3. Troop Transport               |");
		System.out.println("-----------------------------------");
		int option = scan.nextInt();
		Jet userJet = null;
		scan.nextLine();
		switch (option) {
		case 1:
			System.out.println("Please enter whether weapons are air-air or air-sea by typing 'air-air' or 'air-sea'");
			String userInWeapon = scan.nextLine();
			userJet = new Fighter(userInModel, userInSpeed, userInRange, userInPrice, userInWeapon);
			break;
		case 2:
			System.out.println("Please enter whether sensors are topographical or listening by typing 'topographical' or 'listening'");
			String userInSensors = scan.nextLine();
			userJet = new Recon(userInModel, userInSpeed, userInRange, userInPrice, userInSensors);
			break;
		case 3:
			userJet = new TroopTransport(userInModel, userInSpeed, userInRange, userInPrice);
			break;}
		//Jet userJet = null;
		//while (userInType != null) {
//		if (userInType.equalsIgnoreCase("fighter")) {
//			System.out.println("Please enter whether weapons are air-air or air-sea by typing 'air-air' or 'air-sea'");
//			String userInWeapon = scan.nextLine();
//			userJet = new Fighter(userInModel, userInSpeed, userInRange, userInPrice, userInWeapon);
//		}
//		if (userInType.equalsIgnoreCase("recon")) {
//			System.out.println("Please enter whether sensors are topographical or listening by typing 'topographical' or 'listening'");
//			String userInSensors = scan.nextLine();
//			userJet = new Recon(userInModel, userInSpeed, userInRange, userInPrice, userInSensors);
//		}
//		if (userInType.equalsIgnoreCase("troop transport")) {
//			userJet = new TroopTransport(userInModel, userInSpeed, userInRange, userInPrice);
//		}
		//else {
//			System.out.println("That is not a valid jet type. Try again:");
//			System.out.println("Please input type of aircraft: TYPE IN Fighter, Troop Transport, or Recon.");
//			userInType = scan.nextLine();
//		}
		//}
		
		myAirfield.add(userJet);
	}
}
//add
//remove in here?
//this interacts with JetsApplication
