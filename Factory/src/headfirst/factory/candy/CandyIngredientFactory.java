package headfirst.factory.candy;

public interface CandyIngredientFactory {
	
	public Milk prepareMilk(); 
	public Chocolate createChocolate();
	public Marshmallow createMarshmallow();
	public Sugar createSugar();
	public Toffee  createToffee();
	public Bubblegum createBubblegum();
	public Candycane createCandycane();
}