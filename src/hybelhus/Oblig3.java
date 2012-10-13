package hybelhus;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Oblig3 {
	
	static Block utsyn;
	
	public static void main(String[] args) {
		System.out.println("Oh hi.");
		
		initialise();
		enterLoop();
		
		System.out.println("The program has been terminated.");
		
	}
	
	static void initialise() {
		try {
			BufferedReader in = new BufferedReader(new FileReader("hybeldata.txt"));
			
			in.close();
		
			int dormsPerFloor = 6, numberOfFloors = 3;
			Floor[] floors = new Floor[numberOfFloors];
			
			for (int floor = 0; floor < floors.length; floor++) {
				Dormitory[] dormitories = new Dormitory[dormsPerFloor];
				
				for (int dormitory = 0; dormitory < dormsPerFloor; dormitory++) {
					dormitories[dormitory] = new Dormitory("" + (floor + 1) + (char) ((int) 'A' + dormitory));
				}
				
				// Top floor costs 7000 NOK/month
				floors[floor] = new Floor(dormitories, floor == floors.length - 1 ? 7000 : 6000);
			}
			
			utsyn = new Block("Utsyn", floors, 1200, 1700);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	static void enterLoop() {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		String selection = "";
		
		loop: do {
			listOptions();
			
			switch (selection = in.nextLine()) {
			case "1" :
				utsyn.printOverview();
				break;
			case "8" :
//				utsyn.writeDataToFile();
				break;
			default:
				System.out.println("Please select a proper option.");
				continue loop;
			}
		} while (!selection.equals("8"));
	}
	
	static void listOptions() {
		System.out.println("1. Print overview");
		System.out.println("2. Register new tenant");
		System.out.println("3. Register payment from tenant");
		System.out.println("4. Register voluntary move");
		System.out.println("5. Monthly run-through");
		System.out.println("6. Throw tenant out");
		System.out.println("7. Raise rent");
		System.out.println("8. Cancel");
	}
}
