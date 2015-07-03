package algorithms;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	public static int[] twoSum(int[] numbers, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < numbers.length; i++) {
		int x = numbers[i];
		if (map.containsKey(target - x)) {
		return new int[] { map.get(target - x) + 1, i + 1 };
		}
		map.put(x, i);
		}//
		throw new IllegalArgumentException("No two sum solution");
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 2, 27, 11, 15 };
		int[] index = twoSum(nums, 26);
		System.out.println("index1=" + index[0] + ", " + "index2=" + index[1]);
	}

}
