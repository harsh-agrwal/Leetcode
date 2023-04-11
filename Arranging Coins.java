class Solution {
    public int arrangeCoins(int n) {
        long s=1,e=n,mid,ans=0;
        while(s<=e){
            mid = s +(e-s)/2;
            if((mid*(mid+1))/2<=n){
                ans=mid;
                s=mid+1;
            }else{
                e=mid-1;
            }
        }
        return (int)ans;
    }
}
