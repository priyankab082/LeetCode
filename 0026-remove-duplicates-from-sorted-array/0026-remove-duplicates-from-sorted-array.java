class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        
        int u = 0; 
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[u]) {
                u++;
                nums[u] = nums[i];
            }
        }

        return u + 1;
    }
}