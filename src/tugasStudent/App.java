package tugasStudent;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		//Create Array of Objects
		Students[] obj = new Students[3];
		
		// Create Objects
		obj[0] = new Students("Yoga", "Yoga", "Tangerang", 8);
		obj[1] = new Students("Wilham", "Dinata", "Jakarta", 6);
		obj[2] = new Students("Vicky", "Phang", "Jakarta", 4);
		
		//Initialitation Variable
		Scanner input = new Scanner (System.in);
		char exit;
		
		//Show Display
		do {
			//Print Display
			System.out.println("==================================================================");
			System.out.println("\t\t\t  Students Data");
			System.out.println("==================================================================");
			System.out.print("Show All Students Name (Y/N)? : ");
			
			//User Input
			char select = input.next().charAt(0);
			
			//Check User Input
			if(select == 'y' || select == 'Y') {
				
				//Print Display
				System.out.println("==================================================================");
				System.out.println("\t\t\t  Students");
				System.out.println("==================================================================");
				
				//Show Students Name
				for(int i = 0 ; i<2 ; i++) {
					//Print Index
					System.out.print(i+1 + ". ");
					//Print Full Name
					System.out.println(obj[i].getFullName());
				}
				System.out.println("==================================================================");
				
				//Print Display
				System.out.print("Show Student Details (Y/N)? : ");
				//User Input
				select = input.next().charAt(0);
				
				//Check User Input
				if(select == 'y' || select == 'Y') {
					
					//Print Display
					System.out.print("Index Number : ");
					//User Input
					int indexInput = input.nextInt();
					//Show Student Details
					obj[indexInput-1].show();
					
				}else {
					System.err.println("\n\t\t\t   Wrong Input!");
				}
				
			}else {
				System.err.println("\n\t\t\t   Wrong Input!");
			}
			
			//Print Display
			System.out.println("\n==================================================================");
			System.err.print("\n\t\t\t   Exit (Y/N)? ");
			//User Input
            exit = input.next().charAt(0);
            //For Spacing
            System.out.println();
            
		}while(exit == 'n' || exit == 'N'); //Check User Input
		
		//Close Scanner
		input.close();
	}
}
