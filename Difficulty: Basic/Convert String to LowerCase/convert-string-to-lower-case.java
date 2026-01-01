// User function template for Java

class Solution {
    static String toLower(String s) {
        // code here
     StringBuilder ans=new StringBuilder();
     for(int i=0;i<s.length();i++){
         char ch=s.charAt(i);
         if(ch>='A' && ch<= 'Z'){
             ch=(char)(ch+32);
         }
         ans.append(ch);
     }
     return ans.toString();
    }
}