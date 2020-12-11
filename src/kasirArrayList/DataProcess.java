package kasirArrayList;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class DataProcess extends Menu implements Receipt{
// 	Initialitation Variables
	private String name, amount;
	private int menuIndex, data; 
	private double net, tax, total;
	static int orderIndex=0;
	
//	Get Time
	LocalDateTime dateTime = LocalDateTime.now();
	DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
	String formatted = dateTime.format(format);
	
//	Arrays Orders
	private ArrayList<ArrayList<String>> ordersFood = new ArrayList<ArrayList<String>>();
	
// 	Array Description
	private ArrayList<String> description = new ArrayList<String>();
	
//	Constructor
	public DataProcess(String name) {
		this.name = name;
		description.add("Food Name\t: ");
		description.add("Price\t\t: ");
	}
	
	
	
//	Show Menu
	public void showMenu(int menuIndex) {
		//Set Customer Order Indexs
		this.menuIndex = menuIndex;
		
		//Print Display
		System.out.println("================================================================================");
		System.out.println("\t\t\t\t    MENU LIST");	
		System.out.println("================================================================================");
				
		//Looping for Multidimentional Array
		for(int a=menuIndex-1 ; a<menuIndex ; a++) { //Read arrays[Menu Index from parameter]
			for(int b=0 ; b<this.allMenu.get(a).size() ; b++){ //Read arrays[Menu Index][Menu]	
				System.out.print(b+1 + "."); //Print Index
				for(int c=0 ; c<this.allMenu.get(a).get(b).size() ; c++) { //Read arrays[Menu Index][Menu][Menu Details]	
					System.out.print("\t" + this.description.get(c)); //Print Description from Array
					
					//Check Loop Index
					if(c==0) {
						System.out.println(this.allMenu.get(a).get(b).get(c)); //Print Menu Foods
					}
					
					//Check Loop Index
					if(c==1) {
						//Convert String to Double
						double amount = Double.parseDouble(this.allMenu.get(a).get(b).get(c));
						//Print Menu Price
						System.out.println(this.currency(amount, 0));
					}
				}
				System.out.println(); //For Spacing	
			}
		}
		
		//Set Menu Details Length
		this.data = this.allMenu.get(menuIndex-1).size();
	}
	
	
	
//	Set Format Currency
	public String currency(double input, int type) {
		if(type == 0) this.amount = String.format("%,.0f", input).replaceAll(",", ".");
		else this.amount = String.format("%,64.0f", input).replaceAll(",", ".");
		
		return this.amount;
	}
	
	
	
//	Getter Int Data Order
	public int getData() {
		return this.data;
	}	
	
	
	
//	Setter Customer Order Foods
	public void setFood(int menuNumber, int qty) {
		//Looping for Multidimentional Array
		for(int a=this.menuIndex-1 ; a<this.menuIndex ; a++) { //Read arrays[Menu Index from parameter]
				for(int b=0 ; b<this.allMenu.get(a).size() ; b++){ //Read arrays[Menu Index][Menu]	
					for(int c=0 ; c<this.allMenu.get(a).get(b).size() ; c++) { //Read arrays[Menu Index][Menu][Menu Details]
						//Set Menu Details
						ordersFood.add(new ArrayList<String>());
						this.ordersFood.get(DataProcess.orderIndex).add(String.valueOf(qty)); //Quantity
						this.ordersFood.get(DataProcess.orderIndex).add(this.allMenu.get(a).get(menuNumber-1).get(0)); //Foods Name
						this.ordersFood.get(DataProcess.orderIndex).add(this.allMenu.get(a).get(menuNumber-1).get(1)); //Price
					}
				}
			}
	}
	
	
	
//	Getter Customer Order Foods
	public void getFood(int orderIndex) {
		//Looping for Multidimentional Array
		for(int j=0 ; j<orderIndex ; j++) { //Read arrays[Order Indexs]
			
			for(int i=0 ; i<this.ordersFood.get(j).size() ; i++) { //Read arrays[Order Indexs][Order Details]
				
				//Check Loop Index
				if(i==0) {
					//Show Customer Order Foods
					System.out.print(" " + this.ordersFood.get(j).get(i));
				}
				
				//Check Loop Index
				if(i==1) {
					//Show Customer Order Foods
					System.out.print("\t" + this.ordersFood.get(j).get(i)); 
					
					//Justify Price	
					if(this.ordersFood.get(j).get(i).length() > 40 && this.ordersFood.get(j).get(i).length() < 48 )
						System.out.print("\t\t");
					else if(this.ordersFood.get(j).get(i).length() > 48) System.out.print("\t");
					else if(this.ordersFood.get(j).get(i).length() < 8) System.out.print("\t\t\t\t\t\t\t");
					else System.out.print("\t\t\t\t\t\t");
				}
				
				//Check Loop Index
				if(i==2) {
					//Convert String to Double
					double amount = Double.parseDouble(this.ordersFood.get(j).get(i));
					amount *= Double.parseDouble(this.ordersFood.get(j).get(0));
					//Justify Price Length
					if(String.valueOf(amount).length() < 5)
						System.out.print("\t " + this.currency(amount, 0)); //Show Customer Order Price
					else System.out.print("\t" + this.currency(amount, 0)); ////Show Customer Order Price
					
				}
			}
			//For Spacing
			System.out.println();
		}
	}



//	Sum Net Sales
	public void sumNet() {
		//Looping for Multidimentional Array
			for(int j=0 ; j<DataProcess.orderIndex ; j++) { //Read arrays[Order Indexs]
				for(int i=0 ; i<this.ordersFood.get(j).size() ; i++) { //Read arrays[Order Indexs][Order Details]
					if(i==2) {
						double qty = (Double.parseDouble(this.ordersFood.get(j).get(2))*Double.parseDouble(this.ordersFood.get(j).get(0)));
						this.net += qty; //Sum Customer Order Price
					}
				}
			}
		}
	
	
	
//	Sum Order
	public double sumOrder() {
		this.sumNet();
		
		this.tax = (this.net*0.1);
		int round = (int)(this.tax + this.net);
		if(round % 10 > 0){
			for(int i = 0 ; i<9 ; i++) {
				if(round % 10 < 9)round+=1;
			}
			this.total = round+1;
		}else this.total = round;
		
		return this.total;
	}	
	
	
	
//	Getter Total
	public double getTotal() {
		return this.total;
	}
	
	
	
//	Implement Method
	@Override
	public void printReceipt(double cash) {	
		//Print Display
		System.out.println("");
		System.out.println("################################################################################\n");
		System.out.println("--------------------------------------------------------------------------------\n");
		System.out.println("\t\t\t\t    FAST FOODS");
		System.out.println("\t\t\t\t    Store #021");
		System.out.println("\n\t\t\t\t   TAX  INVOICE\n");
		System.out.println("********************************************************************************");
		
		//Print Crew Name
		System.out.print("Crew Id 17  " + this.name);
		
		//Print Date & Time
		System.out.println("\t\t\t\t\t     " + this.formatted);
		System.out.println("********************************************************************************");
		
		//Show Customer Orders
		this.getFood(DataProcess.orderIndex);
		
		//Round Change Ammount
		int change = (int)cash - (int)this.total;
		
		//Check Int Last Digit
		if(change % 10 == 1) {
			change -= 1;
		}
		
		System.out.println("\n");
		System.out.println("Eat-In Total  " + this.currency(this.total, 1));
		System.out.println("Cash Tendered " + this.currency(cash, 1));
		System.out.println("Change        " + this.currency(change, 1));
		System.out.println("");
		System.out.println("Tax (10%)    " + " " + this.currency(this.tax, 1));
		
		//Round Net Ammount
		int netRound = (int)this.net;
		
		//Check Int Last Digit
		if(netRound % 10 == 9) {
			netRound += 1;
		}
		System.out.println("Net Sales     " + this.currency(netRound, 1));
		System.out.println("\n--------------------------------------------------------------------------------");
	}
}


