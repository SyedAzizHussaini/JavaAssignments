package headfirst.factory.candy;

public class CandyMarshmallow extends Candy {

	CandyIngredientFactory ingredientFactory;

	public CandyMarshmallow(CandyIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}

	void prepare() {
		System.out.println("Preparing " + name);
		sugar = ingredientFactory.createSugar();
		milk = ingredientFactory.prepareMilk();
		chocolate = ingredientFactory.createChocolate();
		marshmallow = ingredientFactory.createMarshmallow();
		bubblegum = ingredientFactory.createBubblegum();
	}
}
