// Last updated: 13/08/2026, 23:10:23
1/**
2 * Using ArrayList & HashMap
3 *
4 * Time Complexity: All function have average O(1)
5 *
6 * Space Complexity: O(N)
7 *
8 * N = Number of values currently stored in the data structure.
9 */
10class RandomizedSet {
11
12    List<Integer> nums;
13    Map<Integer, Integer> idxMap;
14    Random random;
15
16    public RandomizedSet() {
17        nums = new ArrayList<>();
18        idxMap = new HashMap<>();
19        random = new Random();
20    }
21
22    public boolean insert(int val) {
23        if (idxMap.containsKey(val)) {
24            return false;
25        }
26
27        idxMap.put(val, nums.size());
28        nums.add(val);
29        return true;
30    }
31
32    public boolean remove(int val) {
33        if (!idxMap.containsKey(val)) {
34            return false;
35        }
36
37        int idx = idxMap.get(val);
38        int lastIdx = nums.size() - 1;
39        if (idx != lastIdx) {
40            int lastVal = nums.get(lastIdx);
41            nums.set(idx, lastVal);
42            idxMap.put(lastVal, idx);
43        }
44        nums.remove(lastIdx);
45        idxMap.remove(val);
46        return true;
47    }
48
49    public int getRandom() {
50        return nums.get(random.nextInt(nums.size()));
51    }
52}