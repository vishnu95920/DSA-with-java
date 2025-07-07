public class count7 {
    public static int count(int matrix[][], int n, int m) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 7) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int matrix[][] = {
            {4, 7, 8},
            {8, 8, 7}
        };
        int n = matrix.length;         // Number of rows (2)
        int m = matrix[0].length;      // Number of columns (3)
        int result = count(matrix, n, m);
        System.out.println("Number of 7s in the matrix: " + result);
    }
}