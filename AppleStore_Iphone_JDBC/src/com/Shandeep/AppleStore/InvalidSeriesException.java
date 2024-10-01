package com.Shandeep.AppleStore;

public class InvalidSeriesException extends Exception {

	public String getMessage() {
		return "Invalid Item, Item Not found";
	}
}
