class Solution {

    //
    public boolean Is_Valid(char [][]board,int i,int j,char ch,boolean vis[][]){
        
        int r=board.length;
        int c=board[0].length;
        
        if(i>=0&&i<r&&j>=0&&j<c&&ch==board[i][j]&&vis[i][j]==false) return true;
        return false;
    }
public boolean Is_There_A_Path(char[][] board,int i,int j,String word,int idx,boolean vis[][]){
    vis[i][j]=true;
    if(idx>=word.length()) return true;
    if(Is_Valid(board,i-1,j,word.charAt(idx),vis)&&Is_There_A_Path(board,i-1,j,word,idx+1,vis)) return true;
    if(Is_Valid(board,i+1,j,word.charAt(idx),vis)&&Is_There_A_Path(board,i+1,j,word,idx+1,vis)) return true;
    if(Is_Valid(board,i,j-1,word.charAt(idx),vis)&&Is_There_A_Path(board,i,j-1,word,idx+1,vis)) return true;
    if(Is_Valid(board,i,j+1,word.charAt(idx),vis)&&Is_There_A_Path(board,i,j+1,word,idx+1,vis)) return true;
    vis[i][j]=false;
    return false;
}
    public boolean exist(char[][] board, String word) {

        //row of the grid
        int r=board.length;

        //column of the grid
        int c=board[0].length;

        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                //array to store the letters of a visited cell
                boolean vis[][]=new boolean[r][c];

                if(board[i][j]==word.charAt(0)&&Is_There_A_Path(board,i,j,word,1,vis)) return true;
            }
        }
        return false;
    }
}
