package com.cryptocurrency.observable;

import java.util.Observable;
import java.util.Observer;

public class CurrentCurrencyValueDisplay implements Observer, DisplayElement {

	Observable observable;
	private float bitcoin;
	private float dogecoin;
	private float ethereumcoin;

	public CurrentCurrencyValueDisplay(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}

	public void update(Observable obs, Object arg) {
		if (obs instanceof CurrencyData) {
			CurrencyData currencyData = (CurrencyData)obs;
			this.bitcoin = currencyData.getBTC();
			this.dogecoin = currencyData.getDOGE();
			this.ethereumcoin = currencyData.getETH();
			display();
		}
	}

	public void display() {
		System.out.println("\nCurrent Cryptocurrency Value in USD:\nBitcoin: " + bitcoin + " USD \nDogecoin: " + dogecoin + " USD \nEthereum: " + ethereumcoin + " USD \n");
	}
}
