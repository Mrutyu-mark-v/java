
// 33. Spiral Pattern of Numbers

public class j33 {
    public static void main(String[] args) {
        int n = 5;
        int[][] spiral = new int[n][n];
        int val = 1, minCol = 0, maxCol = n - 1, minRow = 0, maxRow = n - 1;
        while (minRow <= maxRow && minCol <= maxCol) {
            for (int i = minCol; i <= maxCol; i++) {
                spiral[minRow][i] = val++;
            }
            minRow++;
            for (int i = minRow; i <= maxRow; i++) {
                spiral[i][maxCol] = val++;
            }
            maxCol--;
            for (int i = maxCol; i >= minCol; i--) {
                spiral[maxRow][i] = val++;
            }
            maxRow--;
            for (int i = maxRow; i >= minRow; i--) {
                spiral[i][minCol] = val++;
            }
            minCol++;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(spiral[i][j] + " ");
            }
            System.out.println();
        }
    }
}
