package com.arraylists;

import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Create 2D ArrayList (which will host separate ArrayLists)

        ArrayList<ArrayList<String>> groceryList = new ArrayList<>();

        // Create separate ArrayLists

        ArrayList<String> meatList = new ArrayList<>();
        meatList.add("Chicken");
        meatList.add("Beef");
        meatList.add("Fish");
        meatList.add("Mutton");

        ArrayList<String> drinkList = new ArrayList<>();
        drinkList.add("Soda");
        drinkList.add("Water");

        ArrayList<String> fruitList = new ArrayList<>();
        fruitList.add("Apple");
        fruitList.add("Orange");
        fruitList.add("Pear");

        // Add separate ArrayLists into 2D ArrayList

        groceryList.add(meatList);
        groceryList.add(drinkList);
        groceryList.add(fruitList);

        // Print out the entire grocery list
        System.out.println(groceryList);

        // Print out a specific list (drinkList) within the grocery list
        System.out.println(groceryList.get(1));

        // Print out a specific item (Soda) in a specific list (drinkList) within the grocery list
        System.out.println(groceryList.get(1).get(0));
        

    }

}