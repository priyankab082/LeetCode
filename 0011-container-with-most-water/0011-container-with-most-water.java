class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
        int re=0;
        while(l<=r)
        {
            int d=Math.abs(r-l);
            int w=Math.min(height[l],height[r]);
            int ans=d*w;
            re=Math.max(ans,re);
            if(height[l]<height[r])
            {
                l++;
            }
            else
            {
                r--;
            }
        }
        return re;
    }
}