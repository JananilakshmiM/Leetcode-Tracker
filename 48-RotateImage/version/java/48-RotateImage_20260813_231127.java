// Last updated: 13/08/2026, 23:11:27
1class Solution {
2    int N = 0;
3    ListNode head = null;
4    public Solution(ListNode head) {
5        this.head = head;
6    }
7    
8    public int getRandom() {
9        ListNode p = this.head;
10        int i = 1, ans = 0;
11        while (p != null) {
12            if (Math.random() * i < 1) ans = p.val;
13            p = p.next;
14            i ++;
15        }
16        return ans;
17    }
18}