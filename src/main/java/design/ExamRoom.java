package design;

import java.util.*;
import java.util.stream.IntStream;

class ExamRoom {
    int size;
    List<Integer> seats = new ArrayList<>();
    int[] dist;
    public ExamRoom(int N) {
        size = N;
        dist = new int[N];
        Arrays.fill(dist, N - 1);
    }

    public int seat() {
        int minIndex = 0;
        int maxDist = Integer.MIN_VALUE;
        for(int i = 0; i < dist.length; i ++) {
            if(maxDist < dist[i]) {
                maxDist = dist[i];
                minIndex = i;
            }
        }

        for(int i = 0; i < size; i ++) {
            dist[i] = Math.min(dist[i], Math.abs(i - minIndex));
        }
        seats.add(minIndex);
        return minIndex;
    }

    public void leave(int p) {
        seats.remove(Integer.valueOf(p));
    }
}
