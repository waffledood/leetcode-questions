class Solution {
    public int maxSubArray(int[] nums) {
        // Kadane's Algorithm
        int sum_sofar = 0;
        int sum_max = Integer.MIN_VALUE;
        
        for (int i: nums) {
            sum_sofar += i;
            if (sum_sofar > sum_max) {
                sum_max = sum_sofar;
            }
            if (sum_sofar < 0) {
                sum_sofar = 0;
            } 
        }
        
        return sum_max;
    }
}