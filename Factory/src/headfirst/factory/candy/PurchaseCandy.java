package headfirst.factory.candy;


public class PurchaseCandy {

	public static void main(String[] args) {
		CandyStore nhStore = new NewHeavenCandyStore();
		CandyStore chicagoStore = new ChicagoCandyStore();

		Candy candy = nhStore.orderCandy("chocolate");
		System.out.println("Ethan ordered a " + candy + "\n");

		candy = nhStore.orderCandy("bubblegum");
		System.out.println("Joel ordered a " + candy + "\n");

		candy = nhStore.orderCandy("candycane");
		System.out.println("Ethan ordered a " + candy + "\n");

		candy = nhStore.orderCandy("marshmallow");
		System.out.println("Joel ordered a " + candy + "\n");

		candy = nhStore.orderCandy("toffee");
		System.out.println("Ethan ordered a " + candy + "\n");

		candy = chicagoStore.orderCandy("chocolate");
		System.out.println("Ethan ordered a " + candy + "\n");

		candy = chicagoStore.orderCandy("bubblegum");
		System.out.println("Joel ordered a " + candy + "\n");

		candy = chicagoStore.orderCandy("candycane");
		System.out.println("Ethan ordered a " + candy + "\n");

		candy = chicagoStore.orderCandy("marshmallow");
		System.out.println("Joel ordered a " + candy + "\n");

		candy = chicagoStore.orderCandy("toffee");
		System.out.println("Ethan ordered a " + candy + "\n");

	}

}
