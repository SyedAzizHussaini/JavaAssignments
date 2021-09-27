package headfirst.iterator.candy;

import java.util.*;

public class CandyStoreMerge {
	public static void main(String args[]) {
		NewHavenCandyStoreMenu afternoonMenu = new NewHavenCandyStoreMenu();
		ChicagoCandyStoreMenu eveningMenu = new ChicagoCandyStoreMenu();

		StoreKeeper waitress = new StoreKeeper(afternoonMenu, eveningMenu);

		waitress.printMenu();
	}

	public static void printMenu() {
		NewHavenCandyStoreMenu afternoonMenu = new NewHavenCandyStoreMenu();
		ChicagoCandyStoreMenu eveningMenu = new ChicagoCandyStoreMenu();

		ArrayList afternoonItems = afternoonMenu.getMenuItems();

		for (int i = 0; i < afternoonItems.size(); i++) {
			MenuItem menuItem = (MenuItem)afternoonItems.get(i);
			System.out.print(menuItem.getName());
			System.out.println("\t\t" + menuItem.getPrice());
			System.out.println("\t" + menuItem.getDescription());
		}

		MenuItem[] eveningItems = eveningMenu.getMenuItems();

		for (int i = 0; i < eveningItems.length; i++) {
			MenuItem menuItem = eveningItems[i];
			System.out.print(menuItem.getName());
			System.out.println("\t\t" + menuItem.getPrice());
			System.out.println("\t" + menuItem.getDescription());
		}
	}
}
