package day13;
public class find_id {
    public static boolean productExists(int[] productIds, int searchId) {
        for (int id : productIds) {
            if (id == searchId) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] productIds = {101, 102, 103, 104};
        int searchId = 103;

        if (productExists(productIds, searchId)) {
            System.out.println("Product ID " + searchId + " exists in the system.");
        } else {
            System.out.println("Product ID " + searchId + " does NOT exist in the system.");
        }
    }
}