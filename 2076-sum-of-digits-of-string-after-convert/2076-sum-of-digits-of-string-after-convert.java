class Solution {
    public int getLucky(String s, int k) {
        StringBuilder str=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            int a=(int)s.charAt(i)-'a'+1;
            str.append(a);
        }
        String st=str.toString();
        int sum=0;
        for(int i=0;i<st.length();i++)
        {
            sum=sum+(st.charAt(i)-'0');
        }
        if(k==1)
        {
        return sum;
        }
        k=k-1;
        while(k>0 && sum>9)
        {
            int p=0;
            while(sum>0)
            {
                int rem=sum%10;
                p=p+rem;
                sum/=10;
            }
            sum=p;
            k=k-1;
        }
        return sum;
    }
}