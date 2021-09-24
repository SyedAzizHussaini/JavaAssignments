package headfirst.factory.candy;

public class ChicagoIngredientFactory implements CandyIngredientFactory {

	public Milk prepareMilk() {
		return new WholeMilk();
	}

	public Chocolate createChocolate() {
		return new MilkChocolate();
	}

	public Bubblegum createBubblegum() {
		return new BubbleMintSugarFreeGum();
	}


	public Marshmallow createMarshmallow() {
		return new VegMarshmallow();
	}

	public Toffee createToffee() {
		return new AlmondButterCrunch();
	}

	public Sugar createSugar() {
		return new ExtraSweetSugar();
	}

	public Candycane createCandycane() {
		return new ChocolateMintCandyCane();
	}
}
