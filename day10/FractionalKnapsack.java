package day10;
 	import java.util.*;
public class FractionalKnapsack {
	static class Item {
        int weight;
        int profit;
        double ratio;
        Item(int weight, int profit) {
            this.weight = weight;
            this.profit = profit;
            this.ratio = (double) profit / weight;
        }
    }
    public static void main(String[] args) {
        int capacity = 10;
        Item[] items = {
            new Item(5, 100),
            new Item(10, 120),
            new Item(4, 80)
        };
        Arrays.sort(items, (a, b) -> Double.compare(b.ratio, a.ratio));
        double totalProfit = 0;
        for (Item item : items) {
            if (capacity >= item.weight) {                
                capacity -= item.weight;
                totalProfit += item.profit;
                System.out.println("Taken: " + item.weight + " kg, Profit: " + item.profit);
            } 
            else {                
                double fraction = (double) capacity / item.weight;
                double profit = item.profit * fraction;
                totalProfit += profit;
                System.out.println("Taken: " + capacity + " kg (fraction), Profit: " + profit);
                capacity = 0;
            }
            if (capacity == 0) {
                break;
            }
        }
        System.out.println("Maximum Profit = " + totalProfit);
    }
}