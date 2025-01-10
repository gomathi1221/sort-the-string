class Solution 
{ 
    String sort(String s) 
    {
       char[] t=s.toCharArray();
       Arrays.sort(t);
       String d="";
       for(int i=0;i<t.length;i++){
           d=d+t[i];
       }
       return d;
     
    }
   
} 