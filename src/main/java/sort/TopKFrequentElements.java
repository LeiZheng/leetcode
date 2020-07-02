package sort;

import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Long> counters = IntStream.of(nums)
                .boxed().collect(Collectors.groupingBy(v -> v, Collectors.counting()));
        return counters.entrySet().stream()
                .sorted(Comparator.comparing(etr -> etr.getValue() * (-1)))
                .limit(k)
                .mapToInt(Map.Entry::getKey).toArray();
    }
}
