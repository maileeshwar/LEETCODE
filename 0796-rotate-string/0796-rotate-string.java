class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()) return false;
        // return (s+s).contains(goal);
        String a=s+s;
        for(int i =0;i<s.length();i++){
            boolean match=true;
            for(int j=0;j<goal.length();j++){
                if(a.charAt(i+j)!=goal.charAt(j)){
                    match=false;
                    break;

                }
            }
            if(match) return true;
        }
        return false;
    }
}