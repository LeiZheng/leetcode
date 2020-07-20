package other;

public class ArrangingCoins {
    public int arrangeCoins(int n) {
        int left = 0;
        int right = n;
        for(; left < right - 1 ; ) {
            int middle = (left + right + 1) / 2;
            int middleTotal = middle * (middle + 1) / 2;
            if(middleTotal == n) {
                return middle;
            }
            else if(middleTotal > n) {
                right = middle;
            }
            else {
                left = middle;
            }
        }
        return left;
    }
}
