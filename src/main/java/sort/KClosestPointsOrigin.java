package sort;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class KClosestPointsOrigin {
    public int[][] kClosest(int[][] points, int K) {
        return Stream.of(points).collect(Collectors.toMap(v -> v, v -> Math.pow(v[0], 2) + Math.pow(v[1], 2)))
                .entrySet().stream()
                .sorted(Comparator.comparing(Map.Entry::getValue))
                .map(Map.Entry::getKey)
                .limit(K)
                .collect(Collectors.toList()).toArray(new int[0][0]);
    }
    public int[][] kClosest2(int[][] points, int K) {
        PriorityQueue<int[]> pointsQueue = new PriorityQueue<int[]>(points.length, (v1, v2) -> v1[0] * v1[0] + v1[1] * v1[1] - v2[0] * v2[0] - v2[1] * v2[1]);
        for(int[] point : points) {
            pointsQueue.add(point);
        }
        List<int[]> result = new ArrayList<>();
        for(int i = 0; i < K; i ++) {
            result.add(pointsQueue.poll());
        }
        return result.toArray(new int[0][0]);
    }
}
