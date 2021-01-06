class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        HashMap<Character, Integer> hash = new HashMap<Character, Integer>();
        int longest = 0;
        int currLong = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (hash.containsKey(c)) {
                i = hash.remove(c);
                currLong = 0;
                hash.clear();
            } else {
                hash.put(c, i);
                currLong++;
                if (currLong > longest) {
                    longest = currLong;
                }
            }
        }
        
        return longest;
        
    }
}