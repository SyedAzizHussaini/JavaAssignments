package com.cryptocurrency.observable;
import java.util.Observable;
import java.util.Observer;


public class LeadingCurrencyValueDisplay implements Observer, DisplayElement {

	private float bitcoin;  
	private float doge;
	private float ethereum;

	public LeadingCurrencyValueDisplay(Observable observable) {
		observable.addObserver(this);
	}

	public void update(Observable observable, Object arg) {
		if (observable instanceof CurrencyData) {
			CurrencyData currencyData = (CurrencyData)observable;
			bitcoin = currencyData.getBTC();
			doge = currencyData.getDOGE();
			ethereum = currencyData.getETH();
			display();
		}
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