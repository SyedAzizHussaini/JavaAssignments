package com.cryptocurrency.observer;

import java.util.ArrayList;

public class CurrencyData implements Subject {

	private ArrayList observers;
	private float bitcoin;
	private float dogecoin;
	private float ethereumcoin;
	
	
	public CurrencyData() {
		observers = new ArrayList();
	}
	
	public void registerObserver(Observer o) {
		observers.add(o);
	}
	
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}
	}
	
	public void notifyObservers() {
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = (Observer)observers.get(i);
			observer.update(bitcoin, dogecoin, ethereumcoin);
		}
	}
	
	public void currencyValueChanged() {
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