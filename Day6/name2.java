package Day6;
import java.util.HashSet;
public class name2 {
	public static void main(String[] args) {
        String[] a = {"rocky", "bhai", "ravi", "bhasur"};
        String[] b = {"yash","raja","ereree"};
        HashSet<String> union = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            union.add(a[i]);
        }
        for (int i = 0; i < b.length; i++) {
            union.add(b[i]);
        }
        System.out.println("Union of arrays: " + union);
    }
}
