package com.Shandeep.AppleStore;

import java.util.Comparator;

public class Psort implements Comparator<Iphone>{

	@Override
	public int compare(Iphone ip1, Iphone ip2) {
		return ip1.getPrice()>ip2.getPrice()?1:-1;
	}

}
