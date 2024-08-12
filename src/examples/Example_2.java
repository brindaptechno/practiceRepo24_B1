// Find the maximum negative

package examples;

public class Example_2 {
	
	void maxNegative(int[] arr) {
		int max=Integer.MIN_VALUE;		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] < 0 && max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}
	
	public static void main(String[] args) {
		Example_2 example_2 = new Example_2();
		int[] input = {12, -18, -2, 44, -24, 88};
		example_2.maxNegative(input);
	}
}
