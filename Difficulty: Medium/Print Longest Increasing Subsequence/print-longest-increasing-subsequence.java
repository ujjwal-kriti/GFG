import java.util.*;

class Solution {
    public ArrayList<Integer> getLIS(int arr[]) {
        int n = arr.length;

        int[] dp = new int[n];       // length of LIS ending at i
        int[] parent = new int[n];   // to reconstruct path

        Arrays.fill(dp, 1);

        for (int i = 0; i < n; i++) {
            parent[i] = i; // initially points to itself

            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j] && dp[j] + 1 > dp[i]) {
                    dp[i] = dp[j] + 1;
                    parent[i] = j;
                }
            }
        }

        // find index of max LIS
        int maxLen = 0;
        int lastIndex = 0;

        for (int i = 0; i < n; i++) {
            if (dp[i] > maxLen) {
                maxLen = dp[i];
                lastIndex = i;
            }
        }

        // reconstruct LIS
        ArrayList<Integer> lis = new ArrayList<>();

        while (parent[lastIndex] != lastIndex) {
            lis.add(arr[lastIndex]);
            lastIndex = parent[lastIndex];
        }
        lis.add(arr[lastIndex]);

        Collections.reverse(lis);
        return lis;
    }
}