class Solution {
    public String reverseOnlyLetters(String s) {
        StringBuilder r = new StringBuilder();
        int j = s.length() - 1;

        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                while (!Character.isLetter(s.charAt(j))) {
                    j--;
                }
                r.append(s.charAt(j));
                j--;
            } else {
                r.append(s.charAt(i));
            }
        }

        return r.toString();
    }
}
