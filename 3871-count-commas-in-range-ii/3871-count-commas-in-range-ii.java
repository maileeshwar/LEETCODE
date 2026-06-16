class Solution {
    public long countCommas(long n) {
        
        long i = 1000;
        long c=0;
        while(i<=n){
            c += n-i+1;
            i*=1000;

        }
        return c;
    }
}