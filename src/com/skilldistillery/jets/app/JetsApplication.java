package com.skilldistillery.jets.app;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;
import java.util.Scanner;


public class JetsApplication {

	public static void main(String[] args) {
		JetsApplication thisJetsApplication = new JetsApplication();
		thisJetsApplication.readFromFile("jets.txt");
	}
		
//		Scanner scan = new Scanner(System.in);
//		int option = 0;
//		while (option != 9) {
//			System.out.println("Please select an option: ");
//			thisJetsApplication.MainMenu();
//			option = scan.nextInt();
//			switch (option) {
//			case 1:
//				
//				break;
//			case 2:
//				//thisJetsApplication.flyAllJets();
//				break;
//			case 3:
//				//thisJetsApplication.fastestJest();
//				break;
//			case 4:
//				
//				break;
//			case 5:
//				
//				break;
//			case 6:
//				
//				break;
//			case 7:
//				
//				
//			break;
//			case 8:
//				
//				break;
//			case 9:
//				System.out.println("You entered quit. Thank you for participating. Goodbye. ");
//				break;
//			default:
//				System.out.println("That's not an option, Try again. ");
//				break;
//			}
//		}
//		scan.close();
//		// TODO Auto-generated method stub
//
//	}
//	}

	
	//public void MenuLoop{
	//}
	
	public void MainMenu() {
		System.out.println("--------------------------------");
		System.out.println("1. List fleet");
		System.out.println("2. Fly all jets");
		System.out.println("3. View Fastest Jet");
		System.out.println("4. View Jet with Longest Range");
		System.out.println("5. Utilize Recon Scan");   //custom to me
		System.out.println("6. Ready for Chase");		//custom to me
		System.out.println("7. Add jet to Fleet");
		System.out.println("8. Remove a jet from Fleet");
		System.out.println("9. Quit");
		System.out.println("--------------------------------");
	}
	
	public void readFromFile(String fileName) {
		try {
			FileReader fr = new FileReader("jets.txt");
			BufferedReader br = new BufferedReader(fr);
			String line;
			while ((line = br.readLine()) != null) {
				String[] splitLine = line.split(",");
				System.out.println(splitLine[1] + " " + splitLine[2]); //
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
}

