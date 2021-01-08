class Solution {
    public String multiply(String num1, String num2) {

        // incorrect answer as this Solution does not consider cases when inputs num1 & num2 are numbers greater than the value of int
        
        int carry = 0;
        int ans = 0;
        
        int longer = num1.length() >= num2.length() ? num1.length() : num2.length();
        //int shorter = num1.length() < num2.length() ? num1.length() : num2.length();
        int shorter = num1.length() >= num2.length() ? num2.length() : num1.length();
        String sLong = num1.length() >= num2.length() ? num1 : num2;
        String sShort = num1.length() < num2.length() ? num1 : num2;
        
        for (int i = shorter - 1; i >= 0; i--) {
            
            int tens = (int)Math.pow(10, (shorter-1) - i);
            
            for (int j = longer - 1; j >= 0; j--) {
                int sum = (sLong.charAt(j) - '0') * (sShort.charAt(i) - '0');
                ans += (sum % 10 + carry) * tens;
                carry = sum / 10;
                //System.out.println(String.format("i: %s, j: %s, sum: %s, tens: %d, carry: %d, ans: %d", i,j,sum,tens,carry,ans));
                tens *= 10;
            }
            if (carry > 0) {
                ans += (carry * tens); // *10
                carry = 0;
            }
            //System.out.println(". ans: " + ans);
            tens *= 10;
        }
        
        return String.valueOf(ans);
        
    }
}