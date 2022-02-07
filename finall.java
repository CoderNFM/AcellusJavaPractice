public class finall {
    public static void main(String[] args) {
        int[][] mat = new int[3][5];

        for (int row = 0; row < mat.length; row++)
        {
            for(int col = 0; col<mat[0].length; col++)
            {
                mat[row][col] = row +col+1;
            }
        }
        int total = 0;
        for (int row = 0; row < mat.length; row++)
        {
            for(int col = 0; col<mat[0].length; col++)
            {
                total += mat[row][col];
            }
        }
        System.out.println(mat[0].length==5);
        System.out.println(mat[0][2] == 3);
        System.out.println(mat[2][0] == 4);

    }
}
