import java.util.*;

class Solution {

    public List<String> AllPossibleStrings(String s) {

        // List to store all subsequences
        List<String> ans = new ArrayList<>();

        // Start recursion
        generateSubsequence(0, s, "", ans);

        // Sort in lexicographical order
        Collections.sort(ans);

        return ans;
    }

    // Recursive function
    public void generateSubsequence(int index,
                                    String s,
                                    String current,
                                    List<String> ans) {

        // Base Case
        if(index == s.length()) {

            // Ignore empty subsequence
            if(!current.isEmpty()) {
                ans.add(current);
            }

            return;
        }

        // Include current character
        generateSubsequence(index + 1,
                            s,
                            current + s.charAt(index),
                            ans);

        // Exclude current character
        generateSubsequence(index + 1,
                            s,
                            current,
                            ans);
    }
}