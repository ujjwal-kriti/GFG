//{ Driver Code Starts
// Initial function template for C++

#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends

// User function Template for C++
class Solution {
  public:
    int upperBound(vector<int>& arr, int target) {
        // code here
        // int n=arr.size();
        // int ans=n;
        // for(int i=0;i<n;i++){
        //     if(arr[i]>target){
        //         return i;
        //     }
        // }
        // return n;
        
        
        int n=arr.size();
        int low=0,high=n-1;
        int ans=n;
        while(low<=high){
            int mid=low+(high-low)/2;
           if(arr[mid]>target) {
               ans=mid;
               high=mid-1;
           }
           else{
               low=mid+1;
           }
        }
        
         return ans;
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
        int ans = ob.upperBound(arr, d);
        cout << ans << endl;
    }
    return 0;
}
// } Driver Code Ends