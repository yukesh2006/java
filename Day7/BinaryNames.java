package Day7;
public class BinaryNames {
    public static int binarySearch(String[] names, String target) {
        int left = 0;
        int right = names.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            System.out.println("Checking: " + names[mid]);
            if (names[mid].equals(target)) {
                return mid;
            }
            else if (target.compareTo(names[mid]) > 0) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String[] names = {"aradya","gowda","kumar","master","ticket","toxic","uday","vinod","yash"};
        String target = "gowda";
        int result = binarySearch(names, target);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        }
        else {
            System.out.println("Element not found");
        }
    }
}