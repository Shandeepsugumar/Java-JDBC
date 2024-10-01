package com.Shandeep.AppleStore;

public class Iphone implements Comparable<Iphone>{
	private String series;
	private double price;
	private String color;
	private int ID;
	
//	public Iphone() {
//		
//	}
//	public Iphone(String series, double price, String color, String ID) {
//		this.series=series;
//		this.price=price;
//		this.color=color;
//		this.ID=ID;
//	}
	public void setSeries(String series)
	{
		this.series=series;
	}
	public String getSeries() {
		return this.series;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public String getColor() {
		return this.color;
	}
	public void setPrice(double price) {
		this.price=price;
	}
	public double getPrice() {
		return this.price;
	}
	public void setId(int ID) {
		this.ID=ID;
	}
	public int getId() {
		return this.ID;
	}
	public String tostring() {
		return "Series of the iphone: "+this.series+", Price of the iphone: "+this.price+", Color of the iphone: "+this.color+", productID: "+this.ID;
	}
	@Override
	public int compareTo(Iphone ip) {
		return (this.color).compareTo(ip.color);
	}
}
