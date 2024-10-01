package com.Main;

import java.util.Scanner;
import com.Shandeep.AppleStore.Inventory;
import com.Shandeep.AppleStore.Iphone;
import com.Shandeep.AppleStore.login;
import com.Shandeep.AppleStore.InvalidSeriesException;

public class Main {

	public static void main(String[] args) {
		Inventory in=new Inventory();
		login log=new login();
		Iphone ip = new Iphone();
		int opt,i=0,opt1,opt2;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("Welcome to AppleStore");
			System.out.println("Login To Continue");
			System.out.println("Enter the Name:");
			log.setName(sc.next()+sc.nextLine());
			System.out.println("Enter the Password");
			log.setPassword(sc.next()+sc.nextLine());
			System.out.println("1.Admin, 2.Customer");
			opt2=sc.nextInt();
			if(opt2==1) {
				System.out.println("Enter the Admin Code:");
				String sec=sc.next();
				if(sec.equals("Iphone123")) {
					System.out.println("Welcome back "+log.getName());
					do {
						System.out.println("1.Add, 2.Update, 3.Search, 4.Remove, 5.Show, 6.PriceSort, 7.ColorSort, 8.SeriesSort, 9.Logout..");
						opt=sc.nextInt();
						switch(opt) {
						case 1:
//							ip=new Iphone();
							System.out.println("Enter the Series: ");
							ip.setSeries(sc.next()+sc.nextLine());
							System.out.println("Enter the Color: ");
							ip.setColor(sc.next()+sc.nextLine());
							System.out.println("Enter the Price: ");
							ip.setPrice(sc.nextDouble());
							in.add(ip);
							break;
						case 2:
							in.show();
							System.out.println("Enter the id to update :");
							int x=sc.nextInt();
							ip.setId(x);
							System.out.println("Enter the Series: ");
						    ip.setSeries(sc.next()+sc.nextLine());
							System.out.println("Enter the Color: ");
						    ip.setColor(sc.next()+sc.nextLine());
							System.out.println("Enter the Price: ");
						    ip.setPrice(sc.nextDouble());
							in.update(ip);
							break;
						case 3:
							try {
								System.out.println("Enter the Series to Find: ");
								String series=sc.next()+sc.nextLine();
								ip=in.search(series);
								if(ip!=null) {
									System.out.println(ip.tostring());
								}
								else {
									throw new InvalidSeriesException();
								}
							}
							catch(InvalidSeriesException e) {
								System.out.println(e.getMessage());
							}
							
							break;
						case 4:
							System.out.println("Enter the Series to Remove: ");
							String series=sc.next()+sc.nextLine();
							in.remove(series);
							break;
						case 5:
							in.show();
							break;
						case 6:
							in.pricesort();
							break;
						case 7:
							in.colorsort();
							break;
						case 8:
							in.seriessort();
							break;
						default:
							System.out.println("Logout has been done successfully");
						}
					}while(opt<9);
				}
				else {
					System.out.println("Sorry! Invalid Id try Again");
				}
			}
			else if(opt2==2) {
				try {
					if(ip.toString()!=null) {
						in.show();
					}
				}
				catch(NullPointerException e) {
					System.out.println("No items in the AppleStore");
				}
			}
					
		}while(true);

	}

}
