//Given a 32-bit signed integer, reverse digits of an integer.
//
// Note:
//Assume we are dealing with an environment that could only store integers withi
//n the 32-bit signed integer range: [−231, 231 − 1]. For the purpose of this prob
//lem, assume that your function returns 0 when the reversed integer overflows.
//
//
// Example 1:
// Input: x = 123
//Output: 321
// Example 2:
// Input: x = -123
//Output: -321
// Example 3:
// Input: x = 120
//Output: 21
// Example 4:
// Input: x = 0
//Output: 0
//
//
// Constraints:
//
//
// -231 <= x <= 231 - 1
//
// Related Topics Math
// 👍 4059 👎 6284


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public static void main(String[] args){
        Solution solution = new Solution();

        int[] arr = {123, -123, 120, Integer.MIN_VALUE, Integer.MAX_VALUE};
        for (int i = 0; i < arr.length; i++){
            int result = solution.reverse(arr[i]);
            System.out.println(arr[i] + " ---- " + result);
        }
    }

    public int reverse(int x) {
        if (x == Integer.MIN_VALUE || x == Integer.MAX_VALUE){
            // the absolute value of the MIN is larger than MAX by 1
            return 0;
        }
        int sign = x > 0 ? 1 : -1;
        x = x < 0 ? x * -1 : x; // if it's a negative number, temperally change it to positve


        // 1. transfer int to String and then char[] array
        String str = String.valueOf(x);
        char[] chars = str.toCharArray();

        // 2. loop and save to char[]
        int len = chars.length;
        char[] array = new char[len];
        for (int i = len - 1; i >= 0; i--){
            array[len - 1 - i] = chars[i];
        }

        // 3. transfer char[] to string and then to int;
        //Integer result = Integer.valueOf(String.valueOf(array));
        // but not all integer can be transferred to string
        long value = Long.valueOf(String.valueOf(array)); // note the first long is not Caption
        // but long could be larger than integer
        boolean b = value > Integer.MAX_VALUE || value < Integer.MIN_VALUE;
        int result = b ? 0 : (int) value; // note the (int)
        return result * sign;

    }
}
//leetcode submit region end(Prohibit modification and deletion)
