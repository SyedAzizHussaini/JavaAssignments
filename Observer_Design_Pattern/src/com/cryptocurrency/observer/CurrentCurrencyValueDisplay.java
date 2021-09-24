package com.cryptocurrency.observer;

public class CurrentCurrencyValueDisplay implements Observer, DisplayElement {

	private float bitcoin;
	private float dogecoin;
	private float ethereum;
	private Subject currencyData;

	public CurrentCurrencyValueDisplay(Subject currencyData) {
		this.currencyData = currencyData;
		currencyData.registerObserver(this);
	}

	public void update(float bitcoin, float dogecoin, float ethereumcoin) {
		this.bitcoin = bitcoin;
		this.dogecoin = dogecoin;
		this.ethereum = ethereumcoin;
		display();
	}

	public void display() {
		System.out.println("\nCurrent Cryptocurrency Value in USD:\nBitcoin: " + bitcoin + " USD \nDogecoin: " + dogecoin + " USD \nEthereum: " + ethereum + " USD \n");
	}
}
