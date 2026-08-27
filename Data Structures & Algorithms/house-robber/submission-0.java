class Solution {
    public int rob(int[] nums) {
        int prev1=0;
        int prev2=0;
        int current =0;

        for(int i=0;i<nums.length;i++){
              current = Math.max(nums[i] + prev2,prev1);

            
            prev2=prev1;
            prev1=current;
        }
        return current;
    }
}
