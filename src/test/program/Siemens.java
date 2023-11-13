package test.program;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Siemens {

	/**
	 * write a program can we count 2 numbers combination which can have 10 as sum
	 * @param args
	 */
	public static void main(String[] args) {
		withoutTimeComplexity();
		withTimeComplexity();
	}

	private static void withTimeComplexity() {
		int arr[] = {2, 7, 3, 9, 2, 3, 1};
		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
		
	}

	private static void withoutTimeComplexity() {
		int arr[] = {2, 7, 3, 9, 2, 3, 1};

		int sum = 10;

		for(int i = 0; i < arr.length;i++){
			for(int j = 0; j < arr.length;j++){
				if(arr[i] + arr[j] == sum){
					System.out.println(arr[i] + " "+ arr[j]);
				}
			}
		}
	}

}
