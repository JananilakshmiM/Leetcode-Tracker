// Last updated: 09/07/2026, 15:07:14
class Solution {

    class DSU {
        int[] parent, size;

        DSU(int n) {
            parent = new int[n];
            size = new int[n];

            for (int i = 0; i < n; i++) {
                parent[i] = i;
                size[i] = 1;
            }
        }

        int find(int x) {
            if (parent[x] != x)
                parent[x] = find(parent[x]);
            return parent[x];
        }

        void union(int a, int b) {
            int pa = find(a);
            int pb = find(b);

            if (pa == pb)
                return;

            if (size[pa] < size[pb]) {
                int temp = pa;
                pa = pb;
                pb = temp;
            }

            parent[pb] = pa;
            size[pa] += size[pb];
        }
    }

    public int[] groupStrings(String[] words) {

        int n = words.length;
        DSU dsu = new DSU(n);

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {

            int mask = 0;

            for (char c : words[i].toCharArray())
                mask |= 1 << (c - 'a');

            if (map.containsKey(mask))
                dsu.union(i, map.get(mask));
            else
                map.put(mask, i);
        }

        for (int i = 0; i < n; i++) {

            int mask = 0;

            for (char c : words[i].toCharArray())
                mask |= 1 << (c - 'a');

            for (int b = 0; b < 26; b++) {
                int next = mask ^ (1 << b);

                if (map.containsKey(next))
                    dsu.union(i, map.get(next));
            }

            for (int remove = 0; remove < 26; remove++) {

                if ((mask & (1 << remove)) == 0)
                    continue;

                int removed = mask ^ (1 << remove);

                for (int add = 0; add < 26; add++) {

                    if ((removed & (1 << add)) != 0)
                        continue;

                    int next = removed | (1 << add);

                    if (map.containsKey(next))
                        dsu.union(i, map.get(next));
                }
            }
        }

        int groups = 0;
        int largest = 0;

        Map<Integer, Integer> count = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int root = dsu.find(i);
            count.put(root, count.getOrDefault(root, 0) + 1);
        }

        groups = count.size();

        for (int val : count.values())
            largest = Math.max(largest, val);

        return new int[]{groups, largest};
    }
}