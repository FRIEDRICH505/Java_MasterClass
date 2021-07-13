/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section12.TreeMap_Challenge;

import java.util.Map;

/**
 *
 * @author FRIEDRICH
 */
public class Main {
    private static StockList stockList = new StockList();

    public static void main(String[] args) {
	    StockItem temp = new StockItem("bread", 0.86, 100);
        stockList.addStock(temp);

        temp = new StockItem("cake", 1.10, 7);
        stockList.addStock(temp);

        temp = new StockItem("car", 12.50, 2);
        stockList.addStock(temp);

        temp = new StockItem("chair", 62.0, 10);
        stockList.addStock(temp);

        temp = new StockItem("cup", 0.50, 200);
        stockList.addStock(temp);
        temp = new StockItem("cup", 0.45, 7);
        stockList.addStock(temp);

        temp = new StockItem("door", 72.95, 4);
        stockList.addStock(temp);

        temp = new StockItem("juice", 2.50, 36);
        stockList.addStock(temp);

        temp = new StockItem("phone", 96.99, 35);
        stockList.addStock(temp);

        temp = new StockItem("towel", 2.40, 80);
        stockList.addStock(temp);

        temp = new StockItem("vase", 8.76, 40);
        stockList.addStock(temp);

        System.out.println(stockList);

        for(String s: stockList.Items().keySet()) {
            System.out.println(s);
        }

        Basket fredsBasket = new Basket("Fred");

        sellItem(fredsBasket, "car", 1);
        System.out.println(fredsBasket);

        sellItem(fredsBasket, "car", 1);
        System.out.println(fredsBasket);

        if(sellItem(fredsBasket, "car", 1) != 1) {
            System.out.println("There are no more cars in stock");
        }

        sellItem(fredsBasket, "spanner", 5);

        sellItem(fredsBasket, "juice", 4);
        sellItem(fredsBasket, "cup", 12);
        sellItem(fredsBasket, "bread", 1);


        Basket basket = new Basket("customer");
        sellItem(basket, "cup", 100);
        sellItem(basket, "juice", 5);
        removeItem(basket, "cup", 1);
        System.out.println(basket);

        removeItem(fredsBasket, "car", 1);
        removeItem(fredsBasket, "cup", 9);
        removeItem(fredsBasket, "car", 1);
        System.out.println("cars removed: " + removeItem(fredsBasket, "car", 1));  

        System.out.println(fredsBasket);

        removeItem(fredsBasket, "bread", 1);
        removeItem(fredsBasket, "cup", 3);
        removeItem(fredsBasket, "juice", 4);
        removeItem(fredsBasket, "cup", 3);
        System.out.println(fredsBasket);

        System.out.println("\nDisplay stock list before and after checkout");
        System.out.println(basket);
        System.out.println(stockList);
        checkOut(basket);
        System.out.println(basket);
        System.out.println(stockList);

        StockItem car = stockList.Items().get("car");
        if(car != null) {
            car.adjustStock(2000);
        }
        if(car != null) {
            stockList.get("car").adjustStock(-1000);
        }

        System.out.println(stockList);

        checkOut(fredsBasket);
        System.out.println(fredsBasket);


    }

    public static int sellItem(Basket basket, String item, int quantity) {
 
        StockItem stockItem = stockList.get(item);
        if(stockItem == null) {
            System.out.println("We don't sell " + item);
            return 0;
        }
        if(stockList.reserveStock(item, quantity) != 0) {
            return basket.addToBasket(stockItem, quantity);
        }
        return 0;
    }

    public static int removeItem(Basket basket, String item, int quantity) {
       
        StockItem stockItem = stockList.get(item);
        if(stockItem == null) {
            System.out.println("We don't sell " + item);
            return 0;
        }
        if(basket.removeFromBasket(stockItem, quantity) == quantity) {
            return stockList.unreserveStock(item, quantity);
        }
        return 0;
    }

    public static void checkOut(Basket basket) {
        for (Map.Entry<StockItem, Integer> item : basket.Items().entrySet()) {
            stockList.sellStock(item.getKey().getName(), item.getValue());
        }
        basket.clearBasket();
    }

}
