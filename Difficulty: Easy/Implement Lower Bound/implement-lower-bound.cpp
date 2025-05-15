//{ Driver Code Starts
// Initial function template for C++

#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends

// User function Template for C++
class Solution {
  public:
    int lowerBound(vector<int>& arr, int target) {
        // code here
        // int n=arr.size();
        // int low=0,high=n-1;
        // while(low<=high){
        //     int mid=low+(high-low)/2;
        //     if(arr[mid]==target) return mid;
        //     else if(target>arr[mid])  low=mid+1;
        //     else
        //     high=mid-1;
        // }
        int n=arr.size();
        for(int i=0;i<n;i++){
            if(arr[i]>=target){
                return i;
            }
        }
        return n;
    }
};



//{ Driver Code Starts.

int main() {
    int test_case;
    cin >> test_case;
    cin.ignore();
    while (test_case--) {

        int d;
        vector<int> arr, brr, crr;
        string input;
        getline(cin, input);
        stringstream ss(input);
        int number;
        while (ss >> number) {
            arr.push_back(number);
        }
        getline(cin, input);
        ss.clear();
        ss.str(input);
        while (ss >> number) {
            crr.push_back(number);
        }
        d = crr[0];
        int n = arr.size();
        Solution ob;
        int ans = ob.lowerBound(arr, d);
        cout << ans << endl;

        cout << "~"
             << "\n";
    }
    return 0;
}
// } Driver Code Ends