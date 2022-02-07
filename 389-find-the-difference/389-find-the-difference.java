class Solution {
    public char findTheDifference(String s, String t) {
        
        int n = s.length();
        int m = t.length();
         char res = 0;
        
        // 0^a = a
        //a^a = 0
        for(int i=0 ; i<n ; i++){
            res ^= s.charAt(i);
        }
        
        for(int i=0 ; i<m ; i++){
            res ^=  t.charAt(i);
           
        }
        
      
       return res;
    }
}