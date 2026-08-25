class Solution {
    public boolean squareIsWhite(String n) {
        int l=n.charAt(1)-'h';
        int num=n.charAt(0)-'8';
        boolean r = (l+num)%2!=0;
        return r;
    }
}