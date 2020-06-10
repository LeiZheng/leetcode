package amazon.arrayAndString;

public class RotateImage {
    public void rotate(int[][] matrix) {
        int size = matrix.length;
        for(int i = 0; i < size / 2; i ++) {
            for(int j = i; j < size - i - 1; j ++) {
                int firstPosVal = matrix[i][j];
                matrix[i][j] = matrix[size -1 -j][i];
                matrix[size -1-j][i] = matrix[size -1-i][size -1-j];
                matrix[size -1-i][size -1-j] = matrix[j][size -1-i];
                matrix[j][size -1-i] = firstPosVal;
            }
        }
    }
}
