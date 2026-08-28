package Day6;
import java.util.HashSet;
public class Numberinter {
	    public static void main(String[] args) {
	        int[] a = {1, 2, 3, 4, 5};
	        int[] b = {4, 5, 6, 7, 8};
	        HashSet<Integer> set1 = new HashSet<>();
	        HashSet<Integer> intersection = new HashSet<>();
	        for (int i = 0; i < a.length; i++) {
	            set1.add(a[i]);
	        }
	        for (int i = 0; i < b.length; i++) {
	            if (set1.contains(b[i])) {
	                intersection.add(b[i]);
	            }
	        }
	        System.out.println("Intersection of arrays: " + intersection);
	    }
	}
