package Programs.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Collections;
import java.util.Map;

/* Arrange array elements in the descending order of their frequency.
 * Example:
 length of array=8
 input array - [4,1,2,3,1,2,5,2]

 4's=1, 1's=2, 2's=3, 3's =1, 5's =1
 output array - 22211435
 */

public class ArrayinDescending {

	public static void main(String[] args) {
		int[] arr = { 4, 1, 2, 3, 1, 2, 5, 2 };
		printinDescending(arr);
	}

	private static void printinDescending(int[] arr) {

		Map<Integer, Integer> mp = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			if (mp.containsKey(arr[i])) {
				mp.put(arr[i], mp.get(arr[i]) + 1);
			} else {
				mp.put(arr[i], 1);
			}
		}

		ArrayList<Integer> arr1 = new ArrayList();

		mp.entrySet()
		  .stream()
		  .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
		  .forEach(entry -> {
				for (int i = 1; i <= entry.getValue(); i++) {
					arr1.add(entry.getKey());
			}
		});

		System.out.println(arr1);
	}

}
