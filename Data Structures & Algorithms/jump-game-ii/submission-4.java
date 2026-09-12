 class Solution {
    public int jump(int[] nums) {
        int jumps = 0;
        int currentEnd = 0;   
        int posible = 0;     

        for (int i = 0; i < nums.length - 1; i++) {
            posible = Math.max(posible, i + nums[i]);

            if (i == currentEnd) {          
                jumps++;
                currentEnd = posible;

                if (currentEnd >= nums.length - 1) break;
            }
        }
        return jumps;
    }
}  
