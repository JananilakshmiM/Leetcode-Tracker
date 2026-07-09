// Last updated: 09/07/2026, 15:05:37
class Solution {
    public String[] createGrid(int m, int n) {
        String[] grid=new String[m];
        StringBuilder f=new StringBuilder();
        for (int j=0; j<n; j++){
            f.append('.');
        }
        grid[0]=f.toString();
        StringBuilder o=new StringBuilder();
        for(int j=0; j<n-1; j++){
            o.append('#');
        }
        o.append('.');
        String g=o.toString();
        for(int i=1; i<m; i++){
            grid[i] = g;
        }
        return grid;
        
    }
}