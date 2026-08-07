// Last updated: 07/08/2026, 18:31:51
1class Solution {
2    public String shortestCompletingWord(String licensePlate, String[] words) {
3        String target = licensePlate.toLowerCase();
4        int [] charMap = new int[26];
5        for(int i = 0 ; i < target.length(); i++){
6            if(Character.isLetter(target.charAt(i))) charMap[target.charAt(i) - 'a']++;
7        }
8        int minLength = Integer.MAX_VALUE;
9        String result = null;
10        for (int i = 0; i < words.length; i++){
11            String word = words[i].toLowerCase();
12            if(matches(word, charMap) && word.length() < minLength) {
13                minLength = word.length();
14                result  = words[i];
15            }
16        }
17        return result;
18    }
19    private boolean matches(String word, int[] charMap){
20        int [] targetMap = new int[26];
21        for(int i = 0; i < word.length(); i++){
22            if(Character.isLetter(word.charAt(i))) targetMap[word.charAt(i) - 'a']++;
23        }
24        
25        for(int i = 0; i < 26; i++){
26            if(charMap[i]!=0 && targetMap[i]<charMap[i]) return false;
27        }
28        return true;
29    }
30}