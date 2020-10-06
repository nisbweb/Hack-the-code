#include<bits/stdc++.h>
using namespace std;
#define ll long long int
int main(){
    ll t;
    cin>>t;
    while(t--){
        ll n;
        cin>>n;
        if(n%2==0){
            ll val=n/2;
            cout<<val<<endl;
            for(int i=0; i<val; i++){
                cout<<2<<" ";
            }
            cout<<endl;
        }
        else{
            ll rem=n-3;
            ll val=rem/2;
            cout<<(val+1)<<endl;
            for(int i=0; i<val; i++){
                cout<<2<<" ";
            }
            cout<<3<<endl;
        }
    }
}
