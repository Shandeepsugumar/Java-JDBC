package com.Shandeep.AppleStore;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Inventory {
	Statement stmt;
	ResultSet rs;
	String qry=null;
	IphoneDB db=new IphoneDB();
	Connection con;
	int count;
	List<Iphone> list=new ArrayList<>();
	public void add(Iphone ip) {
//		list.add(ip);
//		ip.setId(generateId(ip));
//        String qry = null;
        int count;
        try {
            con = db.getDBConnection();
            stmt = con.createStatement();
//            qry = "INSERT INTO iphone(Series, Color, Price) VALUES('" + ip.getSeries() + "', '" + ip.getColor() + "', '" + ip.getPrice() + "')"+")";
            count = stmt.executeUpdate("INSERT INTO iphone(Series, Color, Price) VALUES('" + ip.getSeries() + "', '" + ip.getColor() + "', '" + ip.getPrice() + "')");
            if (count == 1) 
            {
                System.out.println("1 item is inserted");
//                list.add(ip);
            } 
            else
            {
                throw new Exception("item is Not inserted");
            }
        } catch (Exception e) 
        {
            System.out.println(e);
        } finally
        {
            closeResources();
        }
	}

	public Iphone search(String series) {
//		for(int i=0;i<list.size();i++) {
//			if(series.equals(list.get(i).getSeries())) {
//				return list.get(i);
//			}
//		}
		for (Iphone book : list) {

            if (series.equals(book.getSeries())) {

                return book;

            }

        }



        try {

            con = db.getDBConnection();

            stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT * FROM iphone WHERE SERIES='" + series + "'");

            if (rs.next()) {

                Iphone book = new Iphone();

                book.setSeries(series);

                book.setSeries(rs.getString("Series"));

                book.setColor(rs.getString("Color"));

                book.setPrice(rs.getInt("Price"));

                return book;

            }

        } catch (Exception e) {

            System.out.println(e);

        } finally {

            closeResources();

        }

		return null;
	}
	public void update(Iphone ip) {
//		System.out.println("Successfully Updated");
//		String qry = null;
		try {
			con=db.getDBConnection();
			stmt=con.createStatement();
			count=stmt.executeUpdate("UPDATE iphone SET Series='" + ip.getSeries() + "', Color='" + ip.getColor() + "', Price=" + ip.getPrice() + " WHERE ID=" + ip.getId() + "");
			System.out.println("Updated");
			}
			catch(Exception e)
			{
			System.out.println(e.getMessage());
			}
		
	}

	public void show() {
		//for(Iphone ip: list) {
		//	System.out.println(ip.tostring());
		//}
		
		try {
			con=db.getDBConnection();
			stmt=con.createStatement();
			rs=stmt.executeQuery("select * from iphone");
			while(rs.next())
				System.out.println("ID: "+rs.getInt(1)+", "+"Series: "+rs.getString(2)+", "+"Color: "+rs.getString(3)+", "+"Price: "+rs.getInt(4));
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void remove(String series) {
//		for(int i=0;i<list.size();i++) {
//			if(series.equals(list.get(i).getSeries())) {
//				list.remove(i);
//			}
//		}
//		String qry = null;

        int count;

        try {

            con = db.getDBConnection();

            stmt = con.createStatement();

            qry = "DELETE FROM iphone WHERE SERIES='" + series + "'";

            count = stmt.executeUpdate(qry);

            if (count == 1) {

                System.out.println("Successfully removed");

                list.removeIf(book -> book.getSeries().equals(series));

            } else {

                System.out.println("Series does not match to remove");

            }

        } catch (Exception e) {

            System.out.println(e);

        } finally {

            closeResources();

        }

	}
//	public String generateId(Iphone ip) {
//		String series=ip.getSeries();
//		String color=ip.getColor();
//		String SeriesId = null;
//		String colorId = null;
//		String ID;
//		if(series.length()>=3) {
//			SeriesId= series.substring(series.length()-3);
//		}
//		if(color.length()>=2) {
//			colorId= color.substring(color.length()-2);
//		}
//		ID=SeriesId+colorId;
//		return ID;
//	}
	public void pricesort() {
		System.out.println("The Sort of Price");
		Collections.sort(list,new Psort());
	}
	public void colorsort() {
		System.out.println("The Sort of Color");
		Collections.sort(list);
	}
	public void seriessort() {
		System.out.println("The Sort of Series");
		Collections.sort(list,new Ssort());
	}
	private void closeResources() {
		try {

            if (stmt != null) stmt.close();

            if (con != null) con.close();

        } catch (Exception e) {

            e.printStackTrace();

        }
		
	}
}
