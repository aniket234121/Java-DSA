class AllPossibleSubstring{
     public static void Substrings(String str,String curr,int index)
    {
        if(index==str.length())
        {
            System.out.println(curr);
            return;
        }
        Substrings(str,curr,index+1);
        Substrings(str,curr+str.charAt(index),index+1);
        
        
    }
    public static void main(String[] args) {
    
    Substrings("abc","",0);
    }
}