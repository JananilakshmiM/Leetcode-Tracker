// Last updated: 09/07/2026, 15:05:32
class Solution {
    public int maxDistance(String moves) {
        int x=0;
        int y=0;
        int wild=0;
        for(char move:moves.toCharArray())  {
            if(move=='U') {
               y++;
        }else if(move=='D'){
                y--;
                
        }
                 else if(move=='L'){
                     x--;
                     
                 }
                 else if(move=='R'){
                     x++;
                 }
                 else if(move=='_'){
                     wild++;
                 }
        }
                 return Math.abs(x)+Math.abs(y)+wild;
        
    }
}