package Day6;
import java.util.HashSet;
public class numbers {
	    public static void main(String[] args) {
	        int[] a = {1, 2, 3, 4, 5};
	        int[] b = {4, 5, 6, 7, 8};
	        HashSet<Integer> union = new HashSet<>();
	        for (int i = 0; i < a.length; i++) {
	            union.add(a[i]);
	        }
	        for (int i = 0; i < b.length; i++) {
	            union.add(b[i]);
	        }
	        System.out.println("Union of arrays: " + union);
	    }
	}
