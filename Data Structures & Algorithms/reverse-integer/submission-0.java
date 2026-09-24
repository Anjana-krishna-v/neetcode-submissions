class Solution {
    public int reverse(int x) {
        String s = String.valueOf(x);
        boolean neg = s.startsWith("-");
        if (neg) s = s.substring(1);            // strip the sign

        String rev = new StringBuilder(s).reverse().toString();
        if (neg) rev = "-" + rev;               // put the sign back

        try {
            return Integer.parseInt(rev);       // leading zeros are fine: "0321" -> 321
        } catch (NumberFormatException e) {
            return 0;                           // out of 32-bit range
        }
    }
}