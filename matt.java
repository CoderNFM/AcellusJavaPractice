public class matt {
    public static void main(String[] args) {
        int[][] mat = {{-1,3,1,-3,4,5,2,0,-5,-1},{0,4,-3,1,4,3,-1,0,-2,3}};
        int total = 0;

        for (int row = 0; row < mat.length; row++)
        {
            for(int col = 0; col<mat[0].length; col++)
            {
                if (mat[row][col]%4 == 0)
                {
                    mat[row][col] = mat[row][col]-1;
                }
            }
        }
        
        System.out.println(mat.length == 2);
        System.out.println(mat[0][4] == 4);
        System.out.println(mat[1][2] == -3);


    }
    
}
