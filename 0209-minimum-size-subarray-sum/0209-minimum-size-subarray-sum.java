class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i=0,j=0,sum=0,ml=Integer.MAX_VALUE;
        while(j<nums.length){
            sum+=nums[j];
            if(sum<target){
                j++;
            }else{
                while(sum>=target){
                    ml=Math.min(j-i+1,ml);
                    sum=sum-nums[i];
                    i++;
                }
                j++;
            }
        }
        if(ml==Integer.MAX_VALUE){
            return 0;
        }
        return ml;
    }
}