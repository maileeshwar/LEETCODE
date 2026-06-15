class Solution {
    public boolean prime(int n){
        if(n<2) return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public int sumOfPrimesInRange(int n) {
        int t = n;
        int rev = 0;
        while(n>0){
            rev = rev * 10 + n % 10;
            n/=10;
        }
        int a = Math.max(t,rev);
        int b = Math.min(t,rev);
        int s=0;
        for(int i = b;i<=a;i++){
            if(prime(i)) s+=i;
        }
        return s;
    }
}