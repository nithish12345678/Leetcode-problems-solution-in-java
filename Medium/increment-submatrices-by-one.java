class Solution {
    public int[][] rangeAddQueries(int n, int[][] queries) {
        int[][] ans=new int[n][n];
        for(int i=0;i<queries.length;i++){
            int row1i=queries[i][0], col1i=queries[i][1], row2i=queries[i][2], col2i=queries[i][3];
            
            
            for(int j=row1i;j<=row2i;j++){
                
                for(int k=col1i;k<=col2i;k++){
                    ans[j][k]+=1;
                }
            }
        }
        return ans;
    }
}