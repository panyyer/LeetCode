public class Solution {
    public char[][] updateBoard(char[][] board, int[] click) {
        if(board[click[0]][click[1]]!='M') {
           dfs(click[0],click[1],board);
        } else {
            board[click[0]][click[1]] = 'X';
        }
        return board;
    }
    
    int[] y = {-1,0,1};
    int[] x = {-1,0,1};
    public void dfs(int i, int j, char[][] board) {
        if(i<0 || i==board.length || j<0 || j==board[0].length || board[i][j]!='E') return;
    
        int cnt = getBomb(i,j,board);
        
        if(cnt==0) {
            board[i][j] = 'B';
            for(int k : y){
                for(int l : x){
                    dfs(i+k,j+l,board);
                }
            }
        } else {
            board[i][j] = (char)(cnt+48);
        }
    }
    
    public int getBomb(int i, int j, char[][] board) {
        int cnt = 0;
        for(int k : y) {
            for(int l : x) {
                if(i+k<0 || i+k==board.length || j+l<0 || j+l==board[0].length) continue;
                if(board[i+k][j+l]=='M') cnt++;
            }
        }
        return cnt;
    }
}