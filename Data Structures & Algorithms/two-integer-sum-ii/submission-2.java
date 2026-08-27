class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0, r = numbers.length - 1, cursum = 0;
        while (l < r) {
            cursum = numbers[l] + numbers[r];
            if (cursum > target) {
                r -= 1;
            } else if (cursum < target) {
                l += 1;
            } else {
                return new int[]{l + 1, r + 1};
            }
        }
        return new int[]{};
    }
}