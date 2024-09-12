class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
       HashSet<Character> d=new HashSet<>();
       for(char a:allowed.toCharArray())
       {
        d.add(a);
       } 
       int c=0;
       for(String b:words)
       {
        boolean h=true;
        for(char f:b.toCharArray())
        {
            if(!d.contains(f))
            {
                h=false;
            }
        }
        if(h==true)
        {
            c=c+1;
        }
       }
       return c;
    }
}