// Last updated: 02/09/2026, 09:31:36
1class Solution {
2    public String largestNumber(int[] nums) {
3        String[] arr = new String[nums.length];
4        for (int i = 0; i < nums.length; i++) {
5            arr[i] = String.valueOf(nums[i]);
6        }
7        Arrays.sort(arr, (a, b) -> {
8            String ab = a + b;
9            String ba = b + a;
10            return ba.compareTo(ab);
11        });
12
13        if (arr[0].equals("0")) {
14            return "0";
15        }
16
17        StringBuilder result = new StringBuilder();
18
19        for (String s : arr) {
20            result.append(s);
21        }
22
23        return result.toString();
24    }
25}
26