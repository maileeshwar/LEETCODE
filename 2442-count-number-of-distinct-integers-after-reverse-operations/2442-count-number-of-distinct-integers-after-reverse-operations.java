class Solution {
    public int countDistinctIntegers(int[] nums) {
        Set<Integer> B = new HashSet<>();

        for (int c : nums) {
            int C = reverse(c);
            B.add(c);
            B.add(C);
        }

        return B.size();
    }

    private int reverse(int num) {
        int rev = 0;
        while (num > 0) {
            rev = rev * 10 + (num % 10);
            num /= 10;
        }
        return rev;
    }
}