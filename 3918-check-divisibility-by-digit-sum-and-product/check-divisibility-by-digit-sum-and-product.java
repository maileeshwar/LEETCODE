class Solution {
    public boolean checkDivisibility(int n) {
        int a=n;
        int sum = 0;
        int pro=1;
        while(n!=0){
            int d=n%10;
            sum+=d;
            pro*=d;
            n/=10;

        }
        int r = sum+pro;
        return a%r==0;
    }
}