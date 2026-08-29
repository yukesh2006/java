package day9;

import java.util.ArrayList;
import java.util.Collections;

public class lexicalsearch2 {
    public static void main(String[] args) {
        long[] number = {
            7483903217L,
            8431316328L,
            9845546524L,
            9611365911L,
            9731743344L
        };
        long search = 31;
        ArrayList<Long> result = new ArrayList<>();
        for (long numbers : number) {
            long temp = numbers;
            while (temp > 0) {
                if (temp % 100 == search) {
                    result.add(numbers);
                    break;
                }
                temp = temp / 10;
            }
        }
        Collections.sort(result);
        System.out.println("Search result:");
        for (long numbers : result) {
            System.out.println(numbers);
        }
    }
}