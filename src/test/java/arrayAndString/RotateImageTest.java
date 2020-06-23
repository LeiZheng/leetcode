package arrayAndString;

import org.junit.Test;

public class RotateImageTest {
    RotateImage inst = new RotateImage();
    @Test
    public void rotate() {
        int [][] matrix = new int[3][3];
        int val = 1;
        for(int i = 0; i < 3; i ++) {
            for(int j = 0; j < 3; j ++) {
                matrix[i][j] = val ++;
            }
        }
        inst.rotate(matrix);
    }
}