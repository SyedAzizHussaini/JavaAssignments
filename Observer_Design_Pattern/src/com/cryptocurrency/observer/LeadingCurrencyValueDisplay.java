package com.cryptocurrency.observer;

public class LeadingCurrencyValueDisplay implements Observer, DisplayElement {

	private float bitcoin;  
	private float doge;
	private float ethereum;
	private CurrencyData currencyData;

	public LeadingCurrencyValueDisplay(CurrencyData currencyData) {
		this.currencyData = currencyData;
		currencyData.registerObserver(this);
	}

	public void update(float bitcoin, float dogecoin, float ethereumcoin) {
		this.bitcoin = bitcoin;
		this.doge = dogecoin;
		this.ethereum = ethereumcoin;
		display();
	}

	public void display() {
		System.out.print("\nLeading Cryptocurrency Value: \n");
		if ((bitcoin > doge) && (bitcoin > ethereum)) {
			System.out.println("Bitcoin has the highest value: " + bitcoin + "\n");
		}
		else if (doge>=bitcoin && doge>=ethereum)  {
			System.out.println("\nDogecoin has the highest value: " + doge + "\n");
		}
		else  {
			System.out.println("\nEthereumcoin has the highest value: "+ethereum + "\n"); 
		}
	}
}

