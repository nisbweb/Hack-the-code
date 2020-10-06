#include<bits/stdc++.h>
using namespace std;
#define ll long long int

// code by Abhinav Verma

// complexity: O(N)
int main(){
    ll t;
    cin>>t;
    while(t--){
        ll k;
        cin>>k;
        ll arr[k];
        for(ll i=0; i<k; i++){
            cin>>arr[i];
        }
        int i=0;
        int j=k-1;
        ll ascore=0;
        ll jscore=0;
        ll ok=0;
        while(i<=j){
            if(arr[j]>arr[i]){
                if(ok==0){
                    ascore+=arr[j];
                    j--;
                    ok=ok^1;
                }
                else{
                    jscore+=arr[j];
                    j--;
                    ok=ok^1;
                }

            }
            else{
                if(ok==0){
                    ascore+=arr[i];
                    i++;
                    ok=ok^1;
                }
                else{
                    jscore+=arr[i];
                    i++;
                    ok=ok^1;
                }
            }
        }
        cout<<ascore<<" "<<jscore<<endl;
    
    }
}