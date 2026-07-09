// Last updated: 09/07/2026, 15:06:08
class Solution {
    public int generateKey(int num1, int num2, int num3) {
        
        String s1 = String.format("%04d", num1);
        String s2 = String.format("%04d", num2);
        String s3 = String.format("%04d", num3);

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 4; i++) {
            int digit1 = s1.charAt(i) - '0';
            int digit2 = s2.charAt(i) - '0';
            int digit3 = s3.charAt(i) - '0';

            int minDigit = Math.min(digit1, Math.min(digit2, digit3));

            sb.append(minDigit);
        }

        String result = sb.toString().replaceFirst("^0+", "");

        return result.equals("") ? 0 : Integer.parseInt(result);
    }
}