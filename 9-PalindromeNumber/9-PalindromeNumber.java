// Last updated: 09/07/2026, 15:13:17
class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int rev = 0;
        int original = x;
        while(x != 0) {
            rev *= 10;
            rev += x % 10;
            x /= 10;

        }
        if(original == rev) return true;
        else return false;
    }
}