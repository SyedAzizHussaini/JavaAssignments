package com.cryptocurrency.observer;

import java.util.*;

public class CurrencyServer {

		public static void main(String[] args) {
			CurrencyData currencyData = new CurrencyData();
			CurrentCurrencyValueDisplay currentValue = new CurrentCurrencyValueDisplay(currencyData);
			CurrencyDisplayInINR currentValueinINR = new CurrencyDisplayInINR(currencyData);
			LeadingCurrencyValueDisplay leadingValue = new LeadingCurrencyValueDisplay(currencyData);
			currencyData.setCurrencyValue(44042, 1 , 3117);
	}
}