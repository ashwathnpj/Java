package java_package;
//ArrayList Constructors 

import java.util.ArrayList;
import java.util.Arrays;

public class Class0093_ArrayListConstructors {
	public static void main(String[] args) {
		//Default Constructor
        ArrayList<String> mobilesList = new ArrayList<>();
        mobilesList.add("iPhone 14");
        mobilesList.add("Samsung Galaxy S23");
        mobilesList.add("Google Pixel 7");
        System.out.println("Mobiles ArrayList (Default Constructor): " + mobilesList);

        //Constructor with Initial Capacity
        ArrayList<String> laptopsList = new ArrayList<>(5);
        laptopsList.add("MacBook Pro");
        laptopsList.add("Dell XPS 13");
        laptopsList.add("HP Spectre x360");
        System.out.println("Laptops ArrayList (Initial Capacity Constructor): " + laptopsList);

        //Constructor with Another Collection
        ArrayList<String> dressList = new ArrayList<>();
        dressList.add("Summer Dress");
        dressList.add("Evening Gown");
        dressList.add("Casual Dress");
        ArrayList<String> dressesList = new ArrayList<>(dressList);
        System.out.println("Dresses ArrayList (Collection Constructor): " + dressesList);

        //Adding More Elements
        dressesList.add("Cocktail Dress");
        dressesList.add("Winter Coat");
        System.out.println("Dresses ArrayList after adding more elements: " + dressesList);
	}

}
