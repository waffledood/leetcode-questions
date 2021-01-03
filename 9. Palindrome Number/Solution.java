class Solution {
    // involves conversion of integer to String
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        else if (x < 10) return true;
        
        String number = String.valueOf(x);
        
        for (int i = 0, j = number.length()-1; i < number.length()/2; i++, j--) {
            if (!number.substring(i,i+1).equals(number.substring(j,j+1))) return false;
        }
        
        return true;
    }

    // no conversion of integer to String
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) return false;
        else if (x < 10) return true;
        
        int num = 0;
        
        while (x > num) {
            num = num * 10 + x % 10;
            x /= 10;
        }
        
        if (x == num || x == num / 10) return true;
        return false;
    }
}