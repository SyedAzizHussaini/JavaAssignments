package headfirst.state.candy;

public class CandyStore {
 
	State closedState;
	State openState;
	State orderPlacedState;
	State orderDeliveredState;
 
	State state = closedState;
	int count = 0;
 
	public CandyStore(int numberOfCandies) {
		closedState = new ClosedState(this);
		openState = new OpenState(this);
		orderPlacedState = new OrderPlacedState(this);
		orderDeliveredState = new OrderDeliveredState(this);

		this.count = numberOfCandies;
 		if (numberOfCandies > 0) {
			state = openState;
		} 
	}
 
	public void orderNow() {
		state.orderNow();
	}
 
	public void cancelOrder() {
		state.cancelOrder();
	}
 
	public void placeOrder() {
		state.placeOrder();
		state.delivered();
	}

	void setState(State state) {
		this.state = state;
	}
 
	void giveCandy() {
		System.out.println("Ordered Candy will be given.....");
		if (count != 0) {
			count = count - 1;
		}
	}
 
	int getCount() {
		return count;
	}
 
	void refill(int count) {
		this.count = count;
		state = openState;
	}

    public State getState() {
        return state;
    }

    public State getClosedState() {
        return closedState;
    }

    public State getOpenState() {
        return openState;
    }

    public State getOrderPlacedState() {
        return orderPlacedState;
    }

    public State getOrderDeliveredState() {
        return orderDeliveredState;
    }
 
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nChicago Candy Store");
		//result.append("\nJava-enabled Standing Candy Model #2004");
		result.append("\nStock: " + count + " Candy");
		if (count != 1) {
			result.append("s");
		}
		result.append("\n");
		result.append("Store is " + state + "\n");
		return result.toString();
	}
}
