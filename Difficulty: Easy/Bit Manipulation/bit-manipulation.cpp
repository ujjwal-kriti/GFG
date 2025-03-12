//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends

class Solution {
  public:
    void bitManipulation(int num, int i) {
        // your code here
       int set= (num | (1<<(i-1)));
       int clear=(num & ~(1<<(i-1)));
       int get=(num &(1<<(i-1)))?1:0;
        cout<<get<< " "<<set<< " "<<clear<< " ";
    }
};


//{ Driver Code Starts.

int main() {
    int t;
    cin >> t;
    while (t--) {
        int n, i;
        cin >> n >> i;
        Solution ob;
        ob.bitManipulation(n, i);
        cout << "\n";
    
cout << "~" << "\n";
}
    return 0;
}
// } Driver Code Ends