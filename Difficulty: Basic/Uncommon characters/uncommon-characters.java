// User function Template for Java

class Solution {
    String uncommonChars(String s1, String s2) {
        int[] freq1=new int[26];
        int[] freq2=new int[26];
        
        //count character of s1
        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            freq1[ch-'a']++;
        }
        
        for(int i=0;i<s2.length();i++){
            char ch=s2.charAt(i);
            freq2[ch-'a']++;
        }
        StringBuilder result=new StringBuilder();
        for(int i=0;i<26;i++){
        if((freq1[i]>0 && freq2[i]==0)||(freq1[i]==0 && freq2[i]>0)){
            result.append((char)(i+'a'));
        }
        }
        return result.toString();
    }
}