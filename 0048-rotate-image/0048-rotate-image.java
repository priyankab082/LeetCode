class Solution {
    public void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<i;j++)
            {
                int t=matrix[j][i];
                matrix[j][i]=matrix[i][j];
                matrix[i][j]=t;
            }
        }
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length/2;j++)
            {
                int t=matrix[i][matrix.length-1-j];
               matrix[i][matrix.length-1-j]=matrix[i][j];
                matrix[i][j]=t;
            }
        }
    }
}