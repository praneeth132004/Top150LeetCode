class Solution {
    public int findClosestNumber(int[] nums) {
        Arrays.sort(nums);
        int pd=Math.abs(nums[0])-0;
        int dist=0, ans=nums[0];
        for(int i=1;i<nums.length;i++){
            dist=Math.abs(nums[i])-0;
            if(dist<pd){
                ans=nums[i];
                pd=dist;
            }
            else if(dist==pd){
                int curans=nums[i];
                if(ans<curans){
                    ans=curans;
                }
            }
        }
        return ans;
    }
}