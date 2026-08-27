class Solution {
    public int rob(int[] nums) {
     if (nums.length == 1) return nums[0];
     int prev1=0;
     int prev2=0;
     int current1=0,current2=0,current=0;
     for(int i=0;i<nums.length-1;i++){
        
      current1 = Math.max(nums[i] + prev2,prev1);
      prev2=prev1;
      prev1=current1;
     }
    int  prev3=0;
     int prev4=0;
     for(int i=1;i<nums.length;i++){
        
      current2 = Math.max(nums[i] + prev4,prev3);
      prev4=prev3;
      prev3=current2;
     } 
     current=Math.max(current1,current2);
     return current;

    }
}
