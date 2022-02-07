public class two_dimensional {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        int total = 0;

        for(int row = 0; row < mat.length; row++)
        {
            for (int col = 0; col < mat[0].length;col++)
            {
                total += mat[row][col];
            }
        }
        System.out.println(mat[2][3]);
        System.out.println(mat[1][0]);
        System.out.println(mat[3][1]);
        /*int total = 0;

        for (int row = 0; row < mat.length; row++)
        {
            for (int col = 0; col < mat[0].length; col++)
            total += mat[row][col];
        }
        System.out.println(mat.length);
        System.out.println(mat[1][2]);
        System.out.println(total);
        */
    }
}
