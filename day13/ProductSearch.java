package day13;

import java.util.HashSet;
import java.util.Set;

public class ProductSearch {
    public static void main(String[] args) {
        int[] productIds = {101, 102, 103, 104};
        int search = 103;
        Set<Integer> products = new HashSet<>();
        for (int id : productIds) {
            products.add(id);
        }
        if (products.contains(search)) {
            System.out.println("Product exists");
        } else {
            System.out.println("Product does not exist");
        }
    }
}
