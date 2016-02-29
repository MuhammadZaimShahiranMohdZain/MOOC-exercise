package week4;

public class e76 {
	public static void main(String[] args) {
		Menu menu = new Menu();
		menu.addMeal("Hamburger");
		menu.addMeal("Fish'n'Chips");
		menu.addMeal("Sauerkraut");
		
		menu.printMeals();
		
		menu.clearMenu();
		
		menu.printMeals();
	}
}
