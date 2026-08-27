class Solution {
    public int hammingWeight(int n) {
        String input = Integer.toBinaryString(n);
        int count = 0;
        for (char c : input.toCharArray()) {
            if (c == '1') {
                count++;
            }
        }
        return count;
    }
}