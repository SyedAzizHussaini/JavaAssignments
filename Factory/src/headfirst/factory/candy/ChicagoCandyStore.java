package headfirst.factory.candy;

public class ChicagoCandyStore extends CandyStore {

	protected Candy createCandy(String item) {
		Candy candy = null;
		CandyIngredientFactory candyIngredientFactory =
				new ChicagoIngredientFactory();

		if (item.equals("bubblegum")) {

			candy = new CandyBubblegum(candyIngredientFactory);
			candy.setName("Chicago's Bubble Gum");

		} else if (item.equals("marshmallow")) {

			candy = new CandyMarshmallow(candyIngredientFactory);
			candy.setName("Chicago's Marshmallow");

		} else if (item.equals("chocolate")) {

			candy = new ChocolateCandy(candyIngredientFactory);
			candy.setName("Chicago's Chocolate Candy");

		} else if (item.equals("toffee")) {

			candy = new ToffeeCandy(candyIngredientFactory);
			candy.setName("Chicago's Toffee");

		} else if (item.equals("candycane")) {

			candy = new CaneCandy(candyIngredientFactory);
			candy.setName("Chicago's Cane Candy");

		}
		return candy;
	}
}
