class Solution {
    public int countCommas(int n) {
        long commas=0;
        if(n>=1000){
            commas+=Math.min(n,999999)-999+0;
        }
        if(n>=1000000){
            commas+=(Math.min(n,999999999)-999999)*2L;
        }
        if(n>=1000000000){
            commas+=(long)(n-999999999)*3;
        }
        return(int)commas;
    }
}