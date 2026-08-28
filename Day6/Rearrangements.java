package Day6;
public class Rearrangements {
		public static void main(String[] args) {
			int[] numbers = {2,3,5,8};
			int left = 0;
			int right = numbers.length - 1;
			while (left < right){
				
				int temp = numbers[left];
				numbers[left] = numbers[right];
				numbers[right] = temp;
				left++;
				right--;
			}
			
			System.out.println("Rearrenged array");
			for (int i =0; i < numbers.length;i++) {
				System.out.println(numbers[i]+"");
			}
		}
}
