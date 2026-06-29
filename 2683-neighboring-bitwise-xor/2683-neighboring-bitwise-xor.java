class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int a = 0;
        for(int n :derived){
            a^=n;

        }
        if(a==0) return true;
        return false;
    }
}