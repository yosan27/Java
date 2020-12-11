package kasirArrayList;

import java.util.Scanner;

public class App{	
	public static void main(String[] args) {
		DataProcess cashier = new DataProcess("Yoga");
		 
		//Initialitation Variable
		Scanner input = new Scanner (System.in);
		char order;
	
		//Show Display
		do {
			//Print Display
			System.out.println("================================================================================");
			System.out.println("\t\t\t\t     CASHIER");
			System.out.println("================================================================================");
			System.out.println("1. COMBO MEALS");
			System.out.println("2. ALA CARTE");
			System.out.println("3. BEVERAGE");
			System.out.println("================================================================================");
			System.out.print("SELECT (1-3) : ");
			
			//User Input
			int select = input.nextInt();
			
			//Check User Input
			if(select <=3 && select != 0) {
				
				//Call Method				
				cashier.showMenu(select);
				
				//Print Display
				System.out.println("================================================================================");
				System.out.print("ORDER MENU : ");
				
				//User Input
				int menu = input.nextInt();
				
				//Print Display
				System.out.print("Quantity : ");
				
				//User Input
				int qty = input.nextInt();
				
				//Check User Input
				if(menu <= cashier.getData() && menu != 0) {
					
					//Print Display
					System.out.println("================================================================================");
					System.out.println("\t\t\t\t CUSTOMER ORDERS");
					System.out.println("================================================================================");
					
					//Call Method
					cashier.setFood(menu, qty);
					cashier.getFood(DataProcess.orderIndex+1);
					
					//Increment Customer Order Indexs					
					DataProcess.orderIndex++;
				}else {
					System.err.println("\n\t\t\t\t  Wrong Input!");
				}
				
			}else {
				System.err.println("\n\t\t\t\t  Wrong Input!");
			}
					
			//Print Display
			System.out.println("\n================================================================================");
			System.out.print("\n\t\t\t\tORDER MORE(Y/N)? ");
			
			//User Input
            order = input.next().charAt(0);
            
            //For Spacing
            System.out.println();
	        
		}while(order == 'Y' || order == 'y'); //Check User Input
		
		//If there is an Order
		if(DataProcess.orderIndex > 0) { 
			//Print Display
			System.out.println("================================================================================");
			System.out.println("Total\t\t: " + cashier.currency(cashier.sumOrder(), 0));
			System.out.print("Cash Tendered   : ");
			
			//User Input
			double cash = input.nextDouble();
			
			//Not Enough Cash
			while(cash < cashier.getTotal()) {
				//User Input
				System.out.println("\nNot Enough Cash");
				System.out.print("Cash Tendered   : ");
				cash = input.nextDouble();
			}
			
			//Print Receipt
			cashier.printReceipt(cash); 
		}else {
			System.err.println("\n\t\t\t\t    No Order!");
		}
		
		//Close Scanner
		input.close();
		

	}
}
	
