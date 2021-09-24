package com.cryptocurrency.observer;
import java.util.*;


public class CurrencyDisplayInINR implements Observer, DisplayElement {

	private double currentBTCInINR; 
	private double currentDOGEInINR;
	private double currentETHInINR;
	private CurrencyData currencyData;

	public CurrencyDisplayInINR(CurrencyData currencyData) {
		this.currencyData = currencyData;
		currencyData.registerObserver(this);
	}

	public void update(float bitcoin, float dogecoin, float ethereumcoin) {
		this.currentBTCInINR = bitcoin * 73.81;
		this.currentDOGEInINR = dogecoin * 73.81;
		this.currentETHInINR = ethereumcoin * 73.81;
		display();
	}

	public void display() {
		System.out.println("\nCurrent Cryptocurrency Value in INR:\nBitcoin: " + currentBTCInINR + " INR \nDogecoin: " + currentDOGEInINR + " INR \nEthereum: " + currentETHInINR + " INR \n");
	}
}
