package graph;

public class FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int[][] flags = new int[image.length][image[0].length];
        dfs(image, sr,sc, flags, image[sr][sc], newColor);
        return image;
    }

    private void dfs(int[][] image, int sr, int sc, int[][] flags, int oldColor, int newColor) {
        if(sr < 0 || sr >= image.length) return;
        if(sc < 0 || sc >= image[0].length) return;
        if(image[sr][sc] != oldColor) return;
        if(flags[sr][sc] == 1) return;
        flags[sr][sc] = 1;
        image[sr][sc] = newColor;
        dfs(image, sr + 1, sc, flags, oldColor, newColor);
        dfs(image, sr - 1, sc, flags, oldColor, newColor);
        dfs(image, sr  , sc + 1, flags, oldColor, newColor);
        dfs(image, sr , sc - 1, flags, oldColor, newColor);
    }
}
