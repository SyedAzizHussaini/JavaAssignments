package headfirst.state.candy;

public interface State {
	
		public void orderNow();
		public void cancelOrder();
		public void placeOrder();
		public void delivered();
	}

