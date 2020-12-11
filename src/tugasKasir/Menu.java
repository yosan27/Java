package tugasKasir;

public class Menu {
//	Arrays of Object
	private String[][] comboMeals = {
			  {"Combo A : Rice + Fried Chicken + Lemon Tea", "29545"},
			  {"Combo B : Beef Burger + Fried Fries + Lemon Tea", "39091"},
			  {"Combo C : Chicken Burger + Fried Fries + Lemon Tea", "39091"},
			  {"Combo D : Cheese Burger + Fried Fries + Lemon Tea", "41364"}};
	
	private String[][] alaCarte = {
			  {"Beef Burger", "20909"},
			  {"Cheese Burger", "21818"},
			  {"Chicken Burger", "20909"},
			  {"Fried Chicken", "16818"},
			  {"Fried Fries", "13636"},
			  {"Rice", "7727"}};
	
	private String[][] beverage = {
			  {"Coke", "6818"},
			  {"Coffee", "11818"},
			  {"Iced Milo", "10909"},
			  {"Lemon Tea", "8182"},
			  {"Mineral Water", "8182"}};

//	Save All Coure into Array
	public String allMenu[][][] = {comboMeals, alaCarte, beverage};	
}
