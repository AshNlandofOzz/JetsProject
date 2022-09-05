package com.skilldistillery.jets.app;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.skilldistillery.jets.entities.AirField;
import com.skilldistillery.jets.entities.Fighter;
import com.skilldistillery.jets.entities.Recon;
import com.skilldistillery.jets.entities.TroopTransport;
import com.skilldistillery.jets.entities.Jet;

public class JetsApplication {
	private AirField myAirField = new AirField();
	List<Jet> currentJets = myAirField.getAirfield();
	Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		JetsApplication thisJetsApplication = new JetsApplication();
		thisJetsApplication.launch();
	}

	public void launch() {
		myAirField.readFromFile();
		mainMenu();
		scan.close();
	}

	public void mainMenu() {
		int option = 0;
		while (option != 9) {
		System.out.println("-----------------------------------");
		System.out.println("|1. List fleet                    |");
		System.out.println("|2. Fly all jets                  |");
		System.out.println("|3. View Fastest Jet              |");
		System.out.println("|4. View Jet with Longest Range   |");
		System.out.println("|5. Utilize Recon Scan            |"); 
		System.out.println("|6. Weaponry Locked               |"); 
		System.out.println("|7. Add jet to Fleet              |");
		System.out.println("|8. Remove a jet from Fleet       |");
		System.out.println("|9. Quit                          |");
		System.out.println("-----------------------------------");
			System.out.println("Please select an option: ");
			option = scan.nextInt();
			scan.nextLine();
			switch (option) {
			case 1:
				listJets();
				break;
			case 2:
				flyAllJets();
				break;
			case 3:
				fastestJet();
				break;
			case 4:
				longestRangeJet();
				break;
			case 5:
				for (Jet jet : currentJets) {
					if (jet instanceof Recon) {
						System.out.println(jet.getModel());
					((Recon) jet).Scanning();
					}
					}
				break;
			case 6:
				for (Jet jet : currentJets) {
				if (jet instanceof Fighter) {
					System.out.println(jet.getModel());
				((Fighter) jet).weaponryTargeted();
				}
				}
				break;
			case 7:
				myAirField.addJetByUser();
				break;
			case 8:
				System.out.println("You have selected to remove a Jet from the airfield inventory");
				System.out.println("Please select from the current list");
				for (int i = 0; i < currentJets.size(); i ++) {
					System.out.println(i + " - " + currentJets.get(i));
				}
				int userRemove = scan.nextInt();
				scan.nextLine();
				if (userRemove >= 0 && userRemove < currentJets.size()-1) {
					currentJets.remove(userRemove);
				}
				if (userRemove > currentJets.size()) {
					System.out.println("That is not a valid option. Try again");
				}
				break;
			case 9:
				System.out.println("You entered quit. Thank you for participating. Goodbye. ");
				break;
			default:
				System.out.println("That's not an option, Try again. ");
				break;
			}
		}
	}

	public void fastestJet() {
		Jet fastestJet = currentJets.get(0);
		for (Jet j : currentJets) {
			if (j.getSpeed() > fastestJet.getSpeed()) {
				fastestJet = j;
			}
		}
		System.out.println("The fastest jet is: \n" + fastestJet.toString());
	}

	public void listJets() {
		for (Jet j : currentJets) {
			System.out.println(j.toString());
		}
	}

	public void longestRangeJet() {
		Jet longestRangeJet = currentJets.get(0);
		for (Jet j : currentJets) {
			if (j.getRange() > longestRangeJet.getRange()) {
				longestRangeJet = j;
			}
		}
		System.out.println("The longest range jet is: \n" + longestRangeJet.toString());
	}

	public void flyAllJets() {
		System.out.println("The jets have taken off.");
		for (Jet jet : currentJets) {
			jet.fly();
			
		}
	}

	

}
