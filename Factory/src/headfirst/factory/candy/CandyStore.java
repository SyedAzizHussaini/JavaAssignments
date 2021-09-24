package headfirst.factory.candy;

public abstract class CandyStore {
 
	protected abstract Candy createCandy(String item);
 
	public Candy orderCandy(String type) {
		Candy candy = createCandy(type);
		System.out.println("--- Making a " + candy.getName() + " ---");
		candy.prepare();
		candy.cut();
		candy.wrap();
		return candy;
	}
}
