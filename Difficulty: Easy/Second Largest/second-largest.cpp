//{ Driver Code Starts
#include <bits/stdc++.h>

using namespace std;


// } Driver Code Ends
// User function template for C++
class Solution {
  public:
    int getSecondLargest(vector<int> &arr) {
        if(arr.size()<2)return -1;
        int maxnum=arr[0];
        int secmax=-1;
        for(int i=1;i<arr.size();i++){
            if(arr[i]>maxnum){
                secmax=maxnum;
                maxnum=arr[i];
            }else if(arr[i]>secmax && arr[i]!=maxnum){
                secmax=arr[i];
            }
        }
        return secmax;
    }
};

//{ Driver Code Starts.

int main() {
    int t;
    cin >> t;
    cin.ignore();
    while (t--) {
        vector<int> arr;
        string input;
        getline(cin, input);
        stringstream ss(input);
        int number;
        while (ss >> number) {
            arr.push_back(number);
        }
        Solution ob;
        int ans = ob.getSecondLargest(arr);
        cout << ans << endl;
        cout << "~" << endl;
    }
    return 0;
}

// } Driver Code Ends