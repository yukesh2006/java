package day13;

public class Duplicate {
    public static int removeDuplicates(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        int j = 0; // position of last unique element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
        }
        return j + 1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3};
        int n = removeDuplicates(arr);
        System.out.println("Number of unique elements: " + n);
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}