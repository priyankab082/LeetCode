class Solution {
    public int longestSubarray(int[] nums) {
        int m=nums[0];
        for(int i:nums)
        {
          m=Math.max(i,m);
        }
        int k=0;
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==m)
            {
                c=c+1;
                k=Math.max(c,k);
            }
            else
            {
                c=0;
            }
        }
        return k;
    }
}