class Solution {

    /*
    // Brute Force solution
    public int findMaxLength(int[] nums) {
        
        int final_max = 0;
        
        for (int i = 0; i < nums.length; i++) {
            int curr_max, count_0, count_1;
            curr_max = count_0 = count_1 = 0;
            
            for (int j = i; j < nums.length; j++) {
                if (nums[j] == 0) count_0++;
                else if (nums[j] == 1) count_1++;
                if (count_0 == count_1) curr_max = count_0 + count_1; //curr_max+=2;
            }
            
            if (curr_max > final_max) final_max = curr_max;
        }
        
        return final_max;
    }
    */

    // HashMap solution
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
        hash.put(0, -1);
        
        int maxlen = 0;
        int count = 0;
        
        for (int i = 0; i < nums.length; i++) {
            count += ( nums[i] == 1 ? 1 : -1 );
            if (hash.containsKey(count)) {
                maxlen = Math.max(maxlen, i - hash.get(count));
            } else {
                hash.put(count, i);
            }
        }
        
        return maxlen;
    }
}