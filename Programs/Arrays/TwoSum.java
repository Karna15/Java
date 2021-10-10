package Programs.Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * 
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 */

public class TwoSum {

	public static void main(String[] args) {

		int[] arr = { 3, 2, 4 };
		int target = 6;
		System.out.println(Arrays.toString(findIndex(arr, target)));

	}

	private static int[] findIndex(int[] nums, int target) {

		Map<Integer, Integer> map = new HashMap<>();
		int[] result = new int[2];
		for (int i = 0; i < nums.length; i++) {

			if (map.containsKey(nums[i])) {
				result[0] = map.get(nums[i]);
				result[1] = i;
				break;
			} else {
				map.put(target - nums[i], i);
			}
		}

		return result;

	}

}
