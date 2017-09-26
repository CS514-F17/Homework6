package hw6;

/**
 * Methods to practice recursion!
 * Thanks to coding bat for some of these methods: http://codingbat.com/
 * 
 * @author srollins
 *
 */
public class RecursionFun {

	/**
	 * Given a string, return recursively (no loops) a "cleaned" string where 
	 * adjacent chars that are the same have been reduced to a single 
	 * char. So "Hello" yields "Helo".
	 * @param str
	 * @return
	 */
	public static String cleanString(String str) {
		//TODO: replace with your code;
		return null;
	}

	/**
	 * Given a string, compute recursively (no loops) a new string where all the lowercase 'x' chars have been changed to 'y' chars.

			changeXY("codex") → "codey"
			changeXY("xxhixx") → "yyhiyy"
			changeXY("xhixhix") → "yhiyhiy"
	 * @param str
	 * @return
	 */
	public static String changeXY(String str) {
		//TODO: replace with your code;
		return null;
	}

	/**
	 * Given an array of ints, compute recursively the number of times that the value 11 appears in the array. 
	 * We'll use the convention of considering only the part of the array that begins at the given index. 
	 * In this way, a recursive call can pass index+1 to move down the array. The initial call will pass in 
	 * index as 0.
			array11([1, 2, 11], 0) → 1
			array11([11, 11], 0) → 2
			array11([1, 2, 3, 4], 0) → 0
	 * @param nums
	 * @param index
	 * @return
	 */
	public static int array11(int[] nums, int index) {
		//TODO: replace with your code;
		return -1;
	}

	/**
	 * Given an array of ints, compute recursively if the array contains a 6. We'll use the convention 
	 * of considering only the part of the array that begins at the given index. In this way, a 
	 * recursive call can pass index+1 to move down the array. The initial call will pass in index as 0.
			array6([1, 6, 4], 0) → true
			array6([1, 4], 0) → false
			array6([6], 0) → true
	 */
	public static boolean array6(int[] nums, int index) {
		//TODO: replace with your code;
		return false;
	}
	
	/**
	 * Given an input max, return a String containing the following shape, where max represents the 
	 * length of the longest row. Assume there is no whitespace at the start of each row.
	 * Hint: you may use additional helper methods, but no loops.
	 * 
	 * Input: 3
	 * Output: 
			0
			01
			012
			0123
			012
			01
			0	
	 * 
	 * @param max
	 * @return
	 */
	public static String triangle(int max) {
		//TODO: replace with your code;
		return null;
	}

	//TODO: consider adding some additional helper methods, especially for the triangle method.
	
}