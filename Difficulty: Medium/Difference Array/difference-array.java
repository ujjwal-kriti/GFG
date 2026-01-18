

class Solution {
    public ArrayList<Integer> diffArray(int[] arr, int[][] opr) {

        int n = arr.length;

        // diff array of size n+1 to safely do diff[r+1]
        int[] diff = new int[n + 1];

        // Apply all operations on diff array
        for (int[] op : opr) {
            int l = op[0];
            int r = op[1];
            int v = op[2];

            diff[l] += v;          // start adding from l
            if (r + 1 < n) {
                diff[r + 1] -= v;  // stop adding after r
            }
        }

        // Build final array using prefix sum
        ArrayList<Integer> result = new ArrayList<>();
        int add = 0;

        for (int i = 0; i < n; i++) {
            add += diff[i];              // total value to add at index i
            result.add(arr[i] + add);    // updated value
        }

        return result;
    }
}
