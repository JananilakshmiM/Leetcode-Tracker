// Last updated: 10/09/2026, 14:43:01
1class Solution {
2    public String convert(String s, int numRows) {
3        ArrayList<ArrayList<Character>> matrix = new ArrayList<>();
4        for(int i = 0;i<numRows;i++){
5            matrix.add(new ArrayList<>());
6        }
7        if(numRows==1)
8        return s;
9        int c = 0;
10        int z = 0;
11        boolean forward = true,backward = false;
12        while(c<s.length()){
13            char ch = s.charAt(c);
14            matrix.get(z).add(ch);
15            if(z==0 ){
16                z++;
17                forward = true;
18                backward = false;
19            }
20            else if(z==(numRows-1))
21            {
22                z--;
23                forward = false;
24                backward = true;
25            }
26            else if(forward == true){
27                z++;
28            }
29            else if(backward == true){
30                z--;
31            }
32            c++;
33        }
34        StringBuilder sb = new StringBuilder("");
35        for(int i = 0;i<matrix.size();i++){
36            for(int j = 0;j<matrix.get(i).size();j++){
37             sb.append( matrix.get(i).get(j));
38            }
39        }
40        return sb.toString();
41    }
42}
43