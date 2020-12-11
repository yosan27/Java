package kasirArrayList;

import java.util.ArrayList;

public class Menu {
	protected ArrayList<ArrayList<ArrayList<String>>> allMenu;
	
	public Menu() {
//		Combo Meals
		ArrayList<ArrayList<String>> comboMeals = new ArrayList<ArrayList<String>>();
		comboMeals.add(new ArrayList<String>()); 
		comboMeals.get(0).add("Combo A : Rice + Fried Chicken + Lemon Tea");
		comboMeals.get(0).add("29545");
		comboMeals.add(new ArrayList<String>()); 
		comboMeals.get(1).add("Combo B : Beef Burger + Fried Fries + Lemon Tea");
		comboMeals.get(1).add("39091");
		comboMeals.add(new ArrayList<String>()); 
		comboMeals.get(2).add("Combo C : Chicken Burger + Fried Fries + Lemon Tea");
		comboMeals.get(2).add("39091");
		comboMeals.add(new ArrayList<String>()); 
		comboMeals.get(3).add("Combo D : Cheese Burger + Fried Fries + Lemon Tea");
		comboMeals.get(3).add("41364");
		
//		Ala Carte
		ArrayList<ArrayList<String>> alaCarte = new ArrayList<ArrayList<String>>();
		alaCarte.add(new ArrayList<String>()); 
		alaCarte.get(0).add("Beef Burger");
		alaCarte.get(0).add("20909");
		alaCarte.add(new ArrayList<String>()); 
		alaCarte.get(1).add("Cheese Burger");
		alaCarte.get(1).add("21818");
		alaCarte.add(new ArrayList<String>()); 
		alaCarte.get(2).add("Chicken Burger");
		alaCarte.get(2).add("20909");
		alaCarte.add(new ArrayList<String>()); 
		alaCarte.get(3).add("Fried Chicken");
		alaCarte.get(3).add("16818");
		alaCarte.add(new ArrayList<String>()); 
		alaCarte.get(4).add("Fried Fries");
		alaCarte.get(4).add("13636");
		alaCarte.add(new ArrayList<String>()); 
		alaCarte.get(5).add("Rice");
		alaCarte.get(5).add("7727");
		
//		Beverage
		ArrayList<ArrayList<String>> beverage = new ArrayList<ArrayList<String>>();
		beverage.add(new ArrayList<String>()); 
		beverage.get(0).add("Coke");
		beverage.get(0).add("6818");
		beverage.add(new ArrayList<String>()); 
		beverage.get(1).add("Coffee");
		beverage.get(1).add("11818");
		beverage.add(new ArrayList<String>()); 
		beverage.get(2).add("Iced Milo");
		beverage.get(2).add("10909");
		beverage.add(new ArrayList<String>()); 
		beverage.get(3).add("Lemon Tea");
		beverage.get(3).add("8182");
		beverage.add(new ArrayList<String>()); 
		beverage.get(4).add("Mineral Water");
		beverage.get(4).add("8182");
		
//		Save All Coure into Array
		allMenu = new ArrayList<ArrayList<ArrayList<String>>>();
		allMenu.add(comboMeals);
		allMenu.add(alaCarte);
		allMenu.add(beverage);
	}
}

