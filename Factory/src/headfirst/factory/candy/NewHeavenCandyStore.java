package headfirst.factory.candy;

public class NewHeavenCandyStore extends CandyStore {

	protected Candy createCandy(String item) {
		Candy candy = null;
		NewHavenIngredientFactory newHavenIngredientFactory =
				new NewHavenIngredientFactory();

		if (item.equals("bubblegum")) {

			candy = new CandyBubblegum(newHavenIngredientFactory);
			candy.setName("New Heaven's Bubble Gum");

		} else if (item.equals("marshmallow")) {

			candy = new CandyMarshmallow(newHavenIngredientFactory);
			candy.setName("New Heaven's Marshmallow");

		} else if (item.equals("chocolate")) {

			candy = new ChocolateCandy(newHavenIngredientFactory);
			candy.setName("New Heaven's Chocolate Candy");

		} else if (item.equals("toffee")) {

			candy = new ToffeeCandy(newHavenIngredientFactory);
			candy.setName("New Heaven's Toffee");

		} else if (item.equals("candycane")) {

			candy = new CaneCandy(newHavenIngredientFactory);
			candy.setName("New Heaven's Cane Candy");
		}
		return candy;
	}
}
