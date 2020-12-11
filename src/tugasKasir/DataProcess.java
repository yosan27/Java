package tugasKasir;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

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
	private String[][] ordersFood = new String[10][3];
	
// 	Array Description
	private String [] description = {"Food Name\t: ", "Price\t\t: "};
	
//	Constructor
	public DataProcess(String name) {
		this.name = name;
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
			for(int b=0 ; b<this.allMenu[a].length ; b++){ //Read arrays[Menu Index][Menu]	
				System.out.print(b+1 + "."); //Print Index
				for(int c=0 ; c<this.allMenu[a][b].length ; c++) { //Read arrays[Menu Index][Menu][Menu Details]	
					System.out.print("\t" + this.description[c]); //Print Description from Array
					
					//Check Loop Index
					if(c==0) {
						System.out.println(this.allMenu[a][b][c]); //Print Menu Foods
					}
					
					//Check Loop Index
					if(c==1) {
						//Convert String to Double
						double amount = Double.parseDouble(this.allMenu[a][b][c]);
						//Print Menu Price
						System.out.println(this.currency(amount, 0));
					}
				}
				System.out.println(); //For Spacing	
			}
		}
		
		//Set Menu Details Length
		this.data = this.allMenu[menuIndex-1].length;
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
				for(int b=0 ; b<this.allMenu[a].length ; b++){ //Read arrays[Menu Index][Menu]	
					for(int c=0 ; c<this.allMenu[a][b].length ; c++) { //Read arrays[Menu Index][Menu][Menu Details]
						//Set Menu Details
						this.ordersFood[DataProcess.orderIndex][0]=String.valueOf(qty); //Quantity
						this.ordersFood[DataProcess.orderIndex][1]=this.allMenu[a][menuNumber-1][0]; //Foods Name
						this.ordersFood[DataProcess.orderIndex][2]=this.allMenu[a][menuNumber-1][1]; //Price
					}
				}
			}
	}
	
	
	
//	Getter Customer Order Foods
	public void getFood(int orderIndex) {
		//Looping for Multidimentional Array
		for(int j=0 ; j<orderIndex ; j++) { //Read arrays[Order Indexs]
			
			for(int i=0 ; i<this.ordersFood[j].length ; i++) { //Read arrays[Order Indexs][Order Details]
				
				//Check Loop Index
				if(i==0) {
					//Show Customer Order Foods
					System.out.print(" " + this.ordersFood[j][i]);
				}
				
				//Check Loop Index
				if(i==1) {
					//Show Customer Order Foods
					System.out.print("\t" + this.ordersFood[j][i]); 
					
					//Justify Price		
					if(this.ordersFood[j][i].length() > 40 && this.ordersFood[j][i].length() < 48 )
						System.out.print("\t\t");
					else if(this.ordersFood[j][i].length() > 48) System.out.print("\t");
					else if(this.ordersFood[j][i].length() < 8) System.out.print("\t\t\t\t\t\t\t");
					else System.out.print("\t\t\t\t\t\t");
				}
				
				//Check Loop Index
				if(i==2) {
					//Convert String to Double
					double amount = Double.parseDouble(this.ordersFood[j][i]);
					amount *= Double.parseDouble(this.ordersFood[j][0]);
					//Justify Price Length
					if(this.ordersFood[j][i].length() < 5)
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
			for(int i=2 ; i<this.ordersFood[j].length ; i++) { //Read arrays[Order Indexs][Order Details]
				double qty = (Double.parseDouble(this.ordersFood[j][i])*Double.parseDouble(this.ordersFood[j][0]));
				this.net += qty; //Sum Customer Order Price
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
		}
		
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


