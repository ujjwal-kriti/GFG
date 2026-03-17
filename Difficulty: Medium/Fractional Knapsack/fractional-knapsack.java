import java.util.*;

class Solution {

    // Item class (same as your code)
    static class Item {
        int value;
        int weight;

        Item(int value, int weight) {
            this.value = value;
            this.weight = weight;
        }
    }

    public double fractionalKnapsack(int[] val, int[] wt, int capacity) {

        int n = val.length;

        // Step 1: Convert arrays into Item[]
        Item[] arr = new Item[n];
        for (int i = 0; i < n; i++) {
            arr[i] = new Item(val[i], wt[i]);
        }

        // Step 2: Sort based on value/weight ratio
        Arrays.sort(arr, (a, b) -> {
            double r1 = (double) a.value / a.weight;
            double r2 = (double) b.value / b.weight;
            return Double.compare(r2, r1);
        });

        int curWeight = 0;
        double finalValue = 0.0;

        // Step 3: Apply greedy logic
        for (int i = 0; i < n; i++) {

            if (curWeight + arr[i].weight <= capacity) {
                curWeight += arr[i].weight;
                finalValue += arr[i].value;
            } else {
                int remain = capacity - curWeight;
                finalValue += ((double) arr[i].value / arr[i].weight) * remain;
                break;
            }
        }

        return finalValue;
    }
}