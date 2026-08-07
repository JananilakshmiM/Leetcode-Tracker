// Last updated: 07/08/2026, 18:16:32
1class Solution {
2    public boolean canPlaceFlowers(int[] flowerbed, int n) {
3        int flowerbedSize = flowerbed.length;
4        for (int i = 0; i < flowerbedSize && n > 0; i++) {
5            boolean prev = i == 0 || flowerbed[i - 1] == 0;
6            boolean fut = i == flowerbedSize - 1 || flowerbed[i + 1] == 0;
7            if (prev && fut && flowerbed[i] == 0) {
8                flowerbed[i] = 1;
9                n--;
10            }
11        }
12        return n <= 0;  
13    }
14}