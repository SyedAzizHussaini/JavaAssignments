package headfirst.factory.candy;

public class CaneCandy extends Candy {

	CandyIngredientFactory ingredientFactory;
	 
	public CaneCandy(CandyIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}
 
	void prepare() {
		System.out.println("Preparing " + name);
		sugar = ingredientFactory.createSugar();
		candycane = ingredientFactory.createCandycane();
	}

}
