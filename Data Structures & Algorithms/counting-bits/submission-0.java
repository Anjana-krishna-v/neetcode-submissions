class Solution {
    public int[] countBits(int n) {
        int[] output = new int[n + 1];  // array of size n+1 to hold output[0..n]
        
        for (int i = 0; i <= n; i++) {
            String binary = Integer.toBinaryString(i);
            int count = 0;
            for (int j = 0; j < binary.length(); j++) {
                if (binary.charAt(j) == '1') {
                    count++;
                }
            }
            output[i] = count;
        }
        
        return output;
    }
}