package headfirst.state.candy;

public class CandyStoreStateTest {

	public static void main(String[] args) {
		CandyStore candyStore = new CandyStore(5);

		System.out.println(candyStore);

		candyStore.orderNow();
		candyStore.placeOrder();

		System.out.println(candyStore);

		candyStore.orderNow();
		candyStore.placeOrder();
		candyStore.orderNow();
		candyStore.placeOrder();

		System.out.println(candyStore);
	}
}
