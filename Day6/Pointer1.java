package Day6;

public class Pointer1 {
		public static void main(String[] args) {
			int[] numbers= {10,20,30,40,70};
			int target=80;
			int left=0;
			int right=numbers.length-1;
			while(left<right) {
				int sum=numbers[left]+numbers[right];
				if (sum==target) {
					System.out.println("Student found at :" + numbers[left] + "and"+ numbers[right]);
					break;
				}
				else if (sum<target) {
					left++;
				}
				else {
					right--;
				}
			}
		}
}
