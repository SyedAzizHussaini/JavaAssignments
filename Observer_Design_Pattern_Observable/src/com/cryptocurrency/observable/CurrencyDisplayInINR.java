package com.cryptocurrency.observable;

import java.util.Observable;
import java.util.Observer;

public class CurrencyDisplayInINR implements Observer, DisplayElement {

	private double currentBTCInINR; 
	private double currentDOGEInINR;
	private double currentETHInINR;

	public CurrencyDisplayInINR(Observable observable) {
		observable.addObserver(this);
	}

	public void update(Observable observable, Object arg) {
		if (observable instanceof CurrencyData) {
			CurrencyData currencyData = (CurrencyData)observable;

			currentBTCInINR = currencyData.getBTC() * 73.81;
			currentDOGEInINR = currencyData.getDOGE() * 73.81;
			currentETHInINR = currencyData.getETH() * 73.81;

			display();
		}
	}

	public void display() {
		System.out.println("\nCurrent Cryptocurrency Value in INR:\nBitcoin: " + currentBTCInINR + " INR \nDogecoin: " + currentDOGEInINR + " INR \nEthereum: " + currentETHInINR + " INR \n");
	}
}