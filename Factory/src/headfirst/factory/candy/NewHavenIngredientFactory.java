package headfirst.factory.candy;

public class NewHavenIngredientFactory 
	implements CandyIngredientFactory 
{

	public Milk prepareMilk() {
		return new TonedMilk();
	}

	public Chocolate createChocolate() {
		return new LiquorChocolate();
	}

	public Bubblegum createBubblegum() {
		return new WinterFreshChewingGum();
	}


	public Marshmallow createMarshmallow() {
		return new MarshmallowFudge();
	}

	public Toffee createToffee() {
		return new EnglishToffee();
	}
	
	public Sugar createSugar() {
		return new GrinedSugar();
	}

	public Candycane createCandycane() {
		return new CinnabonCandyCane();
	}
}
