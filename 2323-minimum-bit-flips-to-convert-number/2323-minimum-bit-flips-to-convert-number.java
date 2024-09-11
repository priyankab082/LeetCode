class Solution {
    public int minBitFlips(int start, int goal) {
        String a=Integer.toBinaryString(start);
        String b=Integer.toBinaryString(goal);
        int n=Math.max(a.length(),b.length());
        a=String.format("%" + n + "s",a).replace(' ','0');
        b=String.format("%" + n + "s",b).replace(' ','0');
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(a.charAt(i)!=b.charAt(i))
            {
                c=c+1;
            }
        }
        return c;
    }
}