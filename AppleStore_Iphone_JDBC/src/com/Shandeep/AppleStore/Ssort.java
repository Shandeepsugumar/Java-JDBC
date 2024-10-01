package com.Shandeep.AppleStore;

import java.util.Comparator;

public class Ssort implements Comparator<Iphone>{

	@Override
	public int compare(Iphone ip1, Iphone ip2) {
		return (ip1.getSeries()).compareTo(ip2.getSeries());
	}

}
