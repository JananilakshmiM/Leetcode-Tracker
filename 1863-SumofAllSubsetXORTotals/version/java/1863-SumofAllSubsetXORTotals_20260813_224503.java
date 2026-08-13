// Last updated: 13/08/2026, 22:45:03
1class Solution {
2    class Term implements Comparable<Term>{
3        int coef;
4        List<String> vars;
5        
6        public Term(int n) {
7            vars = new ArrayList<>();
8            coef = n;
9        }
10        
11        public Term(String s) {
12            vars = new ArrayList<>();
13            vars.add(s);
14            coef = 1;
15        }
16        
17        @Override
18        public String toString() {
19            return coef + varString();
20        }
21        
22        public String varString() {
23            Collections.sort(vars);
24            StringBuilder sb = new StringBuilder();
25            for (String s : vars) {
26                sb.append('*');
27                sb.append(s);
28            }
29            return sb.toString();
30        }
31        
32        @Override
33        public boolean equals(Object o) {
34            return varString().equals(((Term)o).varString());
35        }
36        
37        @Override
38        public int compareTo(Term t) {
39            if (vars.size() != t.vars.size()) {
40                return t.vars.size() - vars.size();
41            }
42            return varString().compareTo(t.varString());
43        }
44        
45        public Term multi(Term t) {
46            Term result = new Term(coef);
47            result.vars.addAll(vars);
48            result.coef *= t.coef;
49            for (String v : t.vars) {
50                result.vars.add(v);
51            }
52            return result;
53        }
54    }
55    class Sequence {
56        List<Term> terms;
57        
58        public Sequence() {
59            terms = new ArrayList<>();
60        }
61        
62        public Sequence(int n) {
63            terms = new ArrayList<>();
64            terms.add(new Term(n));
65        }
66        
67        public Sequence(String s) {
68            terms = new ArrayList<>();
69            terms.add(new Term(s));
70        }
71        
72        public Sequence(Term t) {
73            terms = new ArrayList<>();
74            terms.add(t);
75        }
76        
77        public Sequence add(Sequence sq) {
78            for (Term t2 : sq.terms) {
79                boolean found = false;
80                for (Term t1 : terms) {
81                    if (t1.equals(t2)) {
82                        t1.coef += t2.coef;
83                        if (t1.coef == 0) {
84                            terms.remove(t1);
85                        }
86                        found = true;
87                        break;
88                    }
89                }
90                if (!found && t2.coef != 0) {
91                    terms.add(t2);
92                }
93            }
94            return this;
95        }
96        
97        public Sequence multi(Sequence sq) {
98            Sequence result = new Sequence();
99            for (Term t1 : terms) {
100                for (Term t2 : sq.terms) {
101                    result.add(new Sequence(t1.multi(t2)));
102                }
103            }
104            return result;
105        }
106    }
107    private int i;
108    public List<String> basicCalculatorIV(String expression, String[] evalvars, int[] evalints) {
109        Map<String, Integer> map = new HashMap<>();
110        for (int i = 0; i < evalvars.length; i++) {
111            map.put(evalvars[i], evalints[i]);
112        }
113        i = 0;
114        Sequence sq = helper(expression, map);
115        List<String> result = new LinkedList<>();
116        Collections.sort(sq.terms);
117        for (Term t : sq.terms) {
118            if (!t.toString().equals("0")) {
119                result.add(t.toString());
120            }
121        }
122        return result;
123    }
124    private Sequence helper(String e, Map<String, Integer> map) {
125        Stack<Sequence> stack = new Stack<>();
126        int flag = 1;
127        stack.push(new Sequence(0));
128        while (i < e.length()) {
129            if (e.charAt(i) == ' ') {
130                i++;
131                continue;
132            }
133            if (e.charAt(i) == '(') {
134                i++;
135                Sequence sq = helper(e, map);
136                addToStack(stack, sq, flag);
137            } else if (e.charAt(i) == ')') {
138                break;
139            } else if (e.charAt(i) == '+') {
140                flag = 1;
141            } else if (e.charAt(i) == '-') {
142                flag = -1;
143            } else if (e.charAt(i) == '*') {
144                flag = 0;
145            } else if (Character.isDigit(e.charAt(i))) {
146                int j = i + 1;
147                while (j < e.length() && Character.isDigit(e.charAt(j))) {
148                    j++;
149                }
150                int coef = Integer.valueOf(e.substring(i, j));
151                i = j - 1;
152                addToStack(stack, new Sequence(coef), flag);
153            } else {
154                int j = i + 1;
155                while (j < e.length() && e.charAt(j) != ' ' && e.charAt(j) != ')') {
156                    j++;
157                }
158                String var = e.substring(i, j);
159                i = j - 1;
160                if (map.containsKey(var)) {
161                    addToStack(stack, new Sequence(map.get(var)), flag);
162                } else {
163                    addToStack(stack, new Sequence(var), flag);
164                }
165            }
166            i++;
167        }
168        Sequence result = new Sequence();
169        while (!stack.isEmpty()) {
170            result.add(stack.pop());
171        }
172        return result;
173    }
174    private void addToStack(Stack<Sequence> stack, Sequence sq, int flag) {
175        if (flag == 0) {
176            stack.push(stack.pop().multi(sq));
177        } else {
178            stack.push(sq.multi(new Sequence(flag)));
179        }
180    }
181}