package com.cryptocurrency.observable;

import java.util.Observable;
import java.util.Observer;


public class CurrencyData extends Observable {

	private float bitcoin;
	private float dogecoin;
	private float ethereumcoin;

	public CurrencyData() { }

	public void currencyValueChanged() {
		setChanged();
		notifyObservers();
	}

	public void setCurrencyValue(float bitcoin, float dogecoin, float ethereumcoin) {
		this.bitcoin = bitcoin;
		this.dogecoin = dogecoin;
		this.ethereumcoin = ethereumcoin;
		currencyValueChanged();
	}

	public float getBTC() {
		return bitcoin;
	}

	public float getDOGE() {
		return dogecoin;
	}

	public float getETH() {
		return ethereumcoin;
	}
}
