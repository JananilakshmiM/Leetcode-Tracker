// Last updated: 09/07/2026, 15:11:52
class Solution {

    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {

        Set<String> dict = new HashSet<>(wordList);
        List<List<String>> ans = new ArrayList<>();

        if (!dict.contains(endWord))
            return ans;

        Map<String, List<String>> parent = new HashMap<>();
        Map<String, Integer> level = new HashMap<>();

        Queue<String> queue = new LinkedList<>();
        queue.offer(beginWord);
        level.put(beginWord, 0);

        int wordLen = beginWord.length();

        while (!queue.isEmpty()) {
            String word = queue.poll();
            int currLevel = level.get(word);

            char[] arr = word.toCharArray();

            for (int i = 0; i < wordLen; i++) {

                char old = arr[i];

                for (char ch = 'a'; ch <= 'z'; ch++) {

                    arr[i] = ch;
                    String next = new String(arr);

                    if (!dict.contains(next))
                        continue;

                    if (!level.containsKey(next)) {
                        level.put(next, currLevel + 1);
                        queue.offer(next);
                        parent.put(next, new ArrayList<>());
                        parent.get(next).add(word);
                    }
                    else if (level.get(next) == currLevel + 1) {
                        parent.get(next).add(word);
                    }
                }

                arr[i] = old;
            }
        }

        if (!level.containsKey(endWord))
            return ans;

        List<String> path = new ArrayList<>();
        backtrack(endWord, beginWord, parent, path, ans);

        return ans;
    }

    private void backtrack(String word,
                           String beginWord,
                           Map<String, List<String>> parent,
                           List<String> path,
                           List<List<String>> ans) {

        path.add(word);

        if (word.equals(beginWord)) {
            List<String> temp = new ArrayList<>(path);
            Collections.reverse(temp);
            ans.add(temp);
        } else {

            for (String p : parent.getOrDefault(word, new ArrayList<>())) {
                backtrack(p, beginWord, parent, path, ans);
            }
        }

        path.remove(path.size() - 1);
    }
}