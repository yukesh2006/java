package Day6;
import java.util.HashSet;
public class Namesinter {
	    public static void main(String[] args) {
	        String[] a = {"Yash", "Prabhas", "Ranveer", "Allu", "Suriya"};
	        String[] b = {"Allu", "Suriya", "Vijay", "Dhanush", "Yash"};
	        HashSet<String> set = new HashSet<>();
	        HashSet<String> intersection = new HashSet<>();
	        for (int i = 0; i < a.length; i++) {
	            set.add(a[i]);
	        }
	        for (int i = 0; i < b.length; i++) {
	            if (set.contains(b[i])) {
	                intersection.add(b[i]);
	            }
	        }
	        System.out.println("Intersection of names: " + intersection);
	    }
	}
