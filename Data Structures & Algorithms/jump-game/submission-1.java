class Solution {
    public boolean canJump(int[] nums) {
   
        int n=nums.length;
        int maxr=0;
        for(int i =0;i<=n-1;i++){
           
           if(maxr<i)
           return false;
           maxr=Math.max(maxr,i+nums[i]);
        }
        if(n-1<=maxr){
            return true;
        }
        else
        return false;
    }
}
